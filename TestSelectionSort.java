/**
 *
 */
package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * @author Aku
 *
 */
public class TestSelectionSort {

	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicated();
	}

	public void testPositive() {
		SelectionSort selectionSort = new SelectionSort();

        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        /** add tests to check for this unit test **/
        arr = selectionSort.basicSelectionSort(arr);
        Assert.assertArrayEquals(arr, Sortedarr);
}

	public void testNegative() {
		SelectionSort selectionSort = new SelectionSort();
		int[] arr = {-3, -8, -9, -1, -2};
		int[] Sortedarr = {-9, -8, -3, -2, -1};
		selectionSort.basicSelectionSort(arr);
		Assert.assertArrayEquals(arr, Sortedarr);
	}

	public void testMixed() {
	}

	public void testDuplicated() {
	}

}
