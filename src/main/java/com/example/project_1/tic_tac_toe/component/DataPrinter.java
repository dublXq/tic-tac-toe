package com.example.project_1.tic_tac_toe.component;

import com.example.project_1.tic_tac_toe.model.Cell;
import com.example.project_1.tic_tac_toe.model.GameTable;

/**
 * @author Evgeniy_Tyslevich
 * @link https://github.com/dublXq
 */
public class DataPrinter {

    private final CellNumberConverter cellNumberConverter;

    public DataPrinter(CellNumberConverter cellNumberConverter) {
        this.cellNumberConverter = cellNumberConverter;
    }

    public void printMappingTable() {

        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + cellNumberConverter.toNumber(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");

    }

    public void printGameTable(GameTable gameTable) {

        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable.getSign(new Cell(i, j)) + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

}
