import java.util.ArrayList;
public class CookingRecipe{

  private String name;
  private ArrayList<RecipeIngredient> ingredient_list;
  private int num_ingredients;

  public CookingRecipe(String name){
    this.name = name;
    num_ingredients = 0;
    ingredient_list = new ArrayList<RecipeIngredient>();
  }

  public ArrayList<RecipeIngredient> getIngredientList(){
    return ingredient_list;
  }

  public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity){
    for(int i = 0; i < num_ingredients; i++){
      if (ingredient instanceof RecipeIngredient){
        if (ingredient_list.get(i).equals(ingredient)){
          ingredient_list.get(i).setQuantity(quantity);
          return;

        }
      }else{
        if (ingredient.equals(ingredient_list.get(i))){
          ingredient_list.get(i).setQuantity(quantity);
          return;
          
        }
      }
    }
    System.out.println(quantity);
    RecipeIngredient new_ingredient = new RecipeIngredient(ingredient.getName(),
                                                          ingredient.getMeasuringUnit(),
                                                          ingredient.getCaloriesPerUnit(),
                                                          quantity);

    ingredient_list.add(new_ingredient);
    num_ingredients++;
  }

  public RecipeIngredient getRecipeIngredient(Ingredient ingredient){
    for(int i = 0; i < num_ingredients; i++){
      if(ingredient.equals(ingredient_list.get(i))){
        return ingredient_list.get(i);
      }
    }
    return null;
  }

  public RecipeIngredient getRecipeIngredient(String ingredientName){
    for(int i = 0; i < num_ingredients; i++){
      if(ingredientName.equals(ingredient_list.get(i).getName())){
        return ingredient_list.get(i);
      }
    }
    return null;
  }

  public float calculateCalories(){
    float total_calories = 0;
    for (RecipeIngredient i: ingredient_list){
      total_calories += i.getCaloriesPerUnit() * i.getQuantity();
    }
    return total_calories;
  }

  public int getNumberOfIngredients(){
    return num_ingredients;
  }

  public boolean equals(CookingRecipe other){
    for(RecipeIngredient i: other.getIngredientList()){
      if (!i.equals(other)){
        return false;
      }
    }
    return true;
  }

  public String toString(){
    String recipe_string = name + "\n\n";
    for (RecipeIngredient i: ingredient_list){
      recipe_string += i.toString() + "\n";
    }
    return recipe_string;

  }
}
