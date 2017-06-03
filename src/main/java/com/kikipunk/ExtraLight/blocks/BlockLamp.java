package com.kikipunk.extralight.blocks;

import com.kikipunk.extralight.ExtraLight;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Kikipunk on 03/06/2017.
 */
public class BlockLamp extends Block {
    public BlockLamp(boolean isOn) {
        super(Material.GOURD);

        setCreativeTab(ExtraLight.tabextralight);

        if (isOn) {
            this.setUnlocalizedName("torch_on");
            this.setRegistryName("torch_on");
        } else {
            this.setUnlocalizedName("torch_off");
            this.setRegistryName("torch_off");
        }
    }
}
