package WayofTime.alchemicalWizardry.api.alchemy.energy;

import net.minecraftforge.fluids.FluidTankInfo;

public interface IReagentContainer 
{
	public ReagentStack getReagent();

    public int getReagentStackAmount();

    public int getCapacity();

    public int fill(ReagentStack resource, boolean doFill);

    public ReagentStack drain(int maxDrain, boolean doDrain);
    
    public ReagentContainerInfo getInfo();
}
