import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class projectTest {
    @Test
    public void test_project_1(){assertEquals("Not a triangle",(project.triangle(1, 2, 4)));}
    @Test
    public void test_project_2(){assertEquals("Not a triangle",(project.triangle(0, 2, 1)));}
    @Test
    public void test_project_3(){assertEquals("Not a triangle",(project.triangle(4, 1, 2)));}
    @Test
    public void test_project_4(){assertEquals("Scalene",(project.triangle(2, 3, 4)));}
    @Test
    public void test_project_5(){assertEquals("Isosceles",(project.triangle(2, 1, 2)));}
    @Test
    public void test_project_6(){assertEquals("Isosceles",(project.triangle(1, 2, 2)));}
    @Test
    public void test_project_7(){assertEquals("Isosceles",(project.triangle(2, 2, 1)));}
    @Test
    public void test_project_8(){assertEquals("Equilateral",(project.triangle(5, 5, 5)));}
}
