package com.globalista.tusabemod.additions;

import com.globalista.tusabemod.util.TusabeRegister;
import net.minecraft.item.Item;

import static com.globalista.tusabemod.util.TusabeRegister.*;

public class TusabeItems {

    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot", new Item(new Item.Settings().fireproof()));
    public static final Item MYTHRIL_UPGRADE = registerItem("mythril_upgrade", new Item(new Item.Settings()));

    static {
        registerEquipmentSet("copper", TusabeArmorMaterials.COPPER, TusabeToolMaterials.COPPER, false);
        registerEquipmentSet("steel", TusabeArmorMaterials.STEEL, TusabeToolMaterials.STEEL, false);
        registerEquipmentSet("mythril", TusabeArmorMaterials.MYTHRIL, TusabeToolMaterials.MYTHRIL, true);
    }

    public static void callItems(){};
}
