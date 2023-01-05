package com.example.project_1.tic_tac_toe.component;

import com.example.project_1.tic_tac_toe.model.Cell;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public interface CellNumberConverter {
    Cell toCell(char number);

    char toNumber(Cell cell);
}
