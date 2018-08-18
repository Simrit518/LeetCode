import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * 输入长度不定的int数组
         */
        Scanner in=new Scanner(System.in);
        String[] s=null;
        s=in.nextLine().split(",");
        int[] nums=new int[s.length];
        for(int i=0;i<s.length;i++){
            nums[i]=Integer.parseInt(s[i]);
        }
        int target=in.nextInt();

        //System.out.println(searchinsertpos(nums,target));


    }

    /**
     *map，collection的用法
     * map存储数字及其出现次数
     */

    public static int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> left=new HashMap<>(),right=new HashMap<>(),count=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int x=nums[i];
            if(left.get(x)==null)
                left.put(x,i);
            right.put(x,i);
            count.put(x,count.getOrDefault(x,0)+1);
        }

        int ans=nums.length;
        int degree=Collections.max(count.values());
        for (int x:count.keySet()){
            if (count.get(x)==degree)
                ans=Math.min(ans,right.get(x)-left.get(x)+1);
        }
        return ans;
    }

}
