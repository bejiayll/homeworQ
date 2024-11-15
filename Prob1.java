import java.util.Scanner;

class Prob1{

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("The sequence: d(n) = 0.1 * d(n-1) + 10 ; d(1) = 9");
        System.out.print("Enter the final index of the sequence: ");
        int num = input.nextInt();
        System.out.print("Processed...\n");
        float result = d(num);
        System.out.println("Result: " + result);

    }


    public static float d(int n){

        float dn = 9.0f;
        for (int i = 2; i <= n; i++){
            dn = (float) ((0.1 * dn) + 10);
            System.out.println(dn);
        } 

        return dn;

    }

}
