package com.thecow275.electrica.items;
import com.thecow275.electrica.electrica;
import com.thecow275.electrica.init.ItemInit;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class BasicItem extends ItemInit {

    public static final RegistryObject<Item> gear_iron = register("gear_iron",
            () -> new Item(new Item.Properties().tab(electrica.elec_tab)));
}
