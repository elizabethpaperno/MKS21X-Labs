public class NoNullArrayList<T> extends ArrayList<T> {
  private T value;
  public NoNullArrayList(){
    super();
  }

  public boolean add(T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot add null object");
    }
    this.add(element);
  }
  public void add(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot add null object");
    }
    this.add(index, element);
  }

  public E set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("Cannot add null object");
    }
    this.set(index, element);
  }
}
