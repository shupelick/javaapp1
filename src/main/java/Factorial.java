import java.util.Scanner;

class Factorial {

    private int fact(int n) {
        int result;
        if ((n == 1)||(n == 0))
            return 1;
        result = fact(n - 1) * n;
        return result;
    }

    public static void main(String[] arg)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int input = in.nextInt();
        Factorial f = new Factorial();
        System.out.println(f.fact(input));
    }
}
