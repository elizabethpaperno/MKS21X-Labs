public class Kitty {
  private int age;
  private String name;
  public Kitty (int startAge, String startName){
      name = startName;
      age = startAge;
  }
  public Kitty(){
    name = "Mittens";
    age = 2
  }
  public int getAge(){
    return age;
  }
  public String getName(){
    return name;
  }
}
