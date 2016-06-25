package com.thecow275.electrica.items;


import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemModArmor extends ItemArmor {
    public ItemModArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) {
        super(material, renderIndex, armorType);

        this.setUnlocalizedName(unlocalizedName);
    }
}
