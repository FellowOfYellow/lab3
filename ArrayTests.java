import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

  @Test 
	public void testReverseInPlace2() {
    int[] input1 = { 3,4,5,6 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 6,5,4,3 }, input1);
	}

  @Test 
	public void testReversed2() {
    int[] input1 = { 3,4,5,6,7 };
    assertArrayEquals(new int[]{ 7,6,5,4,3 }, ArrayExamples.reversed(input1));
	}

  @Test
  public void testReversed1() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

// @Test
// public void testAverageWithoutLowest1() {
//   double[] input1 = {1};
//   assertEquals((double)0, ArrayExamples.averageWithoutLowest(input1),0);
// }

// @Test
// public void testAverageWithoutLowest2() {
//   double[] input1 = {5,10,15,25};
//   assertEquals((double)25, ArrayExamples.averageWithoutLowest(input1),0);
// }

}