/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.noexceptionmatch;
import java.util.Scanner;

/**
 *
 * @author Acer-User
 */


class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}
public class NoExceptionMatch {

    public static void main(String[] args) {
        try {
            checkString("Symbiosis");
            System.out.println("String matches!");
        }
        catch (NoMatchException e) {
            System.out.println("Caught NoMatchException: " + e.getMessage());
        }
    }
    
    public static void checkString(String str) throws NoMatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = input.next();
        if (!string.equals("Symbiosis")) {
            throw new NoMatchException("String does not match 'Symbiosis'");
        }
    }
}
