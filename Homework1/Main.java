package Homework1;

public class Main {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;

        boolean canWalk = isWeekend && !isRain;
        System.out.println(canWalk);
    }
}
