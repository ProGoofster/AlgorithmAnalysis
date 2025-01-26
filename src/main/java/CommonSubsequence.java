public class CommonSubsequence {
    public static void main(String[] args){
        String in1 = "almanacs", in2 = "albatross";
        System.out.println("input: " + in1 + ", " + in2);
        System.out.println("output: " + longestCommonSubstringSize(in1, in2));
    }

    //This is an O(n^2) algorithm. you can see how
    public static int longestCommonSubstringSize(String text1, String text2){

        int length = 0;
        int j;
        int k = 0;
        //the worst case time complexity is O(n*m) where n and m are the lengths of the two strings
        //the best case is Ω(n) where n is the length of the shorter string
        //this happens if the string are identical
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
