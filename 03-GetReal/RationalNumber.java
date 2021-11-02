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
    RationalNumber Recip = new RationalNumber(denominator, numerator);
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
  public static int gcd(int a, int b){
    /*use euclids method or a better one*/
    //http://sites.math.rutgers.edu/~greenfie/gs2004/euclid.html
    if (b == 0){
      return a;
    }
    return gcd(b, a % b);
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
    int gcd = gcd (numerator, denominator);
    numerator /= gcd;
    denominator /= gcd;
  }
  /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    RationalNumber product = new RationalNumber(this.numerator * other.numerator, this.denominator * other.denominator);
    product.reduce();
    return product;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber recip = other.reciprocal();
    RationalNumber quo = new RationalNumber(this.numerator * recip.numerator, this.denominator * recip.denominator);
    quo.reduce();
    return quo;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int lcm = (this.denominator * other.denominator)/RationalNumber.gcd(this.denominator, other.denominator);
    //System.out.println(lcm);
    RationalNumber sum = new RationalNumber(((lcm / this.denominator) * this.numerator) + ((lcm / other.denominator) * other.numerator), lcm);
    //System.out.println((gcd / this.denominator) * this.numerator);
    //System.out.println((gcd / other.denominator) * other.numerator);
    sum.reduce();
    return sum;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int gcd = RationalNumber.gcd(this.denominator, other.denominator);
    RationalNumber diff = new RationalNumber(gcd/this.denominator*this.numerator - gcd/other.denominator*other.numerator, gcd);
    diff.reduce();
    return diff;
  }
}
