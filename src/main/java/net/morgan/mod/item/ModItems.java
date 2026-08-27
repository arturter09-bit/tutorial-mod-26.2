package net.morgan.mod.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTabOutput;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.morgan.mod.TutorialMod;
import net.morgan.mod.block.ModBlocks;
import net.morgan.mod.food.ModFood;

import java.util.function.Function;

public class ModItems {

    public static final Item RICE = registerItem("rice", Item::new);
    public static final Item BOWL_OF_RICE = registerItem("bowl_of_rice", Item::new);
    public static final Item COOKED_RICE = registerItem("cooked_rice", properties -> new Item(properties.food(ModFood.COOKED_RICE)));


    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name), function.apply(new Item.Properties().
                setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(TutorialMod.MOD_ID, name)))));
    }

    public static void registerModItems(){
        TutorialMod.LOGGER.info("Registering Mod Items for" + TutorialMod.MOD_ID);

        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(RICE);
            output.accept(BOWL_OF_RICE);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FOOD_AND_DRINKS).register(output -> {
            output.accept(COOKED_RICE);
        });
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.NATURAL_BLOCKS).register(output -> {
            output.accept(ModBlocks.RICE_BLOCK);
        });
    }
}


