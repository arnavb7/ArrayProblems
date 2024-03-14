public class Arrays {

    // Difficulty: Easy
    // Print all the elements of the array with a space in between and a newline after the last element.
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    // Difficulty: Easy
    // Implement a function that takes in an array, and gets the maximum element in the array.
    // For example, for an array [0, -1, 5, 4, 3, 2, 8], the answer is 8.
    public static int maxValue(int[] arr) {
        int currentMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
        }
        return currentMax;
    }

    // Difficulty: Easy
    // Implement a function that takes in an array, and gets the index of the maximum element in the array.
    // For example, for an array [0, -1, 5, 4, 3, 2, 8], the answer is 6.
    public static int maxIndex(int[] arr) {
        int currentMax = arr[0];
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
                maxIndex = i;

            }
        }
        return maxIndex;
    }

    // Difficulty: Easy
    // Implement a function that takes an array in and returns the sum of all the elements in the array, minus the product of all the elements in the array.
    public static int sumMinusProduct(int[] arr) {
        int currentSum = 0;
        int currentProduct = 1;
        for (int i = 0; i < arr.length; i++) {
            currentSum = arr[i] + currentSum;
            currentProduct = arr[i] * currentProduct;
        }
        return currentSum - currentProduct;
    }

    // Challenge problem!
    // Difficulty: Hard
    // Given an array, return another array that in each spot has the product of all the elements EXCEPT that element.
    // For example [4, 5, 2, 1, 3] would return [30, 24, 60, 120, 40]
    public static int[] productExcept(int[] arr) {
        return null;
    }

    // Difficulty: Easy
    // Given an array, return a boolean if the numbers are all consecutive. ([4, 5, 6] would return true, [4, 8, 9] would not)
    public static boolean isConsecutive(int[] arr) {
        boolean consecutive = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                return false;
            }
        }
        return true;
    }

    // Difficulty: Medium
    // Given an array and a target, return true if there are two elements in the array that sum to the target, false if no.
    public static boolean twoSum(int[] arr, int target) {

        return false;
    }

    // Difficulty: Easy
    // Print the 2D array with a new line in between each individual array, spaces in between the elements.
    public static void print2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            printArray(arr[i]);
        }
    }

    // Difficulty: Medium
    // Max of each array in the 2D array given.
    // Implement this two ways: First do this without calling any other functions.
    // Then, do this using your maxValue function implemented earlier.
    public static int[] maxValues(int[][] arr) {

        return null;
    }

    // Difficulty: Easy
    // Given an array and an element, return the index of that element
    public static int search(String[] arr, String e) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    // Difficulty: Medium
    // Swap the elements in spots i and j.
    // For example: [0, 5, 4, 9, 8], 2, 4 --> [0, 5, 8, 9, 4]
    public static void swap(int[] arr, int i, int j) {

    }

    // Difficulty: Hard
    // Given an array of integers, return a sorted version of the array (sorted least to greatest).
    // Hint: Use your swap function and maxValue function!
    public static int[] sort(int[] arr) {

        return null;
    }

    // Difficulty: Medium
    // Return a resized array of newLength, with the same elements as the original array in the same spots.
    public static int[] resizeArray(int[] arr, int newLength) {

        return null;
    }

    public static void main(String[] args) {

        // Arrays are fixed size.
        // Creating an array:
        // Int array --> int[]
        // String[]
        // Here is an int array initialization:
//        int[] arnav = new int[10];
//        String[] rohin = new String[5];
//        int a = 5;
//        int b = 100;
//        a = b;
//        b = 7;
//        System.out.println(a);
//        System.out.println(b);
//        int[] rabina = {1, 2, 3};
//        int[] maneesh = {1, 2, 3};
//        System.out.println(maneesh[0]);
//        rabina[0] = 5;
//        System.out.println(maneesh[0]);
//        System.out.println(rabina.length);
        int[] arr = {0, -1, 5, 4, 3, 2, 8};
        printArray(arr);
        int output = maxValue(arr);
        if (output == 8) {
            System.out.println("Max Value works correctly!");
        } else {
            System.out.println("Max Value failed :(");
        }
        output = maxIndex(arr);
        if (output == 6) {
            System.out.println("Max Index works correctly!");
        } else {
            System.out.println("Max Index failed :(");
        }
        output = sumMinusProduct(arr);
        if (output == 21) {
            System.out.println("Sum Minus Product works correctly!");
        } else {
            System.out.println("Sum Minus Product failed :(");
        }
        int[] arr2 = {2, 5, 6, 7, 8};
        boolean output1 = isConsecutive(arr2);
        if (!output1) {
            System.out.println("Is Consecutive works correctly!");
        } else {
            System.out.println("Is Consecutive failed :(");
        }
        String[] arr3 = {"Print Array" , "Max Value" , "Max Index" , "Sum Minus Product" , "Is Consecutive"};
        output = search(arr3,"asdf");
        if (output == -1) {
            System.out.println("Search works correctly!");
        } else {
            System.out.println("Search failed :(");
        }
        output = search(arr3, "Sum Minus Product");
        if (output == 3) {
            System.out.println("Search works correctly again!");
        } else {
            System.out.println("Search failed :(");
        }
        int[][] arr5 = new int[10][10];
        int ct = 0;
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                arr5[i][j] = ct;
                ct++;
            }
        }
        print2D(arr5);
        








    }
}
