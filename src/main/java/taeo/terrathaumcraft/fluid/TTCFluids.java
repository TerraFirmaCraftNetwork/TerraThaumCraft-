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

package taeo.terrathaumcraft.fluid;


import com.bioxx.tfc.Core.FluidBaseTFC;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class TTCFluids {

    public static final Fluid AIRSLURRY = new FluidBaseTFC("airslurry").setBaseColor(thaumcraft.common.blocks.BlockCustomOreItem.colors[1]);
    public static final Fluid FIRESLURRY = new FluidBaseTFC("fireslurry").setBaseColor(thaumcraft.common.blocks.BlockCustomOreItem.colors[2]);
    public static final Fluid EARTHSLURRY = new FluidBaseTFC("earthslurry").setBaseColor(thaumcraft.common.blocks.BlockCustomOreItem.colors[4]);
    public static final Fluid WATERSLURRY = new FluidBaseTFC("waterslurry").setBaseColor(thaumcraft.common.blocks.BlockCustomOreItem.colors[3]);
    public static final Fluid ENTROPYSLURRY = new FluidBaseTFC("entropyslurry").setBaseColor(thaumcraft.common.blocks.BlockCustomOreItem.colors[6]);
    public static final Fluid ORDERSLURRY = new FluidBaseTFC("orderslurry").setBaseColor(thaumcraft.common.blocks.BlockCustomOreItem.colors[5]);

    public static void registerFluids()
    {
        FluidRegistry.registerFluid(AIRSLURRY);
        FluidRegistry.registerFluid(FIRESLURRY);
        FluidRegistry.registerFluid(EARTHSLURRY);
        FluidRegistry.registerFluid(WATERSLURRY);
        FluidRegistry.registerFluid(ORDERSLURRY);
        FluidRegistry.registerFluid(ENTROPYSLURRY);


    }
}
