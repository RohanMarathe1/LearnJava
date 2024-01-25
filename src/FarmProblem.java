//Calculating the total number of legs of the animals in an farm
public class FarmProblem {
    public static void main(String[] args) {
        int chickens = 2;
        int cows = 3;
        int pigs = 5;

        int totalLegs = (chickens * 2) + (cows * 4) + (pigs * 4);

        System.out.println("Total number of legs: " + totalLegs);
    }
}