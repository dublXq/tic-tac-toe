package com.example.project_1.tic_tac_toe.component;

import com.example.project_1.tic_tac_toe.model.Cell;
import com.example.project_1.tic_tac_toe.model.GameTable;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class CellVerifier {
    public boolean allCellsFilled(GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (gameTable.isEmpty(new Cell(i, j))) {
                    return false;
                }
            }
        }
        return true;
    }
}
