class Point {
double x;
double y;

	double distanceToPoint(Point point) {
	double result = (Math.sqrt(Math.pow(this.x-point.x,2)+Math.pow(this.y-point.y,2)));
	return result;
	}


	double distanceToOrigin() {
	double result = (Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)));
	return result;
	}

	void moveTo (double x, double y) {
	this.x = x
	this.y = y
	}

	void moveTo (Point point) {
	this.x = point.x
	this.y = point.y
	}

	
	Point clone () {
	Point myPoint = new Point ();
	myPoint.x = this.x;
	myPoint.y = this.y;
	return myPoint;
	}

	Point opposite () {
	Point myPoint = new Point ();
	myPoint.x = -1*(this.x);
	myPoint.y = -1*(this.y);
	return myPoint;
	}




}


Point myPoint = new Point ();
Point myPoint2 = new Point ();


println ("Give me the x of your point")
String str = System.console().readLine();
myPoint.x = Double.parseDouble(str)

println ("Give me the y of your point")
String str2 = System.console().readLine();
myPoint.y = Double.parseDouble(str2)

//---------------------------------------
boolean finished = false

while (!finished)

{
   println ("Hello, what do you wanna do?")
   println ("1. Calculate the distance to another point")
   println ("2. Calculate the distance to the origin")
   println ("3. Change the coordinates of this point to be the given parameters x and y.")
   println ("4. Change the coordinates of this point to move where the given point is")
   println ("5. Return a copy of the current point with the same coordinates")
   println ("6. Return a copy of the current point with the coordinates multiplied by -1.")
   println ("0. Exit")

   String s = System.console().readLine()
   int choice = Integer.parseInt(s)

   switch (choice)
	{
	case 0 : 
	finished = true
	break;

	case 1:
	println ("Give me the x of the second point")
	String str3 = System.console().readLine();
	myPoint2.x = Double.parseDouble(str3)

	println ("Give me the y of the second point")
	String str4 = System.console().readLine();
	myPoint2.y = Double.parseDouble(str4)
	println ("The distance of these 2 points is " +myPoint.distanceToPoint(myPoint2))	
	break;

	case 2:
	println ("The distance to orgin is " +myPoint.distanceToOrigin())	
	break;

	case 3:
	println ("Give me the new x")
	String str3 = System.console().readLine();
	x3 = Double.parseDouble(str3)
	
	println ("Give me the new y")
	String str4 = System.console().readLine();
	y3 = Double.parseDouble(str4)
	myPoint.moveTo (x3,y3)
	println ("done");	
	break;

	case 4:
	println ("Give me the x of another point")
	String str5 = System.console().readLine();
	myPoint2.x = Double.parseDouble(str5)

	println ("Give me the y of another point")
	String str6 = System.console().readLine();
	myPoint2.y = Double.parseDouble(str6)
	myPoint.moveTo (myPoint2);
	println ("done");
	break;

	case 5:

	myPoint2 = myPoint.clone();
	println("The point has been cloned at x =" + myPoint2.x + " and y =" + myPoint2.y);
	break;

	case 6:
	myPoint2 = myPoint.opposite();
	println(myPoint2.x);

	break;

	
	default:
	println ("This isn't a valid option") }	
}






