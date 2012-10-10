println ("Give me the total amount borrowed")
String s = System.console().readLine()
double c = Double.parseDouble(s)

println ("Give me the number of years to pay it back")
String s2 = System.console().readLine()
int years = Integer.parseInt(s2)

println ("Give me the interest rate")
String s3 = System.console().readLine()
double r = Double.parseDouble(s3)

double total = ( c*(1+(r/100)) )


double moneyPerYear = ( (total/years) )

double interestTotal = (total - c)


println ("The total amount to be paid is " + total)

println ("The amount of money to be paid every year is " + moneyPerYear)


double weird = ( interestTotal / moneyPerYear)

println ("The number of years before the interest is paid and only the initial capital remains are " +weird)

