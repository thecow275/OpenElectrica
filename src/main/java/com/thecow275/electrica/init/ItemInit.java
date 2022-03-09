package com.thecow275.electrica.init;


import com.google.common.base.Supplier;

import com.thecow275.electrica.electrica;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            electrica.MOD_ID);

    public static final RegistryObject<Item> eletab_item = register("eletab_item",
            () -> new Item(new Item.Properties().tab(electrica.elec_tab)));

    public static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);

    }

}
