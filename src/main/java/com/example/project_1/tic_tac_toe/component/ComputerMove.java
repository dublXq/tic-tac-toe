package com.example.project_1.tic_tac_toe.component;

import com.example.project_1.tic_tac_toe.model.Cell;
import com.example.project_1.tic_tac_toe.model.GameTable;

import java.util.Random;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class ComputerMove {
    public void make(GameTable gameTable) {
        Random random = new Random();
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            Cell objectCell = new Cell(row, col);
            if (gameTable.isEmpty(objectCell)) {
                gameTable.setSign(objectCell, 'O');
                return;
            }
        }
    }
}
