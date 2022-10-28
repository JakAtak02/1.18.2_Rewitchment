package net.jakatak.rewitchment.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab REWITCHMENT_TAB = new CreativeModeTab("rewitchmenttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SILVER_INGOT.get());
        }
    };
}
