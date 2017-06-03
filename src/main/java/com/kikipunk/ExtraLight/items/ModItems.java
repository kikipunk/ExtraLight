package com.kikipunk.ExtraLight.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item torch;
	
	public static void createItems() {
		torch = register(new torch("ingot_lorexium", "ingo_lorexium"));
	}
	
	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);
		
		if(item instanceof ItemModelProvider) {
			((ItemModelProvider)item).registerItemModel(item);
		}
		
		if(item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}
		
		return item;
	}
}
