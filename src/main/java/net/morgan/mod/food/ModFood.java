package net.morgan.mod.food;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class ModFood {

    public static final FoodProperties COOKED_RICE = new FoodProperties.Builder().nutrition(7).saturationModifier(0.8f).build();

    public static final Consumable COOKED_RICE_CONSUMABLE = Consumables.defaultFood().consumeSeconds(1f).
            onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.LUCK, 200), 0.15f)).build();
}
