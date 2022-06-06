
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.amityd.pridemod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.amityd.pridemod.AmsPrideModMod;

public class AmsPrideModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AmsPrideModMod.MODID);
	public static final RegistryObject<Item> RAINBOWFLAG = block(AmsPrideModModBlocks.RAINBOWFLAG, AmsPrideModModTabs.TAB_PRIDETAB);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
