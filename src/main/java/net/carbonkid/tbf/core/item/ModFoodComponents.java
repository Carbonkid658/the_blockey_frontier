package net.carbonkid.tbf.core.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent BEEN_CAN = new FoodComponent.Builder().hunger(5)
            .saturationModifier(0.5f)
            .build();

    public static final FoodComponent BEEN = new FoodComponent.Builder().hunger(1)
            .saturationModifier(0.05f)
            .build();

    public static final FoodComponent BISCUIT = new FoodComponent.Builder().hunger(3)
            .saturationModifier(0.25f)
            .build();
}
