package jaiz.desertupdate.item.custom;

import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {

    OBSIDIAN_DAGGER(5, 400, 0.4f, 4.0f, 8, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),
    SHARP_OBSIDIAN_DAGGER(5, 200, 0.4f, 6.0f, 10, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),
    WEDGE_OBSIDIAN_DAGGER(5, 600, 0.4f, 2.0f, 12, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),

    OBSIDIAN_SWORD(5, 1000, 0.4f, 6.0f, 12, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),
    SHARP_OBSIDIAN_SWORD(5, 800, 0.4f, 8.0f, 16, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),
    WEDGE_OBSIDIAN_SWORD(5, 1500, 0.4f, 6.0f, 18, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),

    WEDGE_REGULAR_OBSIDIAN_SWORD(5, 1300, 0.4f, 6.0f, 12, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),
    SHARP_WEDGE_OBSIDIAN_SWORD(5, 1050, 0.4f, 4.0f, 12, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),
    SHARP_REGULAR_OBSIDIAN_SWORD(5, 900, 0.4f, 6.0f, 12, () -> Ingredient.ofItems(Blocks.OBSIDIAN)),

    BATTERED(5, 712, 15f, 4.0f, 20, () -> Ingredient.ofItems(Items.COPPER_INGOT)),

    // Tool Material Stuff Goes here
    ;

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
