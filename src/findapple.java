import java.util.Scanner;

public class findapple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] appleNums = new int[n];
        for (int i = 0; i < n; i++) {
            appleNums[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] query = new int[m];
        for (int i = 0; i < m; i++) {
            query[i] = sc.nextInt();
        }
        int[] leftsum = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += appleNums[i];
            leftsum[i] = sum;
        }
        for (int i = 0; i < m; i++) {
            System.out.println(binSearch(leftsum, query[i]) + 1);
        }
    }

    public static int binSearch(int[] arr, int k) {
        int mid = arr.length / 2;
        if (k == arr[mid]) {
            return mid;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (k < arr[mid]) {
                end = mid - 1;
            } else if(k > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
