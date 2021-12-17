OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  private int whereToPlace(T value){
    /*return the index that the value should be placed
    when inserting into the OrderedArrayList .*/

    return 0;
  }

  public boolean add(T element){

    return true;
  }

  public void add(int index, T element){
    this.add(element); //does the same thing as other add function, index is irreleavrent
  }

  public T set(int index, T element){
    return element;
  }
}
