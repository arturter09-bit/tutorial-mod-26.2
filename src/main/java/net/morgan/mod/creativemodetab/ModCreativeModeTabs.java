package net.morgan.mod.creativemodetab;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.morgan.mod.TutorialMod;
import net.morgan.mod.block.ModBlocks;
import net.morgan.mod.item.ModItems;

public class ModCreativeModeTabs {

    public static final CreativeModeTab RICE_ITEM_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, "rice_items"),
            FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RICE))
                    .title(Component.translatable("creativemodetab.mod.rice_items"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RICE);
                        output.accept(ModItems.BOWL_OF_RICE);
                        output.accept(ModBlocks.RICE_BLOCK);


                    }).build());

    public static void registerModCreativeTabs() {
        TutorialMod.LOGGER.info("Registering ModCreativeModeTabs " + TutorialMod.MOD_ID);
    }
}
