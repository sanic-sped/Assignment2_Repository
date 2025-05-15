/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziche
 */
public class Leaderboard {
    private Score[] userScores;
    private Score highScore;
    public Leaderboard(Score[] userScores,  Score highScore){
        this.userScores = userScores;
        this.highScore = highScore;
    }
    public Score[] getUserScores(){
        return userScores;
    }
    public void setUserScores(Score[] userScores){
        this.userScores = userScores;
    }
    public Score getHighScore(){
        return highScore;
    }
    public void setHighScore(Score highScore){
        this.highScore = highScore;
    }
    @Override
    public String toString(){
        String returnString = "";
        for (Score x: userScores)
            returnString += x.toString() + "\n";
        returnString += highScore.toString();
        return returnString;
    }
}
