import java.util.Arrays;
import java.util.Scanner;

public class ArrayEX {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String[] s;
        s=in.nextLine().split(",");
        int[] digits=new int[s.length];
        for (int i=0;i<s.length;i++){
            digits[i]=Integer.parseInt(s[i]);
        }

        System.out.println(Arrays.toString(plusOne(digits)));
//        for (int i=0;i<digits.length;i++){
//            System.out.println(digits[i]);
//        }

    }

    public static int searchinsertpos(int[] nums,int target){
        if (nums==null|| nums.length<=0)
            return -1;
        int index=0;
        for (;index<nums.length;index++){
            if (nums[index]>=target)
                return index;
        }
        return index;
        //垃圾代码
//        int index=0;
//        if (target==nums[nums.length-1])
//            return nums.length-1
//        if (target>nums[nums.length-1])
//            return nums.length;
//        for(int i=0;i<nums.length-1;i++){
//            if (target==nums[i])
//                index=i;
//            if (target>nums[i]&&target<nums[i+1])
//                index=i+1;
//        }
//        return index;
    }
    //太巧了这方法，一旦执行if就返回！！！
    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;
        return newNumber;
    }


}
