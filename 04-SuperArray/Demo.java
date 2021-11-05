public class Demo{
  public static void main(String[] args){
    SuperArray super1 = new SuperArray();
    super1.add("hi");
    super1.add("hello");
    super1.add("hey");
    System.out.println(super1.size()); //3
    System.out.println(super1); //[hi, hello, hey]
    System.out.println(super1.toStringDebug());//[hi, hello, hey, null, null, null, null, null, null, null]

    //phase 2
    //loop that prints the individual elements of the SuperArray using get.
    for (int i=0; i < super1.size(); i++){ //hi \n hello \n hey \n
      System.out.println(super1.get(i));
    }
    //loop that changes all of the elements to different values.
    String[] newVals = {"bye", "goodbye", "adios"};
    for (int i=0; i < super1.size(); i++){
      super1.set(i, newVals[i]);
    }
    System.out.println(super1); //[bye,goodbye,adios]

    //loop that sets each value equal to the next value, and replaces the last value with "NOPE!".
    for (int i=0; i < super1.size(); i++){
      if (i == super1.size() - 1){
        super1.set(i, "NOPE!");
      }else{
        super1.set(i, super1.get(i+1));
      }
    }
    System.out.println(super1); //goodbye, adios, NOPE!
  }
}
