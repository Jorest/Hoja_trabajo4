/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hoja_trabajo4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dj Henry
 */
public class StackInterfaceTest {
    
    public StackInterfaceTest() {
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
     * Test of push method, of class StackInterface.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object item = null;
        StackInterface instance = new StackInterfaceImpl();
        instance.push(item);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class StackInterface.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        StackInterface instance = new StackInterfaceImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of peek method, of class StackInterface.
     */
    @Test
    public void testPeek() {
        System.out.println("peek");
        StackInterface instance = new StackInterfaceImpl();
        Object expResult = null;
        Object result = instance.peek();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of empty method, of class StackInterface.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        StackInterface instance = new StackInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.empty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class StackInterface.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        StackInterface instance = new StackInterfaceImpl();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public class StackInterfaceImpl implements StackInterface {

        public void push(E item) {
        }

        public E pop() {
            return null;
        }

        public E peek() {
            return null;
        }

        public boolean empty() {
            return false;
        }

        public int size() {
            return 0;
        }
    }
    
}
