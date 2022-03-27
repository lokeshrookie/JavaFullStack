package com.Lokesh.Day3;

import java.nio.charset.StandardCharsets;

// charset, charpoint.

public class Strings {
    public static void main(String[] args) {


        String st1 = "Java";
        String st2 = "Java";

        /*
          st1 and st2 belongs to same object. so both contet and address is same.
         */
        // This compares both are same objects or not.
        System.out.println(st1 == st2);  // true
        // This compares contents of both the strings
        System.out.println(st1.equals(st2));  // true

        /*
            st3 and st4 are created as different objects. so only content is same. not the address.
         */
        String st3 = new String("Java");
        String st4 = new String("Java");
        System.out.println(st3 == st4); // false.
        System.out.println(st3.equals(st4));  // true.
    }
}
