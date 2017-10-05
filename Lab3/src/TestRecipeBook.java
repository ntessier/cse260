
public class TestRecipeBook {
	public static void main(String[] args)
	{
		Ingredient i1 = new Ingredient("Beans", "Cup", 120);
		Ingredient i2 = new Ingredient("Cheese", "Pound", 100);
		Ingredient i3 = new Ingredient("Celery", "Diced, Cup", 20);
		Ingredient i4 = new Ingredient("Beef", "Pound", 500);
		Ingredient i5 = new Ingredient("Milk", "Ounce", 30);
		RecipeIngredient rBeans = new RecipeIngredient(i1, 10);
		RecipeIngredient rCheese = new RecipeIngredient(i2, 2);
		RecipeIngredient rCelery = new RecipeIngredient(i3, 5);
		RecipeIngredient rBeef = new RecipeIngredient(i4, 1);
		RecipeIngredient rMilk = new RecipeIngredient(i5, 16);
	    
		CookingRecipe c1 = new CookingRecipe("Cheesy Beans");
		c1.addOrUpdateRecipeIngredient(i1, 10);
		c1.addOrUpdateRecipeIngredient(i2, 2);
		c1.addOrUpdateRecipeIngredient(i5, 16);
		CookingRecipe c2 = new CookingRecipe("BeefCelery");
		c2.addOrUpdateRecipeIngredient(i4, 1);
		c2.addOrUpdateRecipeIngredient(i3, 5);
		c2.addOrUpdateRecipeIngredient(i5, 16);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("c1.getRecipeIngredient(Beans)" + c1.getRecipeIngredient("Beans"));
		System.out.println("c1.getRecipeIngredient(i1)" + c1.getRecipeIngredient(i1));
		
		System.out.println("c1.removeRecipeIngredient(Beans)" + c1.removeRecipeIngredient("Beans"));
		c1.addOrUpdateRecipeIngredient(i1, 10);
		System.out.println("c1.calculateCalories" + c1.calculateCalories());
		System.out.println("c1.getNumberOfIngredients()" + c1.getNumberOfIngredients());
		
		RecipeIngredient[] ingredients = {rBeans, rCheese, rMilk};
		RecipeBook r = new RecipeBook("Eclipse Cooking");
		r.addRecipe("Cheesy Beans", ingredients);
		RecipeIngredient[] ingredients2 = {rBeef, rCelery, rMilk};
		r.addRecipe("BeefCelery", ingredients2);
		System.out.print("r.findRecipes(ingredients) ");
		RecipeIngredient[] milk = {rMilk};
		CookingRecipe[] crr = r.findRecipes(milk);
		for (CookingRecipe c : crr)
			System.out.println(c);
		System.out.println("r.findRecipesWithFewIngredients(3)");
			crr = r.findRecipesWithFewIngredients(3);
			for (CookingRecipe c : crr)
				System.out.println(c);
		System.out.println("findRecipesLowCalories");
			crr = r.findRecipesLowCalories();
			for (CookingRecipe c: crr)
				System.out.println(c);
		
	}

}
