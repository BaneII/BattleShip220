package battleship;

import battleship.players.*;

/**
 * Created by yoda
 */
public class BattleshipTester {
    public static void main(String[] args) {
        zwallace_BattleshipPlayer a = new zwallace_BattleshipPlayer(); //makes both players hiding ships and sets up reset for fresh board
        zwallace_BattleshipPlayer b = new zwallace_BattleshipPlayer();
        int zwon = 0;
        int awon = 0;
        for (int z=0;z<100;z++){


            Board aBoard = a.hideShips(); //calls to the battleship player and hides ships and prints out the board
            System.out.println(aBoard);

            Board bBoard = b.hideShips();
            System.out.println(bBoard);

            a.reset(); //hides
            b.reset();

            int step = 1;
            for (int i = 0; i < 100; i++) {
                System.out.println("STEP " + step + " ================"); //which turn everyone is on
                bBoard.firedAtThisRound = false; //checks the board
                a.go(bBoard);
                System.out.println(bBoard);

                aBoard.firedAtThisRound = false;
                b.go(aBoard);
                System.out.println(aBoard);

                if (aBoard.isComplete()) { //checks to see who wins on the turn
                    awon++;
                    System.out.println("B Wins!");
                    break;
                }
                if (bBoard.isComplete()) {
                    zwon++;
                    System.out.println("A Wins!");
                    break;
                }
                step++;
            }
        }
        System.out.println(zwon);
        System.out.println(awon);
    }

}
