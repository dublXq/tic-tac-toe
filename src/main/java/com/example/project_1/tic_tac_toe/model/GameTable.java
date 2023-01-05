package com.example.project_1.tic_tac_toe.model;

import java.util.Arrays;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class GameTable {

    private final char[][] table = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public boolean isEmpty(final Cell cell) {
        return table[cell.getRow()][cell.getCol()] == ' ';
    }

    public char getSign(final Cell cell) {
        return table[cell.getRow()][cell.getCol()];
    }

    public void setSign(final Cell cell, final char sign) {
        table[cell.getRow()][cell.getCol()] = sign;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GameTable{");
        sb.append("table=");
        for (int i = 0; i < table.length; i++) {
            sb.append(Arrays.toString(table[i]));
            if (i < table.length - 1) {
                sb.append(";");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
