package com.globalista.tusabemod.util;

import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

import static com.globalista.tusabemod.Tusabe.MODID;

public class TusabeRegister {

    public static List<Item> equipments = new ArrayList<Item>();

    public static Identifier id(String name){
        return Identifier.of(MODID, name);
    }

    public static void registerEquipmentSet(String name, RegistryEntry<ArmorMaterial> material, ToolMaterial material1, boolean fireproof){
        if(fireproof){
            registerEquipment(name + "_helmet", new ArmorItem(material, ArmorItem.Type.HELMET, new Item.Settings().fireproof()));
            registerEquipment(name + "_chestplate", new ArmorItem(material, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()));
            registerEquipment(name + "_leggings", new ArmorItem(material, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()));
            registerEquipment(name + "_boots", new ArmorItem(material, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()));

            registerEquipment(name + "_sword", new SwordItem(material1, new Item.Settings().fireproof()));
            registerEquipment(name + "_pickaxe", new PickaxeItem(material1, new Item.Settings().fireproof()));
            registerEquipment(name + "_axe", new AxeItem(material1, new Item.Settings().fireproof()));
            registerEquipment(name + "_shovel", new ShovelItem(material1, new Item.Settings().fireproof()));
            registerEquipment(name + "_hoe", new HoeItem(material1, new Item.Settings().fireproof()));
        } else {
            registerEquipment(name + "_helmet", new ArmorItem(material, ArmorItem.Type.HELMET, new Item.Settings()));
            registerEquipment(name + "_chestplate", new ArmorItem(material, ArmorItem.Type.CHESTPLATE, new Item.Settings()));
            registerEquipment(name + "_leggings", new ArmorItem(material, ArmorItem.Type.LEGGINGS, new Item.Settings()));
            registerEquipment(name + "_boots", new ArmorItem(material, ArmorItem.Type.BOOTS, new Item.Settings()));

            registerEquipment(name + "_sword", new SwordItem(material1, new Item.Settings()));
            registerEquipment(name + "_pickaxe", new PickaxeItem(material1, new Item.Settings()));
            registerEquipment(name + "_axe", new AxeItem(material1, new Item.Settings()));
            registerEquipment(name + "_shovel", new ShovelItem(material1, new Item.Settings()));
            registerEquipment(name + "_hoe", new HoeItem(material1, new Item.Settings()));
        }
    }

    public static void registerEquipment(String name, Item item){
        Registry.register(Registries.ITEM, id(name), item);
        equipments.add(item);
    }

    public static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, id(name), item);
    }

    public static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, id(name), new BlockItem(block, new Item.Settings()));
    }

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, id(name), block);
    }


}
