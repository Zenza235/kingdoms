package com.zenza.kingdoms.blocks;

import com.zenza.kingdoms.KingdomsMod;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, KingdomsMod.MODID);

    public static final RegistryObject<Block> BLOCK_TERRITORY_TABLE = BLOCKS.register("territory_table", BlockTerritoryTable::new);
}
