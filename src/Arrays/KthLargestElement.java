package Arrays;

import java.util.PriorityQueue;

public class KthLargestElement {
    static int[] tempArray = new int[]{ 7,10,4,3,20,15};
    static int findLargestElement = 2;
    static int[] valueStack = new int[2];

    public static void main(String[] args) {
        int largestElement = getLargestElement(tempArray,findLargestElement);
        System.out.println(largestElement);
        int smallestElement = getSmallestElement(tempArray,findLargestElement);
        System.out.println(smallestElement);
    }

    private static int getLargestElement(int[] arr , int elementToFind) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int j : arr) {
            queue.add(j);

            if(queue.size() > elementToFind){
                queue.poll();
            }
        }
        return queue.peek();
    }

    private static int getSmallestElement(int[] arr , int elementToFind) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int j : arr) {
            queue.add(j);
            if(queue.size() > elementToFind){
                queue.poll();
            }
        }
        return queue.peek();
    }
}
