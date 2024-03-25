
public class Array2dUtility {

    // Declare all methods as static.

    // 1. print
    // Implement a method called print that prints out the values of a 2D array of integers row by row.
    public static void print(int[][] array2d) {
        for (int[] numberArray : array2d) {
            for (int number : numberArray) {
                System.out.println(number+" ");
            }
            System.out.println("\n");
        }
    }

    // 2. sum
    // Implement a method called sum that returns the sum of a 2D array of integers
    public static int sum(int[][] array2d) {
        int sum = 0;
        for (int[] numberArray : array2d) {
            for (int number : numberArray) {
                sum+=number;
            }
        }
        return sum;
    }

    // 3. average
    // Implement a method called average that returns the average value of a 2D array of integers.
    // You may assume that the 2D array is a square. That is, it has the same number of rows and columns.
    // Reminder: call your sum method within the average method.
    public static double average(int[][] array2d) { // use double in case the sum of elements is not evenly divisible by number of elements
        double count = array2d.length*array2d.length;
        return sum(array2d)/count;
    }

    // 4. minimum
    // Implement a method called minimum that returns the minimum value of a 2D array of integers.
    public static int minimum(int[][] array2d) {
        int smallestValue = array2d[0][0];
        for (int[] numberArray : array2d) {
            for (int i = 0; i<numberArray.length; i++) {
                if (numberArray[i]<smallestValue) {
                    smallestValue=numberArray[i];
                }
            }
        }
        return smallestValue;
    }

    // 5. maximum
    // Implement a method called maximum that returns the maximum value of a 2D array of integers.
    public static int maximum(int[][] array2d) {
        int biggestValue = array2d[0][0];
        for (int[] numberArray : array2d) {
            for (int i = 0; i<numberArray.length; i++) {
                if (numberArray[i]>biggestValue) {
                    biggestValue=numberArray[i];
                }
            }
        }
        return biggestValue;
    }

    // 6. evenCountStandard
    // Implement a method called evenCountStandard that returns the number of even numbers in a 2D array of integers.
    // Use a standard for loop to implement this method.
    public static int evenCountStandard(int[][] array2d) {
        int evenCount = 0;
        for (int i=0; i<array2d.length; i++) {
            for (int j=0; j<array2d[i].length; j++) {
                if (array2d[i][j]%2==0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 7. evenCountEnhanced
    // Implement a method called evenCountEnhanced that returns the number of even numbers in a 2D array of integers.
    // Use an enhanced for loop to implement this method.
    public static int evenCountEnhanced(int[][] array2d) {
        int evenCount = 0;
        for (int[] numberArray : array2d) {
            for (int number : numberArray) {
                if (number%2==0) {
                    evenCount++;
                }
            }
        }
        return evenCount;
    }

    // 8. allPositive
    // Implement a method called allPositive that returns true if all the values in a 2D array of integers are positive.
    public static boolean allPositive(int[][] array2d) {
        for (int[] numberArray : array2d) {
            for (int number : numberArray) {
                if (number<0) {
                    return false;
                }
            }
        }
        return true;
    }

    // 9. rowSums
    // Implement a method called rowSums that returns a one dimensional array that contains the sum of each row at each index.
    public static int[] rowSums(int[][] array2d) {
        int[] rowSums = new int[array2d.length];
            for (int i = 0; i<array2d.length; i++) {
                for (int number : array2d[i]) {
                    rowSums[i]+=number;
                }
            }
        return rowSums;
    }

    // 10. colSums
    // Implement a method called colSums that returns a one dimensional array that contains the sum of each col at each index.
    public static int[] colSums(int[][] array2d) {
        int[] colSums = new int[array2d.length];
        for (int i=0; i<array2d[0].length; i++) {
            for (int j=0; j<array2d.length; j++) {
                colSums[i]+=array2d[j][i];
            }
        }
        return colSums;
    }
}
