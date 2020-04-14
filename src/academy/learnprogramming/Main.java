package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 1500;
        int levelCompleted = 5;
        int bonus = 100;

	    int highScore = calculateScore (gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

//        highScore = calculateScore(true,10000, 8, 200);
//        System.out.println("Your final score was " + highScore);

        int finalPosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("Praretno", finalPosition);

        highScore = calculateScore (gameOver, 900, levelCompleted, bonus);
        finalPosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("John", finalPosition);

        highScore = calculateScore (gameOver, 400, levelCompleted, bonus);
        finalPosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("Doe", finalPosition);

        highScore = calculateScore (gameOver, 50, levelCompleted, bonus);
        finalPosition = calculateHighScorePosition(highScore);
        displayHighScorePosition("Tom", finalPosition);
    }

    public static void displayHighScorePosition (String playerName, int finalPosition) {
        System.out.println("Player " + playerName +
                " managed to get into position " + finalPosition + " on the high score table");
    }

    public static int calculateHighScorePosition (int highScore) {
        int finalPosition;
        if (highScore > 1000) {
            finalPosition = 1;
        } else if (highScore > 500 && highScore < 1000) {
            finalPosition = 2;
        } else if (highScore > 100 && highScore < 500) {
            finalPosition = 3;
        } else {
            finalPosition = 4;
        }
        return finalPosition;
    }


    public static int calculateScore (boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}