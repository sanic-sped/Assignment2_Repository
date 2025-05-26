
import java.io.*;
import java.util.Scanner;

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
    /**
     * Constructor class that builds a new leaderboard object from the leaderboard database
     */
    public Leaderboard(){
        int lines = countLines("leaderboard.txt");
        String[] data = readLines("leaderboard.txt", lines);
        Score[] userScores1 = new Score[lines];
        Score highScore1 = new Score();
        for (int i = 0; i < data.length; i++){
            String[] temp = data[i].split(",");
            userScores1[i] = new Score(temp[0], temp[1], Integer.parseInt(temp[2]));
            if (Integer.parseInt(temp[2]) < highScore1.getValue()){
                highScore1 = new Score(temp[0], temp[1], Integer.parseInt(temp[2]));
            }
        }
        this.userScores = userScores1;
        this.highScore = highScore1;
    }
    /**
     * Method to count lines of file
     * @param filename the name of the file to be counted
     * @return number of lines in a file
     */
    public static int countLines(String filename){
        int lines = 0;
        try (Scanner count = new Scanner(new File("leaderboard.txt"))){
            while (count.hasNext()){
                lines++;
                count.nextLine();
            }
        } catch(IOException exception){
            System.out.println(exception);
        }   
        return lines;
    }
    /**
     * Method to read the data from a database file
     * @param filename name of file to read
     * @param lines number of lines in file
     * @return data from database file, with each element being a line
     */
    public static String[] readLines(String filename, int lines){
        String[] out = new String[lines];
        try (Scanner read = new Scanner(new File("leaderboard.txt"))){
            for (int i = 0; i < out.length; i++){
                out[i] = read.nextLine();
            }
        } catch(IOException exception){
            System.out.println(exception);
        }   
        return out;
    }
    /**
     * Method to write a new entry into the leaderboard
     * @param newScore New score to write to the leaderboard
     */
    public void writeNewScore(Score newScore){
        try (FileWriter w = new FileWriter(new File("leaderboard.txt"), true)){
            //Initialize a Printwriter object
            PrintWriter write = new PrintWriter(w);
            //Write to the database file
            write.printf("%s,%s,%s\n", newScore.getName(), newScore.getRegion(), newScore.getValue());
            //Initialize a new userScores array
            Score[] newUserScores = new Score[this.getUserScores().length + 1];
            //Initialize a new highScore variable
            Score newHighScore = this.highScore;
            //Copy the old userScores to the new userScores array
            for (int i = 0; i < this.getUserScores().length; i++){
                newUserScores[i] = this.getUserScores()[i];
            }
            //Add the new score
            newUserScores[this.getUserScores().length] = newScore;
            //If the new score is higher than the current highScore, then make that the new highScore
            if (newHighScore.getValue() < newScore.getValue()){
                newHighScore = newScore;
            }
            //Update the variables
            this.userScores = newUserScores;
            this.highScore = newHighScore;
        } catch(IOException exception){
            System.out.println(exception);
        }
    }
    //Getter and setter mathods
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
