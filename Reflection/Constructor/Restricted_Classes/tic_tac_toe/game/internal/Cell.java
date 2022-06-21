package Reflection.Constructor.Restricted_Classes.tic_tac_toe.game.internal;

class Cell {
    private Sign sign;

    public Cell() {
        sign = Sign.EMPTY;
    }

    public boolean isEmpty() {
        return sign == Sign.EMPTY;
    }

    public Sign getSign() {
        return sign;
    }

    public void setSign(Sign sign) {
        this.sign = sign;
    }
}
