package net.qorple.dungeonsoplenty.content.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class FrozenStatusEffect extends StatusEffect {
    public FrozenStatusEffect() {
        super(StatusEffectType.HARMFUL, 0x8CB3FE);
        this.addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "1312ec5d-918a-43ec-8c87-d910f2c75baa", -0.2, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {

    }
}
