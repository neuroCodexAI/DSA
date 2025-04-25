package GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {

    public static ArrayList<Integer> activitySelectionUnSort(int[] start, int[] end) {
        int[][] activity = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        //
        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2])); // sorting the 2d array base on endwork performs
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(activity[0][0]);
        int lastEnd = activity[0][2];
        for (int i = 0; i < end.length; i++) {
            if (activity[i][1] >= lastEnd) {
                ans.add(activity[i][0]);
                lastEnd = activity[i][2];
            }
        }

        return ans;

    }

    // if we have give sorted array of end work time then this approach use
    public static ArrayList<Integer> activitySelectionSolve(int[] start, int[] end) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                ans.add(i);
                lastEnd = end[i];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        // if end time not sorted
        ArrayList<Integer> ans = activitySelectionUnSort(start, end);

        // if end time sorted
        ArrayList<Integer> ans1 = activitySelectionSolve(start, end);

        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i));

        }

        System.out.println("Work task no: " + ans.size());
    }
}
