package javarush.javacore.greatestCommonDivisor;
/*
найдем наибольший общий делитель (НОД). Для этого:
Введи с клавиатуры 2 целых положительных числа.
Выведи в консоли наибольший общий делитель.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int first = enterPositiveInteger();
        int second = enterPositiveInteger();
        System.out.println(greatestCommonDivisor(first, second));
    }

    public static int enterPositiveInteger(){
        int number = 0;
        try( BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            do{
                System.out.println("Enter positive integer:");
                number = Integer.parseInt(reader.readLine());
            } while(number < 0);
        } catch(Exception e){
            e.printStackTrace();
        }
        return number;
    }
    public static int greatestCommonDivisor(int first, int second){
        if(first < 0 || second < 0){
            throw new IllegalArgumentException();
        }

        while (second != 0) {
            int i = first % second;
            second = first;
            first = i;
        }
        return first;
    }
}
