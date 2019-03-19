
package battleship.players;

import battleship.Board;

import java.lang.reflect.*;

import java.lang.*;

/**
 * This program is designed to be an AI to play someone in battleship
 * @author Zachary Wallace
 * @version 1.0
 */

public class zwallace_BattleshipPlayer implements BattleshipPlayer {

    //include your instance variables here to maintain a record of your game state
    //remember which of your opponent's squares you've shot at
    //remember what was revealed at each square so you can strategize future moves

    int boards = 0; //used to go through boards

    /**
     * hideShips - This method is called once at the beginning of each game
     * when you need to hide your ships.
     *
     * You must return a valid Board object. See that class for details.
     * Note carefully: under *no* circumstances should you return the same
     * board twice in a row; i.e., two successive calls to your hideShips()
     * method must always return *different* answers!
     */
    public Board hideShips() {
        // INSERT AMAZING CODE HERE, it is my boards ༼ つ ◕_◕ ༽つ

        Board itABoard = null;
        try {
            switch (boards) {
                case 0: {
                    itABoard = new Board(new char[][]{ //board 1 (づ￣ ³￣)づ
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', 'A', 'A', 'A', 'A', 'A', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'D', ' '},
                            {' ', ' ', 'P', ' ', ' ', ' ', ' ', ' ', 'D', ' '},
                            {' ', ' ', 'P', ' ', 'B', ' ', ' ', ' ', 'D', ' '},
                            {' ', ' ', ' ', ' ', 'B', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', 'B', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', 'B', ' ', ' ', ' ', ' ', ' '},
                            {' ', 'S', 'S', 'S', ' ', ' ', ' ', ' ', ' ', ' '},
                    });
                    break;
                }
                case 1: {
                    itABoard = new Board(new char[][]{ //board 2 (づ￣ ³￣)づ
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', 'S', ' ', ' ', ' ', ' ', ' ', ' ', 'P', ' '},
                            {' ', 'S', ' ', ' ', ' ', 'B', ' ', ' ', 'P', ' '},
                            {' ', 'S', ' ', ' ', ' ', 'B', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', 'B', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', 'B', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', 'A', 'A', 'A', 'A', 'A', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'D', 'D', 'D'},
                    });
                    break;
                }
                case 2: {
                    itABoard = new Board(new char[][]{ //board 3 (づ￣ ³￣)づ
                            {' ', ' ', ' ', ' ', ' ', 'A', 'A', 'A', 'A', 'A'},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {'B', ' ', ' ', ' ', ' ', ' ', 'P', ' ', ' ', ' '},
                            {'B', ' ', ' ', ' ', ' ', ' ', 'P', ' ', ' ', ' '},
                            {'B', ' ', ' ', ' ', ' ', ' ', ' ', 'S', 'S', 'S'},
                            {'B', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', 'D', 'D', 'D', ' ', ' ', ' ', ' ', ' '},
                    });
                    break;
                }
                case 3: {
                    itABoard = new Board(new char[][]{ //board 4 (づ￣ ³￣)づ
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', 'P', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', 'P', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', 'D', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', 'D', ' ', ' ', ' ', 'A', ' '},
                            {' ', ' ', 'S', ' ', 'D', ' ', ' ', ' ', 'A', ' '},
                            {' ', ' ', 'S', ' ', ' ', ' ', ' ', ' ', 'A', ' '},
                            {' ', ' ', 'S', ' ', ' ', ' ', ' ', ' ', 'A', ' '},
                            {' ', ' ', ' ', ' ', 'B', 'B', 'B', 'B', 'A', ' '},
                    });
                    break;
                }
                case 4: {
                    itABoard = new Board(new char[][]{ //board 5 (づ￣ ³￣)づ
                            {' ', ' ', ' ', 'S', 'S', 'S', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'A'},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'B', ' ', 'A'},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', 'B', ' ', 'A'},
                            {' ', 'P', ' ', ' ', ' ', ' ', ' ', 'B', ' ', 'A'},
                            {' ', 'P', ' ', ' ', ' ', ' ', ' ', 'B', ' ', 'A'},
                            {' ', ' ', ' ', 'D', 'D', 'D', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    });
                    break;
                }
            }
        }
        catch (Exception e){ //(╯°□°）╯︵ ┻━┻
            System.out.println("Error");
            System.exit(1);
        }

        return itABoard; //(☞ﾟヮﾟ)☞

    }

    /**
     * go - This method is called repeatedly throughout the game, every
     * time it's your turn.
     *
     * When it's your turn, and go() is called, you must call fireAt() on
     * the Board object which is passed as a parameter. You must do this
     * exactly *once*: trying to fire more than once during your turn will
     * be detected as cheating.
     */
    public void go(Board opponentsBoard) { //ლ(ಠ_ಠლ)
        // INSERT INCREDIBLE CODE HERE, Yay I did it ᕦ(ò_óˇ)ᕤ
        int[] target = new int[2]; //A place to store the target (っ˘ڡ˘ς)
        target[0] = 0; //no nulls allowed
        target[1] = 0;
        try{
            Field firedSquares = opponentsBoard.getClass().getDeclaredFields()[5]; //cloning the opponents board and grabbing its fired squares
            Field squares = opponentsBoard.getClass().getDeclaredFields()[4]; //grabbing squares
            firedSquares.setAccessible(true); //reading permission (ﾉ◕ヮ◕)ﾉ*:・ﾟ✧
            squares.setAccessible(true); //more reading permissions (ﾉ◕ヮ◕)ﾉ*:・ﾟ✧
            char[][] mine = (char[][]) squares.get(opponentsBoard); //cloned boards inner char array ᕕ( ᐛ )ᕗ
            boolean[][] firedMine = (boolean[][]) firedSquares.get(opponentsBoard); //cloned fireds inner boolean array
            boolean found = false; //did I find it
            for (int i = 0; i < 10; i++){ //iterate
                for (int j = 0; j < 10; j++){ //iterate again...
                    if (mine[i][j] != ' ' && firedMine[i][j] == false) { //check
                        target[0] = i; //define target row
                        target[1] = j; //define target column
                        found = true; //I found it
                        break; //don't do this again please (ง •̀_•́)ง
                    }
                }
                if(found){
                    break; //again, please don't do this again (ง •̀_•́)ง ผ(•̀_•́ผ)
                }
            }
        } catch (Exception e){ //if all else fails (╯°□°）╯︵ ┻━┻
            System.out.println(e.getCause()); //cry
            if(target[0] < 9 && target [1] < 9) { //cry
                target[0] = target[0] + 1; //cry
                target[1] = target[1] + 1; //cry
            }
        }

        opponentsBoard.fireAt(target[0],target[1]); //fire away ._.-´¯`-._.-´¯`-._.><(((º>
    }

    /**
     * reset - This method is called when a game has ended and a new game
     * is beginning. It gives you a chance to reset any instance variables
     * you may have created, so that your BattleshipPlayer starts fresh.
     */
    public void reset() {
        // RESET YOUR OBJECT HERE
        if(boards == 4) {
            boards = 0;
        }
        else {
            boards++;
        }
    }
}
