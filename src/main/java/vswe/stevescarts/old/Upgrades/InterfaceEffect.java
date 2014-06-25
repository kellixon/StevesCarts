package vswe.stevescarts.old.Upgrades;

import net.minecraft.inventory.ICrafting;
import vswe.stevescarts.old.Containers.ContainerUpgrade;
import vswe.stevescarts.old.Interfaces.GuiUpgrade;
import vswe.stevescarts.old.TileEntities.TileEntityUpgrade;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public abstract class InterfaceEffect extends BaseEffect {


	public InterfaceEffect() {
		super();
	}

	@SideOnly(Side.CLIENT)
	public void drawForeground(TileEntityUpgrade upgrade, GuiUpgrade gui) {}
	
	@SideOnly(Side.CLIENT)
	public void drawBackground(TileEntityUpgrade upgrade, GuiUpgrade gui, int x, int y) {}
	
	@SideOnly(Side.CLIENT)
	public void drawMouseOver(TileEntityUpgrade upgrade, GuiUpgrade gui, int x, int y) {}

	public void checkGuiData(TileEntityUpgrade upgrade, ContainerUpgrade con, ICrafting crafting, boolean isNew) {}
	
	public void receiveGuiData(TileEntityUpgrade upgrade, int id, short data) {}	
	
	
	protected void drawMouseOver(GuiUpgrade gui, String str, int x, int y, int[] rect) {
		if (gui.inRect(x-gui.getGuiLeft(),y-gui.getGuiTop(),rect)) {
			gui.drawMouseOver(str, x-gui.getGuiLeft(), y-gui.getGuiTop());
		}	
	}	
	

	
	
}