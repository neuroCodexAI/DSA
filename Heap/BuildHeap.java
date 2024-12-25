package Heap;

import java.util.*;

public class BuildHeap {

    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int n) {
        arr.add(n);
        int x = arr.size() - 1;
        int par = (x - 1) / 2;
        while (arr.get(x) < arr.get(par)) {
            int temp = arr.get(x);
            arr.set(x, par);
            arr.set(par, temp);
        }
    }

    public static void main(String[] args) {

    }
}