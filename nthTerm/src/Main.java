public class Main {
    public static void main(String[] args) {
        System.out.println(nthTerm(4));
    }

    private static int nthTerm(int n){
        return n*(n+1)/2;
    }

}
