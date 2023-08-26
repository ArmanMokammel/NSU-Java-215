public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator)
	{
		this.denominator = denominator;
	}
	
	public int getNumerator()
	{
		return this.numerator;
	}
	
	public int getDenominator()
	{
		return this.denominator;
	}
	
	public void add(Fraction fraction)
	{
		numerator = numerator * fraction.getDenominator() + fraction.getNumerator() * denominator;
		denominator = denominator * fraction.getDenominator();
	}
	
	public void subtract(Fraction fraction)
	{
		numerator = numerator * fraction.getDenominator() - fraction.getNumerator() * denominator;
		denominator = denominator * fraction.getDenominator();
	}
	
	public void multiplication(Fraction fraction)
	{
		numerator *= fraction.getNumerator();
		denominator *= fraction.getDenominator();
	}
	
	public void division(Fraction fraction)
	{
		numerator *= fraction.getDenominator();
		denominator *= fraction.getNumerator();
	}
	
	public String toString()
	{
		return numerator + "/" + denominator;
	}
	
}
