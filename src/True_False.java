/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziche
 */
public class True_False extends Question{
    private boolean answer;
    public True_False(String q, int qNum, String headline, boolean isFake, boolean answer, String successMessage, String failMessage){
        super(q, qNum, headline, isFake, successMessage, failMessage);
        this.answer = answer;
    }
    //Getter and setter methods for the variables in this class
    public boolean getAnswer(){
        return answer;
    }
    public void setAnswer(boolean answer){
        this.answer = answer;
    }
    //toString method for this class
    @Override
    public String toString(){
        return super.toString() + " " + answer;
    }
}
