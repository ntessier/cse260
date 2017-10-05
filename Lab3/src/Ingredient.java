
public class Ingredient {
	private String name;
	private String measuringUnit;
	private int caloriesPerUnit;
	public Ingredient(String name, String measuringUnit, int caloriesPerUnit)
	{
		this.name = name;
		this.measuringUnit = measuringUnit;
		this.caloriesPerUnit = caloriesPerUnit;
	}
	public boolean equals(Ingredient i)
	{
		if (this.name.equals(i.getName()) && this.measuringUnit.equals(i.getMeasuringUnit())
				&& this.caloriesPerUnit == i.getCaloriesPerUnit())
			return true;
		return false;
	}
	public boolean equals(String s)
	{
		if (this.getName().equals(s))
			return true;
		return false;
	}
	public int compareTo(Ingredient i)
	{
		if (this.equals(i))
			return 0;
		return -1;
	}
	public String getName()
	{
		return name;
	}
	public String getMeasuringUnit()
	{
		return measuringUnit;
	}
	public int getCaloriesPerUnit()
	{
		return caloriesPerUnit;
	}
	public String toString()
	{
		String s = "";
		s += "Ingredient\n" + "name = " + name + "\n" + "measuringUnit=" 
				+ measuringUnit + "\n" + "caloriesPerUnit=" + 
				caloriesPerUnit + "\n";
		return s;
		
	}
	

}
