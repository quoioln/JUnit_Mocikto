/**
 * This class use for 
 *
 * QUOIOLN
 */
package com.quoioln.addbehavior;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * @author QUOIOLN
 *
 */
public class SomeClassTest {
    @Test
    public void testGetString() {
        String input = "abc";
        SomeClass someClass = Mockito.spy(new SomeClass());
        Mockito.when(someClass.verifyString(input)).thenReturn(false);
        String expected = "OK";
        String actual = someClass.getString(input);
        Assert.assertEquals(expected, actual);
    }
}
