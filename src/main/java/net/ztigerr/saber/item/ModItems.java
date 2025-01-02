package net.ztigerr.saber.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.ztigerr.saber.Sabers;
import net.ztigerr.saber.item.custom.ChiselItem;

public class ModItems {
    public static final Item PINK_GARNET = regitsterItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = regitsterItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL = regitsterItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    public static final Item CAULIFLOWER = regitsterItem("cauliflower", new Item(new Item.Settings().food(ModFoodComponents.CAULIFOLOWER)));

    public static final Item STARLIGHT_ASHES = regitsterItem("starlight_ashes", new Item(new Item.Settings()));

    private static Item regitsterItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Sabers.MOD_ID, name), item);
    }

    public static void regitsterModItems() {
        Sabers.LOGGER.info("Registering Mod Items for " + Sabers.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}
