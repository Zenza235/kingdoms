package com.zenza.kingdoms.items;

import com.zenza.kingdoms.KingdomsMod;
import com.zenza.kingdoms.blocks.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, KingdomsMod.MODID);

    public static final RegistryObject<BlockItem> BLOCK_ITEM_TERRITORY_TABLE = ITEMS.register("territory_table", () -> new BlockItem(ModBlocks.BLOCK_TERRITORY_TABLE.get(), new Item.Properties()));
}
