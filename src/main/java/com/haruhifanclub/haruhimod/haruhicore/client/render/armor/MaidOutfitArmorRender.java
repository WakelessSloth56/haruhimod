package com.haruhifanclub.haruhimod.haruhicore.client.render.armor;

import com.haruhifanclub.haruhimod.haruhicore.client.model.armor.MaidOutfitArmorModel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.IItemRenderProperties;

@OnlyIn(Dist.CLIENT)
public class MaidOutfitArmorRender implements IItemRenderProperties {

    public static final MaidOutfitArmorRender INSTANCE = new MaidOutfitArmorRender();

    @Override
    @OnlyIn(Dist.CLIENT)
    public HumanoidModel<?> getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> _default) {
        EntityModelSet models = Minecraft.getInstance().getEntityModels();
        ModelPart root = models.bakeLayer(MaidOutfitArmorModel.LAYER_LOCATION);
        return new MaidOutfitArmorModel(root);
    }

}
