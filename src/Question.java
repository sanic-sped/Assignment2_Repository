/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziche
 */
public class Question {
    private String question;
    private Option[] possibleAnswers;
    private int correntAnswerIndex;
    public Question(String question, Option[] possibleAnswers, int correntAnswerIndex){
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.correntAnswerIndex = correntAnswerIndex;
    }
    //Getter and setter methods for the variables in this class
    public String getQuestion(){
        return question;
    }
    public void setQuestion(String question){
        this.question = question;
    }
    public Option[] getPossibleAnswers(){
        return possibleAnswers;
    }
    public void setPossibleAnswers(Option[] possibleAnswers){
        this.possibleAnswers = possibleAnswers;
    }
    public int getCorrentAnswerIndex(){
        return correntAnswerIndex;
    }
    public void setCorrentAnswerIndex(int correntAnswerIndex){
        this.correntAnswerIndex = correntAnswerIndex;
    }
    //toString method for this class
    @Override
    public String toString(){
        String returnString = "";
        for (Option x: possibleAnswers){
            returnString += "," + x.toString();
        }
        returnString += question + correntAnswerIndex;
        return returnString;
    }
}
