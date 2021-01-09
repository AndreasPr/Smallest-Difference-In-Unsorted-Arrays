import java.util.Arrays;

/**
 * Created on 09/Jan/2021 to Smallest-Difference
 */
public class smallestDifference {

    private static void findDifference(int[] arr1, int[] arr2){

        int minimum = Integer.MAX_VALUE;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int arr1PairPart = 0;
        int arr2PairPart = 0;
        for(int i = 0; i < arr2.length - 1; i++){

            for(int j = 0; j < arr1.length; j++){
                if(Math.abs(arr2[i] - arr1[j]) < minimum){
                    minimum = Math.abs(arr2[i] - arr1[j]);
                    arr1PairPart = arr1[j];
                    arr2PairPart = arr2[i];
                }
            }
        }
        System.out.println("The pair is: ("+ arr1PairPart + "," + arr2PairPart +")");
        System.out.println("The minimum difference is: " + minimum);
    }

    public static void main(String args[]){
        int[] arr1 = {1,3,15,11,2};
        int[] arr2 = {23,127,235,19,8};

        findDifference(arr1, arr2);
    }
}
