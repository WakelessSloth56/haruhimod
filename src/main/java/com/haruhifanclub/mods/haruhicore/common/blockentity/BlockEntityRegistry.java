package com.haruhifanclub.mods.haruhicore.common.blockentity;

import com.haruhifanclub.mods.haruhicore.HaruhiCore;
import com.haruhifanclub.mods.haruhicore.common.block.BlockRegistry;
import com.haruhifanclub.mods.haruhicore.common.blockentity.impl.SosBadgeSlabBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockEntityRegistry {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, HaruhiCore.MOD_ID);


    public static final RegistryObject<BlockEntityType<SosBadgeSlabBlockEntity>> SOS_BADGE_SLAB_BLOCK_ENTITY =
        BLOCK_ENTITIES.register("sos_badge_slab", () -> BlockEntityType.Builder.of(SosBadgeSlabBlockEntity::new, BlockRegistry.SOS_BADGE_SLAB_BLOCK.get()).build(null));

}
