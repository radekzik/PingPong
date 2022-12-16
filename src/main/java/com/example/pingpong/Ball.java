package com.example.pingpong;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.util.Random;

import static com.example.pingpong.Game.*;

public class Ball {

    public static void drawBall(){
        ball = new Circle();
        ball.setCenterX((gameWindow.getWidth() / 2) - 5);
        ball.setCenterY((gameWindow.getHeight() / 2));
        ball.setRadius(10);
        ball.setStroke(Color.LIGHTCORAL);
        ball.setStrokeWidth(1);

        ball.setFill(Color.ORANGE);
    }

    public static void respawnBall(){
        ball.setRadius(10);
        ball.setCenterX((gameWindow.getWidth() / 2) - 5);
        ball.setCenterY((gameWindow.getHeight() / 2));

        hitCombo = 0;
        comboHitText.setText("x" + hitCombo);

        random = new Random();

        int random_num = random.nextInt(100);

        System.out.println(random_num);

        if (random_num <= 25){
            ballSpeedX = 3;
            ballSpeedY = 1;
        }
        if (random_num > 25 && random_num <= 50){
            ballSpeedX = 3;
            ballSpeedY = -1;
        }
        if (random_num > 51 && random_num <= 75){
            ballSpeedX = 3;
            ballSpeedY = 0.6;
        }
        if (random_num > 76){
            ballSpeedX = 3;
            ballSpeedY = -0.6;
        }
        /*if (random_num > 100 && random_num <= 125){
            ballSpeedX = 3;
            ballSpeedY = 0.35;
        }
        if (random_num > 125){
            ballSpeedX = 3;
            ballSpeedY = -0.35;
        }*/

    }

    public static void checkBallPosition(){

        //score
        if (ball.getCenterX() < 0){
            playerScore++;
            playerScoreText.setText("" + playerScore);
            respawnBall();
        }

        if (ball.getCenterX() > gameWindow.getWidth()){
            enemyScore++;
            enemyScoreText.setText("" + enemyScore);
            respawnBall();
        }

        //player hit
        if(ball.getCenterX() >= gameWindow.getWidth() - player.getWidth() - gap){

            if(ball.getCenterY() >= player.getY() && ball.getCenterY() <= player.getY() + player.getHeight()){
                ballSpeedX = -ballSpeedX;
                hitCombo++;
                comboHitText.setText("x" + hitCombo);
            }
            if(ball.getCenterY() >= player.getY() + (player.getHeight() / 2) - 15 && ball.getCenterY() <= player.getY() + player.getHeight()/2 + 15){
                ballSpeedX = ballSpeedX - 1.3;
            }
            if(ball.getCenterY() >= player.getY() && ball.getCenterY() <= player.getHeight() / 2){
                ballSpeedY = ballSpeedY + 1;
            }
            if(ball.getCenterY() >= player.getHeight() / 2 && ball.getCenterY() <= player.getHeight()){
                ballSpeedY = ballSpeedY - 1;
            }
        }
        //enemy hit
        if(ball.getCenterX() <= enemy.getWidth() + gap) {

            if (ball.getCenterY() >= enemy.getY() && ball.getCenterY() <= enemy.getY() + player.getHeight()) {
                ballSpeedX = -ballSpeedX;
                hitCombo++;
                comboHitText.setText("x" + hitCombo);
            }
            if (ball.getCenterY() >= enemy.getY() + (enemy.getHeight() / 2) - 15 && ball.getCenterY() <= enemy.getY() + enemy.getHeight() / 2 + 15) {
                ballSpeedX = ballSpeedX - 1.3;
            }
            if(ball.getCenterY() >= enemy.getY() && ball.getCenterY() <= enemy.getHeight() / 2){
                ballSpeedY = ballSpeedY + 1;
            }
            if(ball.getCenterY() >= enemy.getHeight() / 2 && ball.getCenterY() <= enemy.getHeight()){
                ballSpeedY = ballSpeedY - 1;
            }
        }

        //ground hit
        if (ball.getCenterY() >= gameWindow.getHeight() || ball.getCenterY() <= 0) {
            ballSpeedY = -ballSpeedY;

        }
    }

    public static void ballSize(){

        double ballHalf = ball.getRadius() / 2;
        if(hitCombo >= 8 && hitCombo <= 15){
            ball.setRadius(20);

        }
        else if(hitCombo >= 16 && hitCombo <= 20){
            ball.setRadius(5);
        }
        else {
            ball.setRadius(10);
        }
        if (hitCombo > 21){
            hitCombo = 0;
        }

        System.out.println(hitCombo);

        /*random = new Random();

        int random_num = random.nextInt(100);

        System.out.println(random_num);


        if(hitCombo % 5 == 0){
            ball.setRadius(20);
        }
        else if(hitCombo % 2 == 0){
            ball.setRadius(5);
        }
        else {
            ball.setRadius(10);
        }*/

    }

    public static void drawMiddleLine(){
        middleLine = new Rectangle();
        middleLine.setHeight(gameWindow.getHeight());
        middleLine.setWidth(10);
        middleLine.setX((gameWindow.getWidth() / 2) - middleLine.getWidth());
        middleLine.setStroke(Color.WHITE);
        middleLine.setStrokeWidth(2);

        middleLine.setFill(Color.CYAN);
    }


}
