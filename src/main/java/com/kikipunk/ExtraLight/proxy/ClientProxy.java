package com.kikipunk.extralight.proxy;


import com.kikipunk.extralight.ExtraLight;
import com.kikipunk.extralight.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Kikipunk on 03/06/2017.
 */
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);

        addBlockRender(ModBlocks.torch_on, 0, ExtraLight.modId + ":torch_on", "inventory");
        addBlockRender(ModBlocks.torch_off, 0, ExtraLight.modId + ":torch_off", "inventory");
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }

    private static void addBlockRender(Block block, int metadata, String blockString, String location) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), metadata, new ModelResourceLocation(blockString, location));
    }

    private static void addItemRender(Item item, int metadata, String blockString, String location) {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(blockString, location));
    }
}
