package com.kikipunk.ExtraLight;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ExtraLight.modId, name = ExtraLight.name, version = ExtraLight.version)
public class ExtraLight {

    public static final String modId = "extralight";
    public static final String name = "Extra Light";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static ExtraLight instance;

    @SidedProxy(serverSide = "com.kikipunk.ExtraLight.CommonProxy", clientSide = "com.kikipunk.ExtraLight.ClientProxy")
    public static CommonProxy proxy;

    public static final CreativeTabs tabextralight = new CreativeTabs("Extra Light") {
        @Override public ItemStack getTabIconItem() {
            return new ItemStack(ModItems.shieldLorexium);
        }
    };

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        System.out.println(name + " is loading!");
        ModItems.createItems();
        ModBlocks.createBlocks();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
