public class SelectSort {

    /** Prints the values in a*/
    public void printA(int[] a) {
        for (int i = 0; i <= a.length-1; i++) {   //replaced a.length to a.length-1
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /** Sorts the subarray A[start..end] using selection sort */
    public void sort(int[] A, int start, int end) {
        int length = end - start;
        int minIndex = start;

        for (int i = start; i < length; i++) {
            minIndex = i;
            for (int j = i + 1; j < length+1; j++) { //j isnt reaching the last index so I added +1
                if (A[j] < A[minIndex]) minIndex = j; //Wrong Operator. minIndex should be j if the value of j is less than the value of minIndex
                
            }

            swap(A, minIndex, i);
        }
    }

    /** Swaps A[idx1] with A[idx2] */
    public static void swap(int[] A, int idx1, int idx2) {
        int temp = A[idx1]; //int temp should be A[idx1] instead of A[idx2]
        A[idx1] = A[idx2];
        A[idx2] = temp;
    }

    /** Main method sorts default array or values passed as command line args.*/
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7}; // assume default array
        if( args.length > 0 ) {
            // passed an array as commandline arguments
            arr = new int[args.length];
            for( int i=0; i<args.length; i++ ) {
                arr[i] = Integer.parseInt(args[i]);
            }
        }

        SelectSort ss = new SelectSort();

        System.out.println("Original array:");
        ss.printA(arr);

        ss.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        ss.printA(arr);
    }

}
