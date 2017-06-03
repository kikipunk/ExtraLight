package com.kikipunk.ExtraLight;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Kikipunk on 03/06/2017.
 */
public class ClientProxy {

    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(ExtraLight.modId + ":" + id, "inventory"));
    }
}
