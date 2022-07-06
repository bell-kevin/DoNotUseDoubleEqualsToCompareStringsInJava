# DoNotUseDoubleEqualsToCompareStringsInJava
DoNotUseDoubleEqualsToCompareStringsInJava

https://www.geeksforgeeks.org/difference-between-and-equals-method-in-java/

https://www.javatpoint.com/string-pool-in-java

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



Explanation: Here, we are using the .equals method to check whether two objects contain the same data or not. 

 

    In the above example, we create 3 Thread objects and 2 String objects.
    In the first comparison, we check whether t1 == t3 or not. As we know that both t1 and t3 point 
    to the same object. 
    That’s why it returns true.
    In the second comparison, we are using the operator “==” for comparing the String Objects 
    and not the contents of the objects. 
    Here, both the objects are different, and hence the outcome of this comparison is “False.”
    When we are comparing 2 String objects by .equals() operator, then we 
    are checking that is both objects contain the same data or not.
    Both the objects contain the same String, i.e., GEEKS. That’s why it returns true.


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
