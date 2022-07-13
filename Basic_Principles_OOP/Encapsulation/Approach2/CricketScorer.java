package Basic_Principles_OOP.Encapsulation.Approach2;

/*                                                  Approach 2


    ○ In this approach, we make score as private and

                   * access value through

                                 - get

                                 - and set methods.

                          However, the logic of adding 4 to the score is performed in the main method.
        
 */

public class CricketScorer {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        CricketScorer scorer = new CricketScorer();
        int score = scorer.getScore();
        scorer.setScore(score + 4);
    }

}