//5 object : guesser, umpire, player1, player2, player3?
import java.util.Scanner;
class Player{
    int numPlayer;
    public int guessNumber() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hey Player, please guess the number!");
        numPlayer=sc.nextInt();
        return numPlayer;
    }
}
class Guesser{
    int numGuesser;
    public int guessNumber() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Hey Guesser, please guess the number!");
        numGuesser=sc.nextInt();
        return numGuesser;
    }
}
class Umpire{
    int numGuesser;
    int numP1;
    int numP2;
    int numP3;

    public void getNumberFromGuesser() {
        Guesser guesser = new Guesser();
        numGuesser = guesser.guessNumber();
    }

    public void collectFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numP1 = p1.guessNumber();
        numP2 = p2.guessNumber();
        numP3 = p3.guessNumber();

    }

    public void calcResult() {
        System.out.println(numGuesser+" " +numP1+" "+numP2+" "+numP3);
        if (numGuesser==numP1){
            if (numGuesser==numP2 && numGuesser==numP3)
                System.out.println(" Game won by all");
            else if (numGuesser==numP2)
                    System.out.println("Player 1 and Player 2 are the Winner");
            else if (numGuesser==numP3)
                System.out.println("Player 1 and Player 3 are the Winner");
            else
                System.out.println("Player 1 is the Winner");
        }
        else if (numGuesser==numP2){
            if (numGuesser==numP3)
                System.out.println("Player 2 and Player 3 are the Winner");
            else
                System.out.println("Player 2 is the Winner");
        }
        else if (numGuesser==numP3){
            System.out.println("Player 3 is the Winner");
        }
        else{
            System.out.println("Match is Draw");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectFromPlayers();
        umpire.calcResult();
    }
}




