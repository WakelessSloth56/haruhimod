package com.haruhifanclub.mods.haruhicore.common.damagesource;

import com.haruhifanclub.mods.haruhicore.api.damagesource.IHCDamageSource;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.damagesource.IndirectEntityDamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class MikuruBeamDamageSource extends IndirectEntityDamageSource implements IHCDamageSource {

    public MikuruBeamDamageSource(Entity target, Entity source) {
        super("mikuru_beam", target, source);
    }

    public static MikuruBeamDamageSource build(LivingEntity target, LivingEntity source) {
        return (MikuruBeamDamageSource) new MikuruBeamDamageSource(target, source).bypassArmor().bypassMagic();
    }


    @Override
    public Component getLocalizedDeathMessage(LivingEntity target) {
        return new TranslatableComponent(messageKey + this.msgId, target.getDisplayName(), this.getEntity().getDisplayName());
    }

    @Override
    public String toString() {
        return String.format("MikuruBeamDamageSource (target=%s, source=%s)", this.getDirectEntity(), this.getEntity());
    }

    @Override
    public boolean scalesWithDifficulty() {
        return false;
    }

    @Override
    public boolean isBlessedDamage() {
        return true;
    }

}
