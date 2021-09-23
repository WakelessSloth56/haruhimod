package com.haruhifanclub.mods.haruhicore;

import com.haruhifanclub.mods.haruhicore.common.config.CommonConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(HaruhiCore.MOD_ID)
public class HaruhiCore {
    public static final String MOD_ID = "haruhicore";

    public HaruhiCore() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfig.CONFIG);

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        final IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;

        modSetup(modEventBus);
        forgeSetup(forgeEventBus);
    }

    private void modSetup(final IEventBus modEventBus) {
        com.haruhifanclub.mods.haruhicore.common.item.ItemRegistry.ITEMS.register(modEventBus);
        com.haruhifanclub.mods.haruhicore.common.block.BlockRegistry.BLOCKS.register(modEventBus);
        com.haruhifanclub.mods.haruhicore.common.sound.SoundEventRegistry.SOUND_EVENTS.register(modEventBus);
        com.haruhifanclub.mods.haruhicore.common.tileentity.TileEntityRegistry.TILE_ENTITIES.register(modEventBus);
        com.haruhifanclub.mods.haruhicore.common.advancement.CriterionRegistry.register();
        modEventBus.register(com.haruhifanclub.mods.haruhicore.common.network.HCPacketHandler.class);
    }

    private void forgeSetup(final IEventBus forgeEventBus) {}
}
