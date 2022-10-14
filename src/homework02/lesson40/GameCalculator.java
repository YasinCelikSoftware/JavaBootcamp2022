package homework02.lesson40;
//Abstract classes  don't have to contain an abstract method.
//If I have to define an abstract method, it must end with ";" and there must be an abstract keyword.
//YOU CAN'T USE NEW KEYWORD FOR AN ABSTRACT CLASS.
public abstract class GameCalculator  {

    public abstract void calculate();

    public final void gameOver(){

        System.out.println("Game is over! Try again.");

    }

}
