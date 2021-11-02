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
    //System.out.println(frac1.divide(frac2)); // 6/15
    System.out.println(frac1.add(frac2)); // 7/6
    System.out.println(frac1.subtract(frac2)); // -3/6

  }
}
