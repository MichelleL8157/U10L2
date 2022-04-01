import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        int bacteria = numBacteriaAlive(hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static int numBacteriaAlive(int hour) {
        if (hour > 0) {
            hour--;
            return numBacteriaAlive(hour) + numBacteriaAlive(hour) * 2;
        }
        if (hour < 0) { return 0; }
        return 10;
    }

}
