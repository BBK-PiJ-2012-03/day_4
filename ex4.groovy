class ConvertTo  
{

	
int binary2decimal(String s2)
  {
	int tool = 0

	for (int i = 0 ; i < s2.length() ; i++)
     	{
  
		if ( s2.charAt(i) == "1" ) {
	
		tool = tool +  Math.pow(2,(s2.length() - i - 1)) 
     		}
     	}

 	return (tool)
  }

String decimal2binary (int decimal)
  { 
String reversed = ""
String stresult = ""
String zero = "0"
String one = "1"

while (decimal>0) {
	int remainder = decimal%2
	decimal = decimal/2
	
	if (remainder == 1) {
			stresult = stresult + one
			    }
	else if (remainder == 0) {
		stresult = stresult + zero
	     			 }


		  }
	for(int i = stresult.length() - 1 ; i >  -1 ; i--)
			{
	char last = stresult.charAt(i)
	
	reversed = reversed + last

			}
	return (reversed)
  }


}

ConvertTo myConvert = new ConvertTo()


boolean finished = false

while (!finished)

{
   println ("Hello, what do you wanna do?")
   println ("1. Convert binary 2 decimal")
   println ("2. Conver decimal 2 binary")
   println ("0. Exit")

   String s = System.console().readLine()
   int choice = Integer.parseInt(s)

   switch (choice)
	{
	case 0 : 
	finished = true
	break;

	case 1:
	println ("Give me your binary number")	
	String s2 = System.console().readLine()	
	println (myConvert.binary2decimal(s2))
	break;

	case 2:
	println ("Give me your decimal number")
	String s3 = System.console().readLine()
	int decimal  = Integer.parseInt(s3)
	println (myConvert.decimal2binary(decimal))
	


	break;
	
	default:
	println ("This isn't a valid option") }	
}