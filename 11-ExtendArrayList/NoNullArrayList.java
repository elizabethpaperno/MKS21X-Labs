import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {
  private T value;
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(startingCapacity){
    super(startingCapacity);
  }

  @Override
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot add null object");
      //return false;
    }
    super.add(element);
    return true;
  }

  @Override
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot add null object");
    }
    super.add(index, element);
  }

  @Override
  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot set element to null object");
      //return element;
    }
    super.set(index, element);
    return element;
  }
}
