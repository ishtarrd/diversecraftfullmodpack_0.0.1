package com.ishtar.modpack.items;

import com.ishtar.modpack.ModPack;
import com.ishtar.modpack.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModPack.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STEEL_ITEMS_TAB = CREATIVE_MODE_TABS.register("steel_items_tab",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.STEEL.get()))
                    .title(Component.translatable("creativetab.fullmodpack.steel_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //Ores
                        output.accept(ModItems.STEEL.get());
                        output.accept(ModItems.ESMERALD.get());

                        //Armor
                        output.accept(ModItems.STEEL_BOOTS.get());
                        output.accept(ModItems.STEEL_LEGGINGS.get());
                        output.accept(ModItems.STEEL_CHESTPLATE.get());
                        output.accept(ModItems.STEEL_HELMET.get());

                        //Tools
                        output.accept(ModItems.STEEL_SWORD.get());
                        output.accept(ModItems.STEEL_PICKAXE.get());
                        output.accept(ModItems.STEEL_HOE.get());
                        output.accept(ModItems.STEEL_AXE.get());
                        output.accept(ModItems.STEEL_SHOVEL.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> STEEL_BLOCKS_TAB = CREATIVE_MODE_TABS.register("steel_blocks_tab",
            ()-> CreativeModeTab.builder().icon(()->new ItemStack(ModBlocks.STEEL_BLOCK.get()))
                    .withTabsBefore(STEEL_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.fullmodpack.steel_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.ESMERALD_ORE.get());

                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
