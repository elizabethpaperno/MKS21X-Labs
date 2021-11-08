public class Demo{
  public static void main(String[] args){
    /*
    //PHASE 1
    SuperArray super1 = new SuperArray();
    super1.add("hi");
    super1.add("hello");
    super1.add("hey");
    System.out.println(super1.size()); //3
    System.out.println(super1); //[hi, hello, hey]
    System.out.println(super1.toStringDebug());//[hi, hello, hey, null, null, null, null, null, null, null]

    //PHASE 2
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
    */
    //PHASE 3
    SuperArray super2 = new SuperArray(4);
    super2.add("bird");
    super2.add("cat");
    super2.add("dog");
    super2.add("butterfly");

    //System.out.println(super2);
    //System.out.println(super2.toStringDebug());

    super2.add("ladybug");
    super2.add("blurb");

    //System.out.println(super2);
    //System.out.println(super2.toStringDebug());

    //for (int i=0; i < super2.size(); i++){
      //System.out.println(super2.get(i));
    //}

    //super 2 is [bird, cat, dog, love, butterfly, ladybug, blurb, null, null, null]
    super2.add(3,"love");
    System.out.println(super2.toStringDebug());
  }
}
