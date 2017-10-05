import java.util.ArrayList;
public class RecipeBook {
	private String bookName;
	private ArrayList<CookingRecipe> recipes;
	public RecipeBook(String name)
	{
		bookName = name;
		recipes = new ArrayList<CookingRecipe>();
	}
	public CookingRecipe addRecipe(String name, RecipeIngredient[] ingredients)
	{
		boolean exists = false;
		for (int i = 0; i < recipes.size(); i++)
		{
			if (recipes.get(i).equals(name))
				exists = true;
		}
		if (exists)
			return null;
		else
		{
			CookingRecipe r = new CookingRecipe(name);
			for (RecipeIngredient ri : ingredients)
			{
				r.addOrUpdateRecipeIngredient(ri, ri.getQuantity() );
			}
			return r;
		}
		
	}
	public CookingRecipe removeRecipe(String name)
	{
		CookingRecipe r = null;
		int index = 0;
		for (int i = 0; i < recipes.size(); i++)
		{
			if (recipes.get(i).equals(name))
			{
				index = i;
				r = recipes.get(i);
				recipes.remove(i);
			}
		}
		return r;
	}
	public CookingRecipe[] findRecipes(RecipeIngredient[] ingredients)
	{
		ArrayList<CookingRecipe> matchingRecipes = new ArrayList<CookingRecipe>();
		boolean matches = true;
		for (int i = 0; i < recipes.size(); i++)
		{
			matches = true;
			CookingRecipe cr = recipes.get(i);
			for (int j = 0; j < ingredients.length; j++)
			{
				RecipeIngredient ri = cr.getRecipeIngredient(ingredients[j]);
				if (ri == null)
					matches = false;
				
			}
			if (matches)
			{
				matchingRecipes.add(cr);
			}
		}
		
			
		
		return convertListToArray(matchingRecipes);
	}
	private CookingRecipe[] convertListToArray(ArrayList<CookingRecipe> r)
	{
		CookingRecipe[] answers = new CookingRecipe[r.size()];
		for (int i = 0; i < r.size(); i++)
		{
			answers[i] = r.get(i);
		}
		return answers;
	}
	public CookingRecipe[] findRecipesWithFewIngredients(int numberOfIngredients)
	{
		ArrayList<CookingRecipe> matchingRecipes = new ArrayList<CookingRecipe>();
		for (int i = 0; i < recipes.size(); i++)
		{
			CookingRecipe cr = recipes.get(i);
			int numberingredients = cr.getNumberOfIngredients();
			if (numberingredients <= numberOfIngredients)
			{
				matchingRecipes.add(cr);
			}
		}
		return convertListToArray(matchingRecipes);
	}
	public CookingRecipe[] findRecipesLowCalories()
	{
		ArrayList<CookingRecipe> matchingRecipes = new ArrayList<CookingRecipe>();
		float minimumCalories = 0;
		if (recipes.size() != 0)
			minimumCalories = recipes.get(0).calculateCalories();
		
		for (int i = 1; i < recipes.size(); i++)
		{
			CookingRecipe cr = recipes.get(i);
			if (cr.calculateCalories() < minimumCalories)
				minimumCalories = cr.calculateCalories();
		}
		for (CookingRecipe cr : recipes)
		{
			if (cr.calculateCalories()  == minimumCalories)
				matchingRecipes.add(cr);
		}
		return convertListToArray(matchingRecipes);
	}
	public String toString()
	{
		String s = "";
		for (CookingRecipe cr : recipes)
			s += cr.toString();
		return s;
	}
	

}
