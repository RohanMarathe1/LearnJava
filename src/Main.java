public class Main {

    public static void main(String[] args){
        Looping looping = new Looping() ;
        looping.replaceWithLoop();

        NumberWar numberWar = new NumberWar() ;
        numberWar.sumOfEvenOdd();

        StringSwapper stringSwapper = new StringSwapper() ;
        System.out.println(stringSwapper.swapFirstAndLast("ROHAN"));

        Loop loop = new Loop() ;
        loop.replaceChar();

      FarmProblem farmProblem = new FarmProblem() ;
      farmProblem.calc_num_animals();


    }
}
