package com.globalista.tusabemod.additions;

import com.google.common.base.Suppliers;
import java.util.Objects;
import java.util.function.Supplier;
import net.minecraft.block.Block;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

public enum TusabeToolMaterials implements ToolMaterial {

    COPPER(BlockTags.INCORRECT_FOR_IRON_TOOL, 200, 5.0F, 2.0F, 12, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }),
    STEEL(BlockTags.INCORRECT_FOR_IRON_TOOL, 320, 7.0F, 2.5F, 14, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{TusabeItems.STEEL_INGOT});
    }),
    MYTHRIL(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3021, 11.0F, 5.0F, 17, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{TusabeItems.MYTHRIL_INGOT});
    });


    private final TagKey<Block> inverseTag;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private TusabeToolMaterials(final TagKey inverseTag, final int itemDurability, final float miningSpeed, final float attackDamage, final int enchantability, final Supplier repairIngredient) {
        this.inverseTag = inverseTag;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        Objects.requireNonNull(repairIngredient);
        this.repairIngredient = (Supplier<Ingredient>) Suppliers.memoize(repairIngredient::get);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public TagKey<Block> getInverseTag() {
        return this.inverseTag;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }

}
