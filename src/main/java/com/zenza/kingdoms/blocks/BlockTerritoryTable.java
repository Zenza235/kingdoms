package com.zenza.kingdoms.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

/**
 * BlockTerritoryTable -- primary block used to establish a player's territories.
 * It takes up a 2x3 area and acts as the center of a player's base.
 * <p>
 * When interacted with, it opens a GUI where the player can select an area of chunks to declare as
 * their territory. After confirming, the player is denoted as the "owner" of the territory and is the
 * only one who can configure it.
 * </p>
 * <p>
 * Features: (WIP) <br>
 * - Configuring claimed chunks <br>
 * - Transferring ownership to another player <br>
 * - Viewing surrounding territories (other players, world generated?)<br>
 * - Declaring war on other territories<br>
 * - 3D view of territories...? <br>
 * </p>
 * @author Zenza
 */
public class BlockTerritoryTable extends Block {

    public BlockTerritoryTable() {
        super(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion());
    }
}
