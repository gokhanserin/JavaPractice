package group9Meeting;

public class SumOfLeftAndRight {

    public static void main(String[] args) {



       int[] arr = {4, 9, 1, 3, 6, 4};
        for (int i = 1; i < arr.length-1; i++) {  // i is index number
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {  // j is the last index number on the left
                leftSum += arr[j];
            }
            for (int k = arr.length - 1; k > i; k--) {  // k is the first index number on the right
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                break;
            }
        }
    }



    }


/*
2-Given an array of integers, write a function to return the index of an item
 *   in the array, where the sum of all items on its left is equal to the sum
 *   of the ones on the right.
 *   For example :
       Given [4, 9, 1, 3, 6, 4]
       your function should return 2
       because the item at index 2 is 1, and 4+9 =3+6+4
[6:37 PM]
save your solution until meeting please folks
 */
