package kiba.infernal.item;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class ItemMoltenRockPiece extends BaseItem implements IFuelHandler{
    public ItemMoltenRockPiece() {
        super("molten_rock_piece");

    }

    @Override
    public int getBurnTime(ItemStack fuel) {
        if(fuel.getItem() == this){
            return 1600;
        }
        return 0;
    }
}
