package com.ishtar.modpack.items;

import com.ishtar.modpack.ModPack;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModPack.MOD_ID);

    public static final RegistryObject<Item> STEEL = ITEMS.register( "steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet",
            ()-> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL,ArmorItem.Type.HELMET,
                    new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(25))));

    public static final RegistryObject<Item> STEEL_CHESTPLATE= ITEMS.register("steel_chestplate",
            ()-> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL,ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(25))));

    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings",
            ()-> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL,ArmorItem.Type.LEGGINGS,
                    new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(25))));

    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots",
            ()-> new ArmorItem(ModArmorMaterials.STEEL_ARMOR_MATERIAL,ArmorItem.Type.BOOTS,
                    new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(25))));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
