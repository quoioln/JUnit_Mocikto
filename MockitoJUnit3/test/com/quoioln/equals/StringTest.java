/**
 * This class use for 
 *
 * QUOIOLN
 */
package com.quoioln.equals;

/**
 * @author QUOIOLN
 *
 */
public class StringTest {
    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        
        System.out.println("abc".hashCode());
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        
        System.out.println("abc" == "abc");
        System.out.println(a == "abc");
        System.out.println(a == b);
    }
}
