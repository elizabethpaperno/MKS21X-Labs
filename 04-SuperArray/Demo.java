public class Demo{
  public static void main(String[] args){
    SuperArray super1 = new SuperArray();
    super1.add("hi");
    super1.add("hello");
    super1.add("hey");
    System.out.println(super1.size()); //3
    System.out.println(super1); //[hi, hello, hey]
    System.out.println(super1.toStringDebug());//[hi, hello, hey, null, null, null, null, null, null, null]
  }
}
