// Create all heap operation for min_heap in java 
package Heap;

import java.util.*;

public class BuildHeap {

    ArrayList<Integer> arr = new ArrayList<>();

    // add function in min heep
    public void add(int n) {
        arr.add(n);
        int x = arr.size() - 1;
        int par = (x - 1) / 2;
        while (arr.get(x) < arr.get(par)) {
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
        }
    }

    // get function in min heap
    public int peek() {
        return arr.get(0);
    }

    public void heapify(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int minidx = idx;

        if (left < arr.size() && arr.get(minidx) > arr.get(left)) {
            minidx = left;
        }

        if (right < arr.size() && arr.get(minidx) > arr.get(right)) {
            minidx = right;
        }

        if (minidx != idx) {
            int temp = arr.get(idx);
            arr.set(idx, arr.get(minidx));
            arr.set(minidx, temp);

            heapify(minidx);
        }

    }

    // to delete in min heap
    public int remove() {
        int data = peek();

        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        arr.remove(arr.size() - 1);

        // heapify
        heapify(0);

        return data;
    }

    // isEmpty
    public boolean isEmpty() {
        return arr.size() == 0;
    }

    public static void main(String[] args) {
        BuildHeap pq = new BuildHeap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(2);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();

        }
    }
}