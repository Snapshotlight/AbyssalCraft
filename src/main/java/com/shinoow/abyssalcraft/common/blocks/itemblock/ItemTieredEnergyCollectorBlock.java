/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2016 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.common.blocks.itemblock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class ItemTieredEnergyCollectorBlock extends ItemMetadataPEContainerBlock {

	public ItemTieredEnergyCollectorBlock(Block b) {
		super(b);

	}

	@Override
	public int getMaxEnergy(ItemStack stack) {
		int base = 1000;
		switch(stack.getItemDamage()){
		case 0:
			return  (int) (base * 1.5);
		case 1:
			return base * 2;
		case 2:
			return (int) (base * 2.5);
		case 3:
			return base * 3;
		default:
			return base;
		}
	}
}
