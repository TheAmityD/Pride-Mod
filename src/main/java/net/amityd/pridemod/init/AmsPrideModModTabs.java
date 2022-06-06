
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.amityd.pridemod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AmsPrideModModTabs {
	public static CreativeModeTab TAB_PRIDETAB;

	public static void load() {
		TAB_PRIDETAB = new CreativeModeTab("tabpridetab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.END_ROD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
