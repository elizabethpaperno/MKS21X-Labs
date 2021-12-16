public class NoNullArrayList<T> extends ArrayList<T> {
  private T value;
  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot add null object");
    }
  }
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot add null object");
    }
  }

  public E set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot add null object");
    }
  }
}
