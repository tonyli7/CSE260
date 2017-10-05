public class TestRecipeBook{
  public static void main(String[] args){

    CookingRecipe c = new CookingRecipe("Hard-Boiled Eggs");

    RecipeIngredient r = new RecipeIngredient("Raw Egg", "Egg", 60, 1);
    Ingredient i = new Ingredient("Salt", "g", 1);

    c.addOrUpdateRecipeIngredient(r, 1);
    c.addOrUpdateRecipeIngredient(i, 5);
    c.addOrUpdateRecipeIngredient(i, 6);

    System.out.println(c);
    System.out.println(c.calculateCalories());
    System.out.println(c.getNumberOfIngredients());
  }
}
