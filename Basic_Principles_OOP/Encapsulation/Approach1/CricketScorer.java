package Basic_Principles_OOP.Encapsulation.Approach1;


/*                                           Approach 1


   ○ In this approach we create a public variable score.

                  * The main method directly accesses the score variable, updates it.


 */

public class CricketScorer {
    public int score;

    public static void main(String[] args) {
        CricketScorer scorer = new CricketScorer();
        scorer.score = scorer.score + 4;
    }
}