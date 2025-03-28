/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author s540549
 */
public class StudentNGTest {
    
    public StudentNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of get grade method, of class Student.
     */
    @Test
    public void testGetgrade() {
        System.out.println("getGrade");
        // Boundary test cases for invalid range
        assertEquals(Student.getGrade(-1), "Error");
        assertEquals(Student.getGrade(101), "Error");
        // Test case for invalid range
        assertEquals(Student.getGrade(-5), "Error");
    }

    @Test
    public void testFGetGrade() {
        // Boundary test case
        assertEquals(Student.getGrade(0), "F");
        assertEquals(Student.getGrade(59), "F");
        // Range test case
        assertEquals(Student.getGrade(55), "F");
    }

    @Test
    public void testDgetGrade() {
        // Boundary test case
        assertEquals(Student.getGrade(60), "D");
        assertEquals(Student.getGrade(69), "D");
        // Range test case
        assertEquals(Student.getGrade(65), "D");
    }

    @Test
    public void testCGetGrade() {
        // Boundary test case
        assertEquals(Student.getGrade(70), "C");
        assertEquals(Student.getGrade(79), "C");
        // Range test case
        assertEquals(Student.getGrade(75), "C");
    }

    @Test
    public void testBGetGrade() {
        // Boundary test case
        assertEquals(Student.getGrade(80), "B");
        assertEquals(Student.getGrade(89), "B");
        // Range test case
        assertEquals(Student.getGrade(85), "B");
    }

    @Test
    public void testAGetGrade() {
        // Boundary test case
        assertEquals(Student.getGrade(90), "A");
        assertEquals(Student.getGrade(100), "A");
        // Range test case
        assertEquals(Student.getGrade(95), "A");
    }
    
}
