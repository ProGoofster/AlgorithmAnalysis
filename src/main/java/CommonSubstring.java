public class CommonSubstring {
    public static void main(String[] args){
        System.out.println(LargestCommonSubstring("1234567", "qiugbqo"));
    }

    //I chose to program this one, I added lots of comments to show I know what my code does

    //the time complexity of the following function is O(n^2*m), n is length of smaller string, m is larger
    //the big-omega time complexity would omega(1), because if they match it doesn't ever loop
    public static String LargestCommonSubstring(String text1, String text2){
        //make sure text2 is always the smallest String (not allowed to use Math.min()), O(1)
        if(text2.length() > text1.length()) return LargestCommonSubstring(text2, text1);

        //change substring length, starting, O(n)
        for(int len = text2.length(); len > 0; len--) {
            //iterate through text1, with a substring of size "len", O(n)
            for(int i = 0; i <= text1.length() - len; i++){
                //get substring of text2 of size len starting at i, O(1)
                String substring1 = text1.substring(i, i + len); //I hope I'm allowed to use .substring() :)
                //iterate through text2, with a substring of size "len", O(n)
                for(int j = 0; j <= text2.length() - len; j++){
                    //get substring of text2 of size len starting at j
                    String substring2 = text2.substring(j, j + len);

                    if (substring1 == substring2) return substring1;
                }
            }
        }

        return "";
    }
}
