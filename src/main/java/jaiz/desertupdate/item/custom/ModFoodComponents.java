package jaiz.desertupdate.item.custom;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents{

    public static final FoodComponent RARE_SPICES = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200), 0.9f).build();
    public static final FoodComponent GOURMET_MEAL = new FoodComponent.Builder().hunger(12).saturationModifier(1.4f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 0.1f).build();
}
