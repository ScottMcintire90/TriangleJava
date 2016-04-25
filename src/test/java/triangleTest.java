import org.junit.*;
import static org.junit.Assert.*;

public class triangleTest{

  @Test
  public void newTriangle_instantiatesCorrectly() {
    Triangle triangleTest = new Triangle(2, 3, 4);
    assertEquals(true, triangleTest instanceof Triangle);
  }
  @Test
  public void getLength_getsTriangleSide1_2() {
    Triangle triangleTest = new Triangle(2, 3, 5);
    assertEquals(2, triangleTest.getSide1());
  }
  @Test
  public void getLength_getsTriangleSide2_3() {
    Triangle triangleTest = new Triangle(2, 3, 5);
    assertEquals(3, triangleTest.getSide2());
  }
  @Test
  public void getLength_getsTriangleSide3_5() {
    Triangle triangleTest = new Triangle(2, 3, 5);
    assertEquals(5, triangleTest.getSide3());
  }
  @Test
  public void equilateralCheck_checksIfTriangleIsEquilateral_true() {
    Triangle triangleTest = new Triangle(2, 2, 2);
    assertEquals(true, triangleTest.equilateralCheck());
  }

  @Test
  public void isoscelesCheck_checksIfTriangleIsIsosceles_true() {
    Triangle triangleTest = new Triangle(2, 2, 3);
    assertEquals(true, triangleTest.isoscelesCheck());
  }

  @Test
  public void scaleneCheck_checksIfTriangleIsScalene_true() {
    Triangle triangleTest = new Triangle(2, 3, 5);
    assertEquals(true, triangleTest.scaleneCheck());
  }
  @Test
  public void scaleneCheck_checksIfTriangleIsNotTriangle_false() {
    Triangle triangleTest = new Triangle(2, 3, 6);
    assertEquals(false, triangleTest.scaleneCheck());
  }
}
