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
    return "The amazing" + name;
  }
}
