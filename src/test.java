public class test {
    public static void main(String[] args){
        int i=3;
        while (i!=0){

        }
    }

    /**
     * 20. Valid Parentheses
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid.
     */
//    public  static boolean isValid(String s) {
//        Stack<Character> ss = new Stack<>();
//        for (int i = 0; i < s.length(); i++) {
//            char a = s.charAt(i);
//            if (a == '(' || a == '[' || a == '{')
//                ss.push(a);
//            else if (a == ')') {
//                if (!ss.empty() && ss.pop() == '(') ;
//                else
//                    ss.push(a);
//            } else if (a == ']') {
//                if (!ss.empty() && ss.pop() == '[') ;
//                else
//                    ss.push(a);
//            } else if (a == '}') {
//                if (!ss.empty() && ss.pop() == '{') ;
//                else
//                    ss.push(a);
//            }
//        }
//        return ss.empty();
//    }
}
