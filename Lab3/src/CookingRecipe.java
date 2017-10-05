import java.util.ArrayList;

public class CookingRecipe {
	private String name;
	private ArrayList<RecipeIngredient> ingredients;
	
	public CookingRecipe(String name)
	{
		this.name = name;
		ingredients = new ArrayList<RecipeIngredient>();
	}
	public String getName()
	{
		return name;
	}
	public void addOrUpdateRecipeIngredient(Ingredient ingredient, float quantity)
	{
		RecipeIngredient ri = new RecipeIngredient(ingredient.getName(), 
				ingredient.getMeasuringUnit(),ingredient.getCaloriesPerUnit(),
				quantity);
		
		boolean updated = false;
		for (int i = 0; i < ingredients.size(); i++)
		{
			if (ingredients.get(i).equals(ri))
			{
				ingredients.get(i).updateQuantity(ri.getQuantity());
				updated = true;
			}
				
		}
		if (!(updated))
		{
			ingredients.add(ri);
		}
	}
	public boolean equals(CookingRecipe r)
	{
		if (this.getName().equals(r.getName()))
			return true;
		return false;
	}
	public RecipeIngredient getRecipeIngredient(Ingredient ingredient)
	{
		for (int i = 0; i < ingredients.size(); i++)
		{
			Ingredient ing = (Ingredient)ingredients.get(i);
			if (ing.equals(ingredient))
				return ingredients.get(i);
		}
		return null;
	}
	public RecipeIngredient getRecipeIngredient(String ingredientName)
	{
		for (int i = 0; i < ingredients.size(); i++)
		{
			Ingredient ing = (Ingredient)ingredients.get(i);
			if (ing.equals(ingredientName))
				return ingredients.get(i);
		}
		return null;
		
	}
	public RecipeIngredient removeRecipeIngredient(Ingredient ingredient)
	{
		int index = ingredients.indexOf(ingredient);
		if (index >= 0)
		{
			RecipeIngredient i = ingredients.get(index);
			ingredients.remove(index);
			return i;
		}
		return null;
	}
	public RecipeIngredient removeRecipeIngredient(String ingredientName)
	{
		for (int i = 0; i < ingredients.size(); i++)
		{
			RecipeIngredient ri = ingredients.get(i);
			if (ri.equals(ingredientName))
			{
				ingredients.remove(ingredients.indexOf(ri));
				return ri;
			}
		}
		return null;
	}
	public float calculateCalories()
	{
		int calories = 0;
		for (RecipeIngredient ri : ingredients)
		{
			calories += ri.getCaloriesPerUnit() * ri.getQuantity();
		}
		return calories;
	}
	public int getNumberOfIngredients()
	{
		return ingredients.size();
	}
	public String toString()
	{
		String s = "";
		s += "Recipe Name: ";
		s += this.name + "\n";
		
		for (int i = 0; i < ingredients.size(); i++)
		{
			s += "\n";
			RecipeIngredient ri = ingredients.get(i);
			s += ri.toString();
		}
		return s;
	}
	
		
}
