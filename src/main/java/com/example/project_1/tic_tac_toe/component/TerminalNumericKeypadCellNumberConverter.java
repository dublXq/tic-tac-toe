package com.example.project_1.tic_tac_toe.component;

import com.example.project_1.tic_tac_toe.model.Cell;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class TerminalNumericKeypadCellNumberConverter implements CellNumberConverter {


    @Override
    public Cell toCell(final char number) {
        final int val = number - '0' - 1;
        return new Cell(val / 3, val % 3);
    }

    @Override
    public char toNumber(final Cell cell) {
        return (char) ('0' + (cell.getRow() * 3 + cell.getCol() + 1));
    }
}
