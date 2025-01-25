public class NotFibonacci {
    public static void main(String[] args){
        int numOfTerms = 10;
        for (int i = 0; i <= numOfTerms; i++){
            System.out.println("input: "+i);
            System.out.println("output: "+NotFibonacciSequence(i));
        }

        System.out.println("Where in Sequence output: "+ WhereInSequence(6280));
    }

    //0, 1, 3, 11, 39, 61, 182, 547, 1640, 4921 appears to be wrong
    //this is the function described and it outputs differently starting at the 6th value
    public static long NotFibonacciSequence(int numOfTerms){
        long b = 0, a = 1, c;
        long result = 0;
        for (int i = 0; i < numOfTerms; i++){
            result = b;
            c = 3*a + 2*b;
            b=a;
            a=c;
        }
        return result;
    }

    public static int WhereInSequence(int num){
        int i = 0;
        while (NotFibonacciSequence(i)<num){
            i++;
        }
        return i;
    }
}
