public class NumberWar {
    // Create a function that takes an array of integers, sums the even and odd numbers separately,
    // then returns the difference between the sum of the even and odd numbers.
        public void sumOfEvenOdd() {
            int[] numbers = { 1, 3, 6, 8, 15, 30 };
            int sumEven = 0;
            int sumOdd = 0;

            for (int number : numbers) {
                if (number % 2 == 0) {
                    sumEven += number;
                } else {
                    sumOdd += number;
                }
            }

            int difference = sumEven - sumOdd;
            System.out.println("Difference between sum of even and odd numbers: " + difference);
            if (sumEven > sumOdd) {
                System.out.println("The sum of even numbers is higher.");
            } else if (sumOdd > sumEven) {
                System.out.println("The sum of odd numbers is higher.");
            } else {
                System.out.println("The sum of even and odd numbers is equal.");
            }


        }

    }







