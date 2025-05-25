/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziche
 */
public class Question {
    private String q;
    private int qNum;
    private String headline;
    private boolean isFake;
    private String successMessage;
    private String failMessage;
    /**
     * Constructor method in this class
     * @param q the question
     * @param qNum the questions number
     * @param headline the headline of the news article associated with this question
     * @param isFake is the news article fake
     * @param successMessage message if question is answered correctly
     * @param failMessage message if question is answered incorrectly
     */
    public Question(String q, int qNum, String headline, boolean isFake, String successMessage, String failMessage){
        this.q = q;
        this.qNum = qNum;
        this.headline = headline;
        this.isFake = isFake;
        this.successMessage = successMessage;
        this.failMessage = failMessage;
    }
    //Getter and setter methods for the variables in this class
    public String getQ(){
        return q;
    }
    public void setQ(String q){
        this.q = q;
    }
    public int getQNum(){
        return qNum;
    }
    public void setQNum(int qNum){
        this.qNum = qNum;
    }
    public String getHeadline(){
        return headline;
    }
    public void setHeadline(String headline){
        this.headline = headline;
    }
    public boolean getIsFake(){
        return isFake;
    }
    public void setIsFake(boolean isFake){
        this.isFake = isFake;
    }
    public String getSuccessMessage(){
        return successMessage;
    }
    public void setSuccessMessage(String successMessage){
        this.successMessage = successMessage;
    }
    public String getFailMessage(){
        return failMessage;
    }
    public void setFailMessage(String failMessage){
        this.failMessage = failMessage;
    }
    //toString method for this class
    @Override
    public String toString(){
        return q + " " + qNum + " " + headline + " " + isFake;
    }
}
