package com.kikipunk.extralight.blocks;


import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block torch_on;
    public static Block torch_off;
    
    public static void createBlocks() {
        register(torch_on = new BlockLamp(true));
        register(torch_off = new BlockLamp(false));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
