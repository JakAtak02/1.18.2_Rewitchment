package net.jakatak.rewitchment.util;

import net.jakatak.rewitchment.Rewitchment;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;


public class ModTags {
    public static class Items {
        public static final TagKey<Item> SILVER_INGOTS = forgeTag("ingots/silver");
        public static final TagKey<Item> SILVER_NUGGETS = forgeTag("nuggets/silver");
        public static final TagKey<Item> SILVER_BLOCKS = forgeTag("storage_blocks/silver");
        public static final TagKey<Item> RAW_SILVERS = forgeTag("raw_materials/silver");
        public static final TagKey<Item> RAW_SILVER_BLOCKS = forgeTag("storage_blocks/raw_silver");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Rewitchment.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
