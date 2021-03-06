public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public int compareTo(RealNumber other){
    double sub = this.getValue() - other.getValue();
    //doing it this way allows for you to not maintian errors created by type casting and using just the difference
    if (sub > 0){
      return 1;
    } else if (sub < 0){
      return -1;
    }
    return 0;
  }

  public boolean equals(RealNumber other){
    if (other != null){
      return (other.getValue()==this.getValue());
    }
    return false;
  }
  /*
  *Return the sum of this and the other
  */
  public double add(RealNumber other){

     //other can be ANY RealNumber, including a RationalNumber

     //or other subclasses of RealNumber (that aren't written yet)

     return this.getValue() + other.getValue();
  }

  /*
  *Return the product of this and the other
  */
  public double multiply(RealNumber other){
    return this.getValue() * other.getValue();
  }

  /*
  *Return the this divided by the other
  */
  public double divide(RealNumber other){
    return this.getValue() / other.getValue();
  }

  /*
  *Return the this minus the other
  */
  public double subtract(RealNumber other){
    return this.getValue() - other.getValue();
  }


  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+this.getValue();
  }
}
