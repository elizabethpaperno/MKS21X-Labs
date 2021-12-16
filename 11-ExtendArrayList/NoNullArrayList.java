import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {
  private T value;
  public NoNullArrayList(){
    super();
  }

  public boolean add(T element){
    if (element == null){
      return false;
      throw new IllegalArgumentException("Cannot add null object");
    }
    this.add(element);
    return true;
  }
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot add null object");
    }
    this.add(index, element);
  }

  public T set(int index, T element){
    if (element == null){
      return element;
      throw new IllegalArgumentException("Cannot set element to null object");
    }
    this.set(index, element);
    return element;
  }
}
