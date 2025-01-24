public class CommonSubsequence {
    public static void main(String[] args){
        System.out.println(longestCommonSubstring("almanacs", "albatross"));
    }

    public static int longestCommonSubstring(String text1, String text2){

        int length = 0;
        int j;
        int k = 0;
        for(int i = 0; i < text1.length(); i++){
            for(j = k; j < text2.length(); j++){
                if(text1.charAt(i) == text2.charAt(j)){
                    length++;
                    k = j+1;
                    break;
                }
            }
        }

        return length;

    }
}
