import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace0() {
    int[] input1 = { };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ }, input1);
	}

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = { 1 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 1 }, input1);
	}

  @Test
  public void testReverseInPlaceLength4() {
    int[] input1 = {1, 2, 3, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4, 3, 2, 1}, input1);     
  }

  @Test
  public void testReverseInPlaceLength5() {
    int[] input1 = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input1);    
  }

  @Test
  public void testReversed0() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed1() {
    int[] input1 = { 1 };
    assertArrayEquals(new int[]{ 1 }, ArrayExamples.reversed(input1));
  }
  
  @Test
  public void testReversed3() {
    int[] input1 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input1));    
  }

  @Test
  public void testReversed4() {
    int[] input1 = {1, 2, 3, 4};
    assertArrayEquals(new int[]{4, 3, 2, 1}, ArrayExamples.reversed(input1));    
  }

  @Test
  public void testAverageWOutLowestEvens() {
    double[] input1 = {8, 6, 4, 2};
    assertEquals(6, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageWOutLowestEvensWithTwoTwos() {
    double[] input1 = {8, 6, 4, 2, 2};
    assertEquals(5, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageWOutLowestOnes() {
    double[] input1 = {1,1,1};
    assertEquals(1, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }
}