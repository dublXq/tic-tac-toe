package com.example.project_1.tic_tac_toe.model;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class Cell {

    private final int row;

    private final int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return "Cell{" +
                "row=" + row +
                ", col=" + col +
                '}';
    }
}
