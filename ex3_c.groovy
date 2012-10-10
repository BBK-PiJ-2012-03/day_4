class Mortgage {

	double c;
	int years;
	int r;


	double findTotal ()
	{
        double total = ( c*(1+(r/100)) )
	return total;
	}

}

Mortgage m=new Mortgage()
println ("Give me the total amount borrowed")
String s = System.console().readLine()
m.c = Double.parseDouble(s)


println ("Give me the interest rate")
String s3 = System.console().readLine()
m.r = Double.parseDouble(s3)



println (m.findTotal())






















