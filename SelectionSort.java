package main;

public class SelectionSort {
	 private int temp;

	/** Creates a new instance of SelectionSort */
   public SelectionSort() {
   }
   
   /* A simple SelectionSort algorithm
    * pre-condition: None
    * post-condition: is in acessending order 
    * inputs: x 
    * outputs: returns x 
    * special conditions: x is an empty list, returns an empty list 
    * time: O(x.length) 
    * space: O(1) 
    */    
   public int[] basicSelectionSort(int[] x) {
       for (int i = 0; i < x.length; ++i) {
           for (int j= i+1; j < x.length; ++j) {
               if (x[i] > x[j]) {
                   temp = x[i];
                   x[i] = x[j];
                    
                   temp = x[j];
               }
           } // end of inner for loop
       } // end of outer for loop
       return x;
   } // end of basicSelectionSort method

}


