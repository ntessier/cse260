
public class RecipeIngredient extends Ingredient {
	private float quantity;
	
	public RecipeIngredient(String name, String measuringUnit, int caloriesPerUnit, float quantity)
	{
		super(name, measuringUnit, caloriesPerUnit);
		this.quantity = quantity;
	}
	public RecipeIngredient(Ingredient i, float quantity)
	{
		super(i.getName(), i.getMeasuringUnit(), i.getCaloriesPerUnit());
		this.quantity = quantity;
	}
	public float getQuantity()
	{
		return quantity;
	}
	public void updateQuantity(float q)
	{
		quantity += q;
	}
	public String toString()
	{
		String s = super.toString();
		s += "Quantity=" + quantity;
		return s;
	}
}
