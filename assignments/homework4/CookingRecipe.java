package Homework4;


import java.util.ArrayList;

public class CookingRecipe {
    private String name;
    private ArrayList<RecipeIngredient> ingredients = new ArrayList<RecipeIngredient>;

    public CookingRecipe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addOrUpdateRecipeINgredient(Ingredient ingredient, float quantity)
        for(RecipeIngredient r:ingredients)
            if(r.getName().equals(ingredient.getName())){
                r.setQuantity(quantity);
                return;
            }
      /*  for (int i = 0; i< ingredients.size(); i++)
            if(ingredients.get(i).getName().equals(ingredient.getName())) {
                ingredients.get(i).setQuantity(quantity);
                return
            
        }*/

        ingredients.add(new RecipeIngredient(
                    ingredient.getName(),
                    ingredient.getMeasuringUnit(),
                    ingredient.getCaloriesPerUnit(),          
                    quantity
                    ));
