package test;

public class test8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newArr = copyOfRange(arr, 2, 5);
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] result = new int[to - from];
        for (int i = from; i < to; i++) {
            result[i - from] = arr[i];
        }
        return result;
    }
}