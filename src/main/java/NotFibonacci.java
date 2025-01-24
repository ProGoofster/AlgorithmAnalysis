public class NotFibonacci {
    public static void main(String[] args){
        int in = 1;
        System.out.println("input: " + in);
        System.out.println("output: ");
        NotFibonacciSequence(10);
    }

    //0, 1, 3, 11, 39, 61, 182, 547, 1640, 4921 appears to be wrong
    //this is the function described and it outputs differently starting at the 6th value
    public static void NotFibonacciSequence(int numOfTerms){
        long b = 0, a = 1, c;
        for (int i = 0; i < numOfTerms; i++){
            System.out.println(b);
            c = 3*a + 2*b;
            b=a;
            a=c;
        }
    }
}
