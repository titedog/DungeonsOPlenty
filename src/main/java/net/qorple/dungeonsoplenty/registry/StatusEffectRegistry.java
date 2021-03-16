package net.qorple.dungeonsoplenty.registry;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.qorple.dungeonsoplenty.DungeonsOPlenty;
import net.qorple.dungeonsoplenty.content.effects.FrozenStatusEffect;

public class StatusEffectRegistry {
    public static final FrozenStatusEffect FROZEN_EFFECT = new FrozenStatusEffect();

    public static void initEffects() {
        Registry.register(Registry.STATUS_EFFECT, new Identifier(DungeonsOPlenty.MOD_ID, "frozen"), FROZEN_EFFECT);
    }
}
