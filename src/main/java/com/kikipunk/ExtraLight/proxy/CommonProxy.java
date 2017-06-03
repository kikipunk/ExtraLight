package com.kikipunk.extralight.proxy;

import com.kikipunk.extralight.blocks.ModBlocks;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Kikipunk on 03/06/2017.
 */
public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {

        ModBlocks.createBlocks();

    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
