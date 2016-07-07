/**
 * This class use for 
 *
 * QUOIOLN
 */
package com.quoioln.addbehavior;

/**
 * @author QUOIOLN
 *
 */
public class SomeClass {
    public boolean verifyString(String input) {
        //Do some thing
        return true;
    }
    
    public String getString(String input) {
        if (verifyString(input)) {
            return "OK";
        }
        return "ERROR";
    }
}
