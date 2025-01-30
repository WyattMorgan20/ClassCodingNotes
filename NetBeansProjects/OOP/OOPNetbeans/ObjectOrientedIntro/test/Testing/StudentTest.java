/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author s540549
 */
public class StudentTest {

    public StudentTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
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
