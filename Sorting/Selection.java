package Sorting;

public class Selection {
    public int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int min_idx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min_idx]) {
                    min_idx = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[min_idx];
            nums[min_idx] = temp;
        }

        return nums;
    }

    public int getSecondLargest(int[] arr) {
        // code here
        int first = Integer.MIN_VALUE;
        int secound = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > first) {
                secound = first;
                first = i;
            } else if (i > secound && i != first) {
                secound = i;
            }
        }

        return (secound == Integer.MIN_VALUE) ? -1 : secound;
    }

    public static void main(String[] args) {
        Selection sort = new Selection();
        int nums[] = { 7, 4, 1, 5, 3 };

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        nums = sort.selectionSort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println(sort.getSecondLargest(nums));

    }
}
