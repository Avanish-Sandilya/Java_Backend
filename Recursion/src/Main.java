class Main {
    //code to find factorial
    public static int factorial(int num) {
        if (num > 1) {
            return num * factorial(num - 1);
        }
        return 1;
    }

    //code to find fib number
    public static int fib(int num) {
        if (num == 1 || num == 0) {
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }

    //code to find sum of first n natural numbers
    public static int sumOfN(int num) {
        if (num == 0) {
            return num;
        }
        return num + sumOfN(num - 1);
    }

    //power of a number

    public static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        return num * power(num, pow - 1);
    }

    //Tree recursion

    public static void treeRecursion(int num) {
        if (num > 0) {
            System.out.println(num);
            treeRecursion(num - 1);
            treeRecursion(num - 1);
        }
    }

    //Tower of Hanoi
    public static void TOH(int disks, int towA, int towB, int towC) {
        if (disks > 0) {
            TOH(disks - 1, towA, towC, towB);
            System.out.print(towA + " " + towC + " ");
            TOH(disks - 1, towB, towA, towC);
        }
    }


    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(fib(7));
//        System.out.println(sumOfN(5));
//        System.out.println(power(5,3));
        // treeRecursion(3);
        TOH(3,1,2,3);

    }
}
