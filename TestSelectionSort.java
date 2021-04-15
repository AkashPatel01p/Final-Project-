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
	}

	public void testNegative() {
	}

	public void testMixed() {
		SelectionSort selectionSort = new SelectionSort();
		int[] arr = {-2, -1, 1, 0};
		int[] Sortedarr = {-2, -1, 0, 1};
		selectionSort.basicSelectionSort(arr);
		Assert.assertArrayEquals(arr, Sortedarr);
	}

	public void testDuplicated() {
		SelectionSort selectionSort = new SelectionSort();
		int[] arr = {0, 0, 1};
		int[] Sortedarr = {0, 0, 1};
		selectionSort.basicSelectionSort(arr);
		Assert.assertArrayEquals(arr, Sortedarr);
	}

}
