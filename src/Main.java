import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double numbers[] = {-1.2, -2.5, -3.7, 4.0, -5.6, -6.3, 7.8, -8.1, -9.4, 10.9, 11.2, 12.5, 13.3, -14.7, -15.0};
        double sumOfNum = 0;
        int numOfPositiveNumber = 0;
        for (double num:numbers
             ) {
            if (num > 0){
                sumOfNum += num;
                numOfPositiveNumber++;
            }
        }
        System.out.println("среднее арифметическое положительных чисел = " + sumOfNum/numOfPositiveNumber);
        System.out.println("---------------");
    }
}
