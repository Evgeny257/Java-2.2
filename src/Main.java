package src;

public class Main {
    public static void main(String[] args) {
        int check = 100;
        int add = 300;
        int bonus = 0;
        int sum;
        if (add >= 1000) {
            bonus = add / 100;
            sum = check + add + bonus;
            System.out.println("Your balance is " + sum + ". Your bonus is " + bonus);
        }
        else {
            sum = check + add;
            System.out.println("Your balance is " + sum + ". Your bonus is " + bonus);
        }

    }
}
