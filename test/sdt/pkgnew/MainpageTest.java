/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package sdt.pkgnew;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

/**
 *
 * @author Manas G
 */
public class MainpageTest {
    
//    public MainpageTest() {
//        
//    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }
//
//    /**
//     * Test of read_combo method, of class Mainpage.
//     */
//    @Test
//    public void testRead_combo() {
//        System.out.println("read_combo");
//        Mainpage instance = new Mainpage();
//        instance.read_combo();
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of submit_pressed method, of class Mainpage.
     */
    @Test
    public void testSubmit_pressed() {
        Mainpage M = new Mainpage();
        
        String array [] = {"Manas", "123456", "Male", "CCE", "admin"};
        Assert.assertArrayEquals(array, M.show_test());
    }

    /**
     * Test of main method, of class Main page.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        Mainpage.main(args);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
