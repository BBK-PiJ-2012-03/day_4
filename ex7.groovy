class Integer2 {
    int value;

    int getValue() {
    return value;
    }

    void setValue(int value) {
    this.value = value
    }

    boolean isEven(int value) {
    boolean even ;
        if (value%2 == 0) {
		even = false
		     }
        else {
		even = true
		     }
	return even;

    }


    boolean isOdd(int value) {
    boolean odd ;
        if (value%2 == 0) {
		odd = true
		     }
        else {
		odd = false
		     }
	return odd;
    }

    void prettyPrint() {
	println (value)
    }

    String toString(int value) {
    String value2String = value;
    return value2String;
    }
}

Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);
println ("The number you entered is " + i)
if (i2.isEven(i)) {
println "even.";
} else if (i2.isOdd(i)) {
println "odd.";
} else {
println "undefined!! Your code is buggy!";
}
int parsedInt = Integer.parseInt(i2.toString(i));
if (parsedInt == i2.getValue()) {
println("Your toString() method seems to work fine.");
}
