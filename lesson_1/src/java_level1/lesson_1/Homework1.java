package java_level1.lesson_1;

public class Homework1 {

    public static void main(String[] args) {
    }

    public void task2(short a, byte b, int c , long d, float e, double f, char g, boolean h){
        byte val1 = 100;
        short val2 = 10000;
        int val3 = 100000;
        long val4 = 1000000L;
        float val5 = 10.11f;
        double val6 = 100.111;
        char val7 = '*';
        boolean val8 = true;
    }

    public int task3(int a, int b, int c, int d) {
        return a *(b + (c / d));
    }

    public boolean task4(int a, int b) {
        return a + b >= -10 && a + b <= 20;
    }

    public void task5(int number) {
        System.out.println(number >= 0 ? "Positive" : "Negative");
    }

    public boolean task6(int val) {
        return val < 0;
    }

    public void task7(String name) {
        System.out.println("Hello, " + name);
    }

    public boolean isLeapYear(int year) {
        if ((year & 3) !=0){
            return false;
        }
        return (year % 100 !=0) || (year % 400 == 0);
    }

}
