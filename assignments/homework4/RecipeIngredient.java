package Homework4;

public class RecipeIngredient extends Ingredient {
    public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity)  {
        super(name, measuringUnit, caloiresPerUnit);
        this.quantity = quantity;
    }

    public float float getQuantity() {
        this.quantity = quantity;
    }

    public String tostring() {
        return super.toString() + "(" + quantity  + ")";
    }

    public boolean equals(Object o) {
        if(o instanceof RecipeIngredient)
            return super.equals(o) && ((RecipeIngredient)o).quantity == quantity
        return false;
    }
}
