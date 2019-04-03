/*
*   The prime factors of 13195 are 5, 7, 13 and 29.

    What is the largest prime factor of the number 600851475143 ?

* */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LargestPrimeFactor {

    public static Set<Integer> sieveOfErasthothenes(int primeLimit){
        Set<Integer> primes = new HashSet<>();
        if(primeLimit >= 1){
            //find primes up to their limit
            for(int i = 2; i < primeLimit; i++){
                for(int j = 1; j <= i; j++){
                    if((i%j) == 0){
                        primes.add(i);
                        //remove even numbers other than 2
                        if(((i % 2) == 0) && (i != 2)){
                            primes.remove(Integer.valueOf(i));
                        }
                        //remove multiples of 3 other than 3
                        if(((i % 3) == 0) && (i != 3)){
                            primes.remove(Integer.valueOf(i));
                        }
                    }
                }
            }
        }
        else{
            //return -1 if primeLimit is less than 1;
            primes.add(-1);
        }

        return primes;
    }

    public static int largestPrimeFactor(int number){
        int largestPrimeFactor = -1;
        //divide the given number by prime numbers less than that number


        return largestPrimeFactor;
    }
}
