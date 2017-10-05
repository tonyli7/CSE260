public class Ingredient{

  protected String name;
  protected String measuringUnit;
  protected int caloriesPerUnit;

  public Ingredient(String name, String measuringUnit, int caloriesPerUnit){
    this.name = name;
    this.measuringUnit = measuringUnit;
    this.caloriesPerUnit = caloriesPerUnit;
  }

  public String getName(){
    return name;
  }

  public String getMeasuringUnit(){
    return measuringUnit;
  }

  public int getCaloriesPerUnit(){
    return caloriesPerUnit;
  }

  public boolean equals(Ingredient other){
    return (name.equals(other) &&
            measuringUnit.equals(other.getMeasuringUnit()) &&
            caloriesPerUnit == other.getCaloriesPerUnit());
  }

  public String toString(){
    return "Ingredient\n"+ "name = " + name + "\n" +"measuringUnit = " + measuringUnit + "\n" + "caloriesPerUnit = " + caloriesPerUnit;
  }
} 
