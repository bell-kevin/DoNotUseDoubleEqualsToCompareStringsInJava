/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donotusedoubleequalstocomparestringsinjava;

import java.util.Scanner;

/**
 *
 * @author 4800590195
 */
public class DoNotUseDoubleEqualsToCompareStringsInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner computerKeyboardInput = new Scanner(System.in);
        String resultInHeap;
        String resultInStringPool;

        System.out.print("Enter q: ");
        resultInHeap = computerKeyboardInput.nextLine();
        resultInStringPool = "q";

        if (resultInHeap == "q") {
            System.out.println("Equal");
        } else {
            System.out.println("Did not equal. One object on heap and other object in string pool");
        }

        if (resultInStringPool == "q") {
            System.out.println("Equal. The variable is pointing to the string pool");
        } else {
            System.out.println("Did not equal");
        }
    }
}
