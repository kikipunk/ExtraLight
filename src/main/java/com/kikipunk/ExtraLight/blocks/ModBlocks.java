package com.kikipunk.ExtraLight.blocks;


import com.kikipunk.ExtraLight.ExtraLight;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block torch;

    public static void createBlocks() {
        register(torch = new lamp(true));
        register(torch = new lamp(false));
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock);

        ExtraLight.proxy.registerItemRenderer(itemBlock, 0, block.getUnlocalizedName());

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }
}
