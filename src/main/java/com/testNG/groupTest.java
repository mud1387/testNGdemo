package com.testNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.testNG.listener.class)

public class groupTest {

	@Test(groups = { "include-test-one" })
    public void testMethodOne() {
        System.out.println("Test method one");
        if(1!=2) {
        	
        }
        
    }
 
    @Test(groups = { "include-test-two" })
    public void testMethodTwo() {
        
        Assert.assertEquals("Hell", "Hello");
    }
 
    @Test(groups = { "test-one-exclude" })
    public void testMethodThree() {
        System.out.println("Test method three");
    }
 
    @Test(groups = { "test-two-exclude" })
    public void testMethodFour() {
        System.out.println("Test method Four");
    }
}
