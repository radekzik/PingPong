package com.example.pingpong;

import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import static com.example.pingpong.Game.*;

public class GameText {

    public static void drawPlayerScore(){
        playerScoreText = new Text();
        //playerScoreText.setText("Player Score : " + playerScore);
        playerScoreText.setText("" + playerScore);
        playerScoreText.setFont(Font.font(font, bigFontSize));
        playerScoreText.setFill(Color.WHITE);
        playerScoreText.setX((gameWindow.getWidth() - 65));
        playerScoreText.setY(70);
        playerScoreText.setVisible(true);
    }

    public static void drawEnemyScore(){
        enemyScoreText = new Text();
        //enemyScoreText.setText("Enemy Score : " + enemyScore);
        enemyScoreText.setText("" + enemyScore);
        enemyScoreText.setFont(Font.font(font, bigFontSize));
        enemyScoreText.setFill(Color.WHITE);
        enemyScoreText.setX((30));
        enemyScoreText.setY(70);
        enemyScoreText.setVisible(true);
    }

    public static void drawStartText(){
        startText = new Text();
        startText.setText("P - PAUSE GAME | PRESS SPACE TO PLAY! ");
        startText.setFont(Font.font(font, fontSize));
        startText.setFill(Color.ORANGE);
        startText.setX((gameWindow.getWidth() / 2) - 195);
        startText.setY((gameWindow.getHeight() - 20));
        startText.setVisible(true);

    }

    public static void drawPauseText(){
        pauseText = new Text();
        pauseText.setText("PAUSED");
        pauseText.setFont(Font.font(font, fontSize));
        pauseText.setFill(Color.ORANGE);
        pauseText.setX((gameWindow.getWidth() / 2) + 5);
        pauseText.setY(30);
        pauseText.setVisible(false);

    }

    public static void drawWinLoseText(){
        winLoseText = new Text();
        winLoseText.setFont(Font.font(font, fontSize));
        winLoseText.setFill(Color.ORANGE);
        winLoseText.setX((gameWindow.getWidth() / 4) + 70);
        winLoseText.setY((30));

    }

    public static void drawSpaceToPlay(){
        spaceToPlayText = new Text();
        spaceToPlayText.setText("PRESS SPACE TO PLAY!");
        spaceToPlayText.setFont(Font.font(font, bigFontSize));
        spaceToPlayText.setFill(Color.ORANGE);
        spaceToPlayText.setX(gameWindow.getWidth() / 2);
        spaceToPlayText.setY(gameWindow.getHeight() / 2);
        spaceToPlayText.setVisible(true);

    }

    public static void playerWin(){

        winLoseText.setText("YOU ARE THE WINNER!");
        winLoseText.setX((gameWindow.getWidth() / 2) + 5);
        winLoseText.setVisible(true);
        startText.setVisible(true);
        resetGame();
    }

    public static void enemyWin(){

        winLoseText.setText("ENEMY IS THE WINNER!");
        winLoseText.setX((gameWindow.getWidth() / 4) + 70);
        winLoseText.setVisible(true);
        startText.setVisible(true);
        resetGame();

    }

}




