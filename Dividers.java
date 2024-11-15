import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dividers{

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = input.nextInt();
        
        solution(number);
    }

    public static void solution(int number){
       
        
        int divider_count = 0;
        int divider_sum = 0;
        ArrayList<Integer> all_dividers = new ArrayList<>();

       
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                all_dividers.add(i);
                divider_count++;
            }
        }

        System.out.println("Dividers count: " + divider_count + "\nDividers summ: " + sum(all_dividers) + "\nGreatest divisor:" + greatestDivisor(all_dividers, number));

    }
    public static Integer sum(ArrayList<Integer> list){
        int result = 0;
        for (Integer number : list){
            result += number;
        }
        return result;
    }

    public static Integer greatestDivisor(ArrayList<Integer> list, Integer general_number){

        ArrayList<Integer> all_listed_dividers = new ArrayList<>();

        for (Integer number : list){

            if (number < general_number){
                all_listed_dividers.add(number);
                // System.out.println(number);
            }

        }
        return Collections.max(all_listed_dividers);

    }

}