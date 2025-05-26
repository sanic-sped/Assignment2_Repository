/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziche
 */
public class Multiple_Choice extends Question{
    private String[] choices;
    private int answerIndex;
    /**
     * Constructor method for this class
     * @param q the question
     * @param qNum the questions number
     * @param headline the headline of the news article associated with this question
     * @param isFake is the news article fake
     * @param successMessage message if question is answered correctly
     * @param failMessage message if question is answered incorrectly
     * @param choices the choices for the multiple choice question
     * @param answerIndex the index of the answer 
     */
    public Multiple_Choice(String q, int qNum, String headline, boolean isFake, String[] choices, int answerIndex, String successMessage, String failMessage){
        super(q, qNum, headline, isFake, successMessage, failMessage);
        this.choices = choices;
        this.answerIndex = answerIndex;
    }
    //Getter and setter methods for the variables in this class
    public String[] getChoices(){
        return choices;
    }
    public void setChoices(String[] choices){
        this.choices = choices;
    }
    public int getanswerIndex(){
        return answerIndex;
    }
    public void setcorrectChoiceIndex(int answerIndex){
        this.answerIndex = answerIndex;
    }
    //toString method for this class
    @Override
    public String toString(){
        String returnString = "";
        for (String x: choices)
            returnString += x;
        returnString += answerIndex;
        return super.toString() + " " + returnString;
    }
}
