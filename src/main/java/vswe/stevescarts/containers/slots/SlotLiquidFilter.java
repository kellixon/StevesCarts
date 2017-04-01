package vswe.stevescarts.containers.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;
import vswe.stevescarts.helpers.storages.TransferHandler;

public class SlotLiquidFilter extends SlotBase implements ISpecialItemTransferValidator {
	public SlotLiquidFilter(final IInventory iinventory, final int i, final int j, final int k) {
		super(iinventory, i, j, k);
	}

	@Override
	public boolean isItemValidForTransfer(@Nonnull ItemStack item, final TransferHandler.TRANSFER_TYPE type) {
		return false;
	}

	@Override
	public boolean isItemValid(@Nonnull ItemStack itemstack) {
		return isItemStackValid(itemstack);
	}

	public static boolean isItemStackValid(@Nonnull ItemStack itemstack) {
		return FluidContainerRegistry.isFilledContainer(itemstack);
	}

	@Override
	public int getSlotStackLimit() {
		return 1;
	}
}
