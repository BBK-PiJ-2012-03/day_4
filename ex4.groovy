class ConvertTo  {

	
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
	println ("oxi etoimo akoma")
	 //kalw tin methodo gia to 2
	break;
	
	default:
	println ("This isn't a valid option") }	
}