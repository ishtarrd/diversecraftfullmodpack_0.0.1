package com.ishtar.modpack.items;

import com.ishtar.modpack.ModPack;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ModPack.MOD_ID);


    //ITEMS
    public static final RegistryObject<Item> STEEL = ITEMS.register( "steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> ESMERALD = ITEMS.register( "esmerald",
            () -> new Item(new Item.Properties()));

    //ARMOR
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


    //TOOLS
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.STEEL, 3, -2.4f))));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.STEEL, 1, -2.8f))));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.STEEL, 1.5f, -3.0f))));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.STEEL, 5, -3.2f))));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.STEEL, 1, -3.0f))));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
