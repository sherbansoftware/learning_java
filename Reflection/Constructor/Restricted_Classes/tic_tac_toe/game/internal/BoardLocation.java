
package Reflection.Constructor.Restricted_Classes.tic_tac_toe.game.internal;

class BoardLocation {
    private int row;
    private int column;

    public BoardLocation(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
