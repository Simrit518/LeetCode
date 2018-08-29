import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayEX {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String[] s;
        s=in.nextLine().split(",");
        int[] nums=new int[s.length];
        for (int i=0;i<s.length;i++){
            nums[i]=Integer.parseInt(s[i]);
        }
        int target=in.nextInt();
        ArrayEX arrayEX=new ArrayEX();
        int len=arrayEX.removeElement(nums,target);
        System.out.println(len);

        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


    }

    public  int searchinsertpos(int[] nums,int target){
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
    public  int[] plusOne(int[] digits) {

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

    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int sum;
        while (i<j){
            sum=numbers[i]+numbers[j];
            if (sum==target)
                return new int[]{i+1,j+1};
            else if (sum<target)
                i++;
            else
                j--;
        }
        return null;
//        int[] result=new int[2];
//        for (int i=0;i<numbers.length-1;i++){
//            for (int j=i+1;j<numbers.length;j++){
//                if (numbers[i]+numbers[j]==target){
//                    result[0]=i+1;
//                    result[1]=j+1;
//                }
//            }
//        }
//        return result;
    }

    public void moveZeroes(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[count]=nums[i];
                count++;
            }
        }

        for (int i=count;i<nums.length;i++){
            nums[i]=0;
        }
    }

    public void rotate(int[] nums, int k) {

        int[] temp=new int[nums.length];
        for (int i=0;i<temp.length;i++){
            int index_new=(i+k)%nums.length;
            temp[index_new]=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
   }

    public int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==val)
                count++;
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]==val){
                for (int j=i+1;j<nums.length;j++){
                    if (nums[j]!=val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        break;
                    }
                }
            }
        }
        return nums.length-count;
    }

}
