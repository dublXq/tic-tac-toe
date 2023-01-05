package com.example.project_1.tic_tac_toe;

import com.example.project_1.tic_tac_toe.component.*;
import com.example.project_1.tic_tac_toe.component.keypad.DesktopNumericKeypadCellNumberConverter;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public final class Launcher {

    public static void main(String[] args) {
        final CellNumberConverter cellNumberConverter = new DesktopNumericKeypadCellNumberConverter();
        Game game = new Game(
                new DataPrinter(cellNumberConverter), new UserMove(cellNumberConverter), new WinnerVerifier(), new ComputerMove(), new CellVerifier()
        );
        game.play();
    }
}
