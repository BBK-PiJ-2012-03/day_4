String[] employeeArrayNames = new String[10];
int[] employeeArrayID = new int[10];

for (i=0 ; i<10 ; i++) {

println ("give me the " + (i+1) + " name")
employeeArrayNames [i] = System.console().readLine()

		       }

for (j=0 ; j<10 ; j++) {

println ("give me the " + (j+1) + " ID")

 int a = Integer.parseInt(System.console().readLine())
employeeArrayID [j] = a

		       }

println (employeeArrayID [6])