
/*
* Find the sum of all the multiples of 3 or 5 below 1000.
* Algorithm:
* pick each number 1 through 1000
* divide number by 3 and 5
* if remainder is 0, add such number to the overall sum
* */


public class SumOfMultiplesOf_3_and_5 {

    public static void main(String[] args){
        int sum = 0;

        for(int i = 0; i < 1000; i++){
            if(((i % 3) == 0) || ((i % 5) == 0)){
                sum += i;
            }
        }

        System.out.println("Sum of all the multiples of 3 or 5 below 1000: " + sum);


    }
}
