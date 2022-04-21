# DoNotUseDoubleEqualsToCompareStringsInJava
DoNotUseDoubleEqualsToCompareStringsInJava

// Java program to understand
// the concept of == operator
 
public class Test {
    public static void main(String[] args)
    {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 =  new String("HELLO");
 
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
    }
}


// Java program to illustrate
// == operator for compatible data
// types
 
class Test {
    public static void main(String[] args)
    {
        // integer-type
        System.out.println(10 == 20);
 
        // char-type
        System.out.println('a' == 'b');
 
        // char and double type
        System.out.println('a' == 97.0);
 
        // boolean type
        System.out.println(true == true);
    }
}


// Java program to illustrate
// == operator for incompatible data types
 
class Test {
    public static void main(String[] args)
    {
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("GEEKS");
 
        System.out.println(t == o);
        System.out.println(o == s);
 
       // Uncomment to see error
       System.out.println(t==s);
    }
}


public class Test {
    public static void main(String[] args)
    {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;
 
        String s1 = new String("GEEKS");
        String s2 = new String("GEEKS");
 
        System.out.println(t1 == t3);
        System.out.println(t1 == t2);
        System.out.println(s1 == s2);
 
        System.out.println(t1.equals(t2));
        System.out.println(s1.equals(s2));
    }
}

 
 
Output

true
false
false
false
true
