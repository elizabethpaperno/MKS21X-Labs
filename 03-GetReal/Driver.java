public class Driver {
  public static void main(String[] args){
    RealNumber num1 = new RealNumber(5.0);
    RealNumber num2 = new RealNumber(-1.0);

    //testing Real Number methods
    System.out.println(num1.add(num2)); //4
    System.out.println(num1.subtract(num2)); //6
    System.out.println(num1.getValue()); //5.0
    System.out.println(num2.getValue()); //-1.0
    System.out.println(num1.multiply(num2)); //-5.0
    System.out.println(num1.divide(num2)); //-5.0

    RationalNumber frac1 = new RationalNumber(1,3);
    RationalNumber frac2 = new RationalNumber(5,6);

    System.out.println(frac1.getValue()); // 1/3
    System.out.println(frac2.getValue()); // 5/6
    System.out.println(frac1.getNumerator()); //1
    System.out.println(frac2.getNumerator()); //5
    System.out.println(frac1.getDenominator()); //3
    System.out.println(frac2.getDenominator()); //6
    System.out.println(frac1.reciprocal()); // 3/1
    System.out.println(frac2.reciprocal()); // 6/5
    System.out.println(frac1.multiply(frac2)); // 5/18
    System.out.println(frac1.divide(frac2)); // 2/5
    System.out.println(frac1.add(frac2)); // 7/6
    System.out.println(frac1.subtract(frac2)); // 1/-2
    System.out.println(frac1.equals(frac2)); //false

    RationalNumber frac3 = new RationalNumber(1,3);
    System.out.println(frac1.equals(frac3)); //true

    RationalNumber frac4 = new RationalNumber(-1,3);
    System.out.println(frac4.getValue()); // -1/3
    System.out.println(frac4.getNumerator()); // -1
    System.out.println(frac4.getDenominator()); //3
    System.out.println(frac4.reciprocal()); // 3/-1
    System.out.println(frac4.multiply(frac2)); // -5/18
    System.out.println(frac4.divide(frac2)); // -2/5
    System.out.println(frac4.add(frac2)); // 1/2
    System.out.println(frac4.subtract(frac2)); // -7/6
    System.out.println(frac4.equals(frac2)); //false

    RationalNumber frac5 = new RationalNumber(5,0);
    System.out.println(frac5); // 0/1

    int a = 5;
    int b = 5;
    for(int i = 0; i < 15; i++){
     RealNumber value = new RealNumber((Math.random()*(b-a+1))+a);
     RealNumber value2 = new RealNumber((Math.random()*(b-a+1))+a);
     System.out.println("Value 1 is " + value);
     System.out.println("Value 2 is " + value2);
     System.out.println("value1.CompareTo(value2) returns " + value.compareTo(value2));
     System.out.println();
    }

    //random num does not test for equality
    RealNumber num3 = new RealNumber(4);
    RealNumber num4 = new RealNumber(4);
    System.out.println(num3.compareTo(num4)); //0
  }
}
