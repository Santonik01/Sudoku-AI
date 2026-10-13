package Main;

import Graphics.SudokuUI;

/**
 * Main Class that start the Game
 *
 * @author Davide
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SudokuUI game = new SudokuUI();
        game.setVisible(true);
    }
}
