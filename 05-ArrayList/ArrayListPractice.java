import java.util.ArrayList;
public class ArrayListPractice {
  public static void main(String[] args){
    System.out.println("Testing time on replaceEmpty");
    ArrayList<String> a = new ArrayList<String>(200000);
    for (int i = 0; i < 200100;i++){
      double rand = Math.random();
      if (rand < 0.1){
        a.add("");
      }else{
        a.add("" + rand);
      }
    }
    replaceEmpty(a);
    System.out.println("Testing replaceEmpty");
    ArrayList<String> b = new ArrayList<String>();
    b.add("");
    b.add("blalba");
    b.add("hi");
    b.add("");
    b.add("beb");
    b.add("");
    System.out.println(b);
    System.out.println(replaceEmpty(b));
  }
  public static ArrayList<String> replaceEmpty( ArrayList<String> data){
  //return an new ArrayList that has all of the values of the original ArrayList except
  //that all empty strings are replaced with the word "Empty".
  ArrayList<String> newArr = new ArrayList<String>();
    for (int i = 0; i < data.size(); i++){
      if(data.get(i).equals("")){
         newArr.add("Empty");
      }else{
        newArr.add(data.get(i));
      }
    }
    return newArr;
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> data){
  //return a new ArrayList that is in the reversed order of the parameter.
    ArrayList<String> newArr = new ArrayList<String>();
    for (int i = data.size(); i >= 0; i--){
      newArr.add(data.get(i));
    }
    return newArr;
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //when one list is longer than the other, just append the remaining values to the end.
    ArrayList<String> newArr = new ArrayList<String>();
    boolean flag = false;
    if (a.size() > b.size()){
      for (int i = 0; i < a.size(); i++){
        newArr.add(a.get(i));
        if (i == b.size()-1){
          flag = true;
        }
        if (!flag){
          newArr.add(b.get(i));
        }
      }
    }else {
      for (int i = 0; i < b.size(); i++){
        newArr.add(b.get(i));
        if (i == a.size()-1){
          flag = true;
        }
        if (!flag){
          newArr.add(a.get(i));
        }
      }
    }
    return newArr;
  }
}
