public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(0.0);//this value is ignored!
    numerator = nume;
    denominator = deno;
  }

  public double getValue(){
    return Double.valueOf(numerator)/Double.valueOf(denominator);
  }

  /**
  *@return the numerator
  */
  public int getNumerator(){
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator(){
    return denominator;
  }
  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal(){
    new RationalNumber Recip = RationalNumber(denominator, numerator);
    return Recip;
  }
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  */
  public boolean equals(RationalNumber other){
    if (other != null){
      return (numerator == other.getNumerator() && denominator == other.getDenominator());
    }else{
      return false;
    }
  }


  /**
  *@return the value expressed as "3/4" or "8/3"
  */
  public String toString(){
    return numerator+"/"+denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  private static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    if (b != 0){
      a = b;
      b = a % b;
    }
    return a;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    numerator /= gcd;
    denominator /= gcd;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    new RationalNumber newNum = RationalNumber(this.numerator * other.numerator, this.denominator * other.denominator);
    return newNum.reduce();
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    recip = other.reciprocal();
    new RationalNumber quo = RationalNumber(this.numerator * recip.numerator, this.denominator * recip.denominator);
    return quo.reduce();
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    gcd = RationalNumber.gcd(this.denominator, other.denominator);
    new RationalNumber sum = RationalNumber(gcd/this.denominator*this.numerator + gcd/other.denominator*other.numerator, gcd);
    return sum.reduce();
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    gcd = RationalNumber.gcd(this.denominator, other.denominator);
    new RationalNumber diff = RationalNumber(gcd/this.denominator*this.numerator - gcd/other.denominator*other.numerator, gcd);
    return sum.diff();
  }
}
