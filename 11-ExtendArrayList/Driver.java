public class Driver{
  public static void main(String[] args){
    NoNullArrayList arr1 = new NoNullArrayList();
    try {
      arr1.add(3);
      arr1.add(5);
      arr1.add(null); //throws exception
    }catch(IllegalArgumentException e){
      System.out.println("add null to end caught");
    }

    NoNullArrayList arr2 = new NoNullArrayList();
    try {
      arr2.add(3);
      arr2.set(0, null); //throws exception
    }catch(IllegalArgumentException e){
      System.out.println("set to null caught");
    }

    NoNullArrayList arr3 = new NoNullArrayList();
    try {
      arr3.add(0, 3);
      arr3.add(1, 5);
      arr3.add(2, null); //throws exception
    }catch(IllegalArgumentException e){
      System.out.println("add null to position caught");
    }

    OrderedArrayList ord1 = new OrderedArrayList();
    System.out.println("adding stuff");
    ord1.add("apple");
    ord1.add("bat");
    ord1.add("rat");
    ord1.add("cat");
    System.out.println(ord1);
  }
}
