package com.example.project_1.tic_tac_toe.component;

import com.example.project_1.tic_tac_toe.model.Cell;
import com.example.project_1.tic_tac_toe.model.GameTable;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class WinnerVerifier {
    public boolean isUserWin(GameTable gameTable) {
        return isWinner(gameTable, 'X');
    }

    public boolean isComputerWin(GameTable gameTable) {
        return isWinner(gameTable, 'O');
    }

    private boolean isWinner(GameTable gameTable, char sign) {
        return isWinnerByRows(gameTable, sign) ||
                isWinnerByCols(gameTable, sign) ||
                isWinnerByMainDiagonal(gameTable, sign) ||
                isWinnerBySecondaryDiagonal(gameTable, sign);
    }

    private boolean isWinnerByRows(GameTable gameTable, char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(i, 0)) == gameTable.getSign(new Cell(i, 1)) &&
                    gameTable.getSign(new Cell(i, 1)) == gameTable.getSign(new Cell(i, 2)) &&
                    gameTable.getSign(new Cell(i, 2)) == sign) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByCols(GameTable gameTable, char sign) {
        for (int i = 0; i < 3; i++) {
            if (gameTable.getSign(new Cell(0, i)) == gameTable.getSign(new Cell(1, i)) &&
                    gameTable.getSign(new Cell(1, i)) == gameTable.getSign(new Cell(2, i)) &&
                    gameTable.getSign(new Cell(2, i)) == sign) {
                return true;
            }
        }
        return false;
    }

    private boolean isWinnerByMainDiagonal(GameTable gameTable, char sign) {
        return gameTable.getSign(new Cell(0, 0)) == gameTable.getSign(new Cell(1, 1)) &&
                gameTable.getSign(new Cell(1, 1)) == gameTable.getSign(new Cell(2, 2)) &&
                gameTable.getSign(new Cell(2, 2)) == sign;
    }

    private boolean isWinnerBySecondaryDiagonal(GameTable gameTable, char sign) {
        return gameTable.getSign(new Cell(2, 0)) == gameTable.getSign(new Cell(1, 1)) &&
                gameTable.getSign(new Cell(1, 1)) == gameTable.getSign(new Cell(0, 2)) &&
                gameTable.getSign(new Cell(0, 2)) == sign;
    }
}