package com.haruhifanclub.mods.haruhicore.common.item.impl;

import com.haruhifanclub.mods.haruhicore.common.item.ItemManager;
import com.haruhifanclub.mods.haruhicore.common.itemgroup.ItemGroupManager;
import org.auioc.mods.ahutils.utils.game.EffectUtils;
import org.auioc.mods.ahutils.utils.game.HArmorMaterial;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class YukisWizardCloakItem extends ArmorItem {

    public YukisWizardCloakItem() {
        super(
            new HArmorMaterial("yukis_wizard_cloak")
                .setDurability(708)
                .setDefense(10)
                .setToughness(4)
                .setEnchantmentValue(66)
                .setRepairIngredient(() -> {
                    return Ingredient.of(ItemManager.REINFORCEMENT_STONE_ITEM.get());
                }),
            EquipmentSlotType.CHEST,
            new Item.Properties()
                .tab(ItemGroupManager.itemGroup)
        );
    }

    // TODO Custom armor model

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int index, boolean selected) {
        if (world.isClientSide) {
            return;
        }

        PlayerEntity player = ((PlayerEntity) entity);

        ItemStack chestItemStack = player.getItemBySlot(EquipmentSlotType.CHEST);
        if (!(chestItemStack.getItem()).equals(this)) {
            return;
        }

        if (!player.hasEffect(Effects.ABSORPTION)) {
            EffectUtils.addEffect(player, 22, 840, 2);
        }

    }

}
