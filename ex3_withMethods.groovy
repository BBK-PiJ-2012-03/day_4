class Mortgage {

	double c;
	int years;
	int r;


	double findTotal ()
	{
        double total = ( c*(1+(r/100)) )
	return total;
	}


        double findMoneyPerYear (double total)
	{
	
	double moneyPerYear = (total/years)
	return moneyPerYear
	}

	double findInterestPayTime (double total, double moneyPerYear)
	{
	double interestTotal = (total - c)
	double interestPayTime = ( interestTotal / moneyPerYear)
	return interestPayTime
	}


}



Mortgage m=new Mortgage()

println ("Give me the total amount borrowed")
String s = System.console().readLine()
m.c = Double.parseDouble(s)


println ("Give me the interest rate")
String s3 = System.console().readLine()
m.r = Double.parseDouble(s3)

println ("Give me the number of years to pay it back")
String s2 = System.console().readLine()
m.years = Integer.parseInt(s2)



println (m.findTotal())
println (m.findMoneyPerYear( m.findTotal() ))
println (m.findInterestPayTime ( m.findTotal() , m.findMoneyPerYear(( m.findTotal() )) ))