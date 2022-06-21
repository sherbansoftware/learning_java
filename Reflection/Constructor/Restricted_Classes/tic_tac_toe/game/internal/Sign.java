package Reflection.Constructor.Restricted_Classes.tic_tac_toe.game.internal;

enum Sign {
    EMPTY(' '),
    X('X'),
    Y('Y');

    private char value;

    Sign(char value) {
        this.value = value;
    }

    public char getValue() {
        return this.value;
    }
}
