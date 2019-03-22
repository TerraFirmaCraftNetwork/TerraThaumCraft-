/*
 *     Copyright 2019 TaeoGDev
 *
 *     This file is part of TerraThaumcraft.
 *
 *     TerraThaumcraft is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     TerraThaumcraft is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with TerraThaumcraft.  If not, see <https://www.gnu.org/licenses/>.
 */

package taeo.terrathaumcraft.block;

import com.bioxx.tfc.Blocks.Vanilla.BlockTFCFence2;
import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class BlockTFCFence2E extends BlockTFCFence2 {
    public BlockTFCFence2E(String str, Material mat)
    {
        super(str, mat);
        String[] tempnames = new String[woodNames.length + 2];
        for(int i = 0; i<woodNames.length; i++)
        {
            tempnames[i] = woodNames[i];
        }
        tempnames[woodNames.length] = "greatwood";
        tempnames[woodNames.length+1] = "silverwood";
        woodNames = tempnames;
        iconsPost = new IIcon[woodNames.length];
        iconsPostTop = new IIcon[woodNames.length];
    }
}
