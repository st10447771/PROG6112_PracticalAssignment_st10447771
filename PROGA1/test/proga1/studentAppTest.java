/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package proga1;

import java.util.Scanner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ST10447771
 */
public class studentAppTest {
    
    public studentAppTest() {
    }
    
    @BeforeEach
    public void setUp() {
        studentApp.students.clear();
    }

    /**
     * Test of saveStudent() method, of class studentApp.
     */
    @Test
    public void testSaveStudent() {
        //Mock Scanner
        Scanner scanner = Mockito.mock(Scanner.class);
        
        //Mock inputs from a user
        Mockito.when(scanner.nextLine())
                .thenReturn("88288")
                .thenReturn("Zayne Li")
                .thenReturn("lizayne@ymail.com")
                .thenReturn("md002")
                .thenReturn("1");
        
        Mockito.when(scanner.nextInt).thenReturn(27);
        
        //Call the saveStudent method
        studentApp.saveStudent(scanner);
        
        //Veryfying that the student was successfully added
        assertEquals(4, studentApp.students.size());
        assertTrue(studentApp.students.contains("88288"));
        assertTrue(studentApp.students.contains("Zayne Li"));
        assertTrue(studentApp.students.contains("lizayne@ymail.com"));
        assertTrue(studentApp.students.contains("md002"));
                      
    }

    /**
     * Test of searchStudent() method, of class studentApp.
     */
    @Test
    public void testSearchStudent() {
        studentApp.students.add("88288");
        studentApp.students.add("Zayne Li");
        studentApp.students.add("lizayne@ymail.com");
        studentApp.students.add("md002");
        
        //Mock the scannerr object
        Scanner scanner = new Mockito.mock(Scanner.class);
        
        //Mock the input for student ID
        Mockito.when(scanner.nextInt()).thenReturn(88288);
        
        studentApp.searchStudent(scanner);
        
        //Verify that the search message is printed correctly
        Mockito.verify(scanner).nextInt();
        assertTrue(studentApp.students.contains("88288"));
        
    }

    /**
     * Test of searchStudent method, of class studentApp.
     */
    @Test
    public void testSearchStudent_NotFound() {
        studentApp.students.add("88288");
        studentApp.students.add("Zayne Li");
        studentApp.students.add("lizayne@ymail.com");
        studentApp.students.add("md002");
        
        //Mock the scannerr object
        Scanner scanner = new Mockito.mock(Scanner.class);
        
        //Mock the input for student ID
        Mockito.when(scanner.nextInt()).thenReturn(22443);
        
        studentApp.searchStudent(scanner);
        
        //Verify that the search message is printed correctly
        Mockito.verify(scanner).nextInt();
        assertFalse(studentApp.students.contains("22443"));
    }
    
    @Test
    public void testDeleteStudent(){
      studentApp.students.add("88288");
        studentApp.students.add("Zayne Li");
        studentApp.students.add("lizayne@ymail.com");
        studentApp.students.add("md002");
        
        //Mock the scannerr object
        Scanner scanner = new Mockito.mock(Scanner.class);
        
        //Mock the input for student ID
        Mockito.when(scanner.nextInt()).thenReturn(88288);
        Mockito.when(scanner.next()).thenReturn("Y");
        
        studentApp.deleteStudent(scanner);
        
        //Verify that the student was deleted
            assertFalse(studentApp.students.contains("88288"));  
    }
    
    @Test
    public void testDeleteStudent_NotFound(){
      studentApp.students.add("88288");
        studentApp.students.add("Zayne Li");
        studentApp.students.add("lizayne@ymail.com");
        studentApp.students.add("md002");
        
        //Mock the scannerr object
        Scanner scanner = new Mockito.mock(Scanner.class);
        
        //Mock the input for student ID
        Mockito.when(scanner.nextInt()).thenReturn(22443);
        Mockito.when(scanner.next()).thenReturn("Y");
        
        studentApp.deleteStudent(scanner);
        
        //Verify that the student was deleted
        assertEquals(4, studentApp.students.size());
            assertFalse(studentApp.students.contains("88288"));
            
    }
    
    @Test
    public void testStudentAgeValid(){
        //Mock the scannerr object
        Scanner scanner = new Mockito.mock(Scanner.class);
        Mockito.when(scanner.nextLine());
        //Mock inputs from a user
        Mockito.when(scanner.nextLine())
                .thenReturn("88288")
                .thenReturn("Zayne Li")
                .thenReturn("lizayne@ymail.com")
                .thenReturn("md002")
                .thenReturn("1");
        
        Mockito.when(scanner.nextInt()).thenReturn(27);
        //Call the saveStudent method
        studentApp.saveStudent(scanner);
        
        //Veryfying that the student was successfully added
        
        assertTrue(studentApp.students.contains("88288"));
        assertTrue(studentApp.students.contains("Zayne Li"));
        assertTrue(studentApp.students.contains("lizayne@ymail.com"));
        assertTrue(studentApp.students.contains("md002"));
    }
    
    @Test
    public void testStudentAgeInvalid(){
        //Mock the scannerr object
        Scanner scanner = new Mockito.mock(Scanner.class);
        Mockito.when(scanner.nextLine());
        //Mock inputs from a user
        Mockito.when(scanner.nextLine())
                .thenReturn("88288")
                .thenReturn("Zayne Li")
                .thenReturn("lizayne@ymail.com")
                .thenReturn("md002")
                .thenReturn("1");
        
        Mockito.when(scanner.nextInt()).thenReturn(13) //Invalid age 
                .thenReturn(27); //Valid age
        
        //Call the saveStudent method
        studentApp.saveStudent(scanner);
        
        //Veryfying that the student was successfully added
        
        assertTrue(studentApp.students.contains("88288"));
        assertTrue(studentApp.students.contains("Zayne Li"));
        assertTrue(studentApp.students.contains("lizayne@ymail.com"));
        assertTrue(studentApp.students.contains("md002"));
    }
    
    @Test
    public void testStudentAgeInvalidCharacter(){
    }
}
