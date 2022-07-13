package Basic_Principles_OOP.Encapsulation.Approach3;

/*Approach 3
        In this approach - For better encapsulation, the logic of doing  the  four operation also is moved  to  the
        CricketScorer class.
        
        
 */

class CricketScorer {
    private int score = 0;

    public int getScore() {
        return score;
    }

    public void addRuns(int score) {
        this.score = this.score + score;
    }

    public void six() {
        addRuns(6);
    }

    public void four() {
        addRuns(4);
    }

    public void single() {
        addRuns(1);
    }

    public void printScore() {
        System.out.println("Score : " + score);
    }

}

 class EncapsulationExample {
    public static void main(String[] args) {
        CricketScorer scorer = new CricketScorer();
        scorer.four();
        scorer.four();
        scorer.single();
        scorer.six();
        scorer.six();
        scorer.six();
        scorer.printScore();
    }
}
/*                                                     Description


        In terms of encapsulation Approach 3 > Approach 2 > Approach 1.

                     * In Approach 3, the user of scorer class does not even know that there is a variable called score.

              Implementation of Scorer can change without changing other classes using Scorer.
        
*/