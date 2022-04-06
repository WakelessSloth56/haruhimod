package com.haruhifanclub.mods.haruhicore.common.item.impl;

import com.haruhifanclub.mods.haruhicore.api.item.IHCBlessedItem;
import com.haruhifanclub.mods.haruhicore.common.block.HCBlocks;
import com.haruhifanclub.mods.haruhicore.common.item.HCItems;
import com.haruhifanclub.mods.haruhicore.common.itemgroup.HCCreativeModeTabs;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class DanchouConeBlockItem extends BlockItem implements IHCBlessedItem {

    public DanchouConeBlockItem() {
        super(
            HCBlocks.DANCHOU_CONE_BLOCK.get(),
            new Item.Properties()
                .tab(HCCreativeModeTabs.TAB_MAIN)
        );
    }

    public static boolean isEquipped(Player player) {
        return (player.getItemBySlot(EquipmentSlot.HEAD).getItem()).equals(HCItems.DANCHOU_CONE_BLOCK.get());

    }

}
