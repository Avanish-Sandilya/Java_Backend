class Main{
    public static int factorial(int num){
        if(num>1){
            return num*factorial(num-1);
        }
        return 1;
    }

    public static int fib(int num){
       if(num==1||num==0){
           return num;
       }
       return fib(num-1)+fib(num-2);
    }


    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fib(7));
    }
}
