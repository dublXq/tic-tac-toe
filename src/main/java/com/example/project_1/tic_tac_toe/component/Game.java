package com.example.project_1.tic_tac_toe.component;

import com.example.project_1.tic_tac_toe.model.GameTable;

import java.util.Random;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class Game {

    private final DataPrinter dataPrinter;
    private final UserMove userMove;
    private final WinnerVerifier winnerVerifier;
    private final ComputerMove computerMove;
    private final CellVerifier cellVerifier;

    public Game(DataPrinter dataPrinter,
                UserMove userMove,
                WinnerVerifier winnerVerifier,
                ComputerMove computerMove,
                CellVerifier cellVerifier) {

        this.dataPrinter = dataPrinter;
        this.userMove = userMove;
        this.winnerVerifier = winnerVerifier;
        this.computerMove = computerMove;
        this.cellVerifier = cellVerifier;

    }

    public void play() {
        final GameTable gameTable = new GameTable();
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9: ");
        dataPrinter.printMappingTable();
        if (new Random().nextBoolean()) {
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
        }
        while (true) {
            userMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isUserWin(gameTable)) {
                System.out.println("YOU WIN");
                break;
            }
            if (cellVerifier.allCellsFilled(gameTable)) {
                System.out.println("SORRY, DRAW!");
                break;
            }
            computerMove.make(gameTable);
            dataPrinter.printGameTable(gameTable);
            if (winnerVerifier.isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            if (cellVerifier.allCellsFilled(gameTable)) {
                System.out.println("SORRY, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER");
    }
}
