import java.util.Scanner;

public class genmaxint {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);

        int n= in.nextInt();
        String[] nums=new String[n];
        for (int i=0;i<n;i++){
            nums[i]=in.next();
        }
        System.out.println(maxnum(nums));

    }

    public static String maxnum(String[] nums){
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1-i;j++){
                if ((nums[j]+nums[j+1]).compareTo(nums[j+1]+nums[j])>0){
                    String temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }

        StringBuffer ans=new StringBuffer();
        for (int i=nums.length-1;i>=0;i--){
            ans.append(nums[i]);
        }
        return ans.toString();
    }
}
