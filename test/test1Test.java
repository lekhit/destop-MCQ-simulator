/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lekhit borole
 */
public class test1Test {
    
    public test1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getter method, of class test1.
     */
    @Test
    public void testGetter() {
        System.out.println("getter");
        int question = 0;
        int what_1_rans_2_ans = 0;
        test1 instance = new test1();
        String expResult = "";
        String result = instance.getter(question, what_1_rans_2_ans);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class test1.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        int question = 0;
        String ans = "";
        test1 instance = new test1();
        instance.save(question, ans);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class test1.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        test1.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
