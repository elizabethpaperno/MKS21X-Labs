public class Kitty {
  private int age;
  private String name;
  public Kitty (String startName, int startAge){
      name = startName;
      age = startAge;
  }
  public Kitty(){
    name = "Mittens";
    age = 2;
  }
  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
  public void changeName(String newName){
    name = newName;
  }
  public void makeOlder(){
    age += 1;
  }
  public String toString(){
    return "The amazing " + name;
    /* When this is run, the two print statments in driver return the String
    "The amazing XX" instead of the adress of the object. This implies that the toString
    method in a class defines what is printed when you print the instance of the object.*/
  }
}
