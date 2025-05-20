/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziche
 */
public class Multiple_Choice extends Question{
    private String headline;
    private String[] choices;
    private String correctChoiceIndex;
    public Multiple_Choice(String q, int qNum, String headline, boolean isFake, String[] choices){
        super(q, qNum);
        this.headline = headline;
        this.isFake = isFake;
        this.choices = choices;
    }
    //Getter and setter methods for the variables in this class
    public String getHeadline(){
        return headline;
    }
    public void setsuccessMsg(String successMsg){
        this.successMsg = successMsg;
    }
    public String getfailMsg(){
        return failMsg;
    }
    public void setfailMsg(String failMsg){
        this.failMsg = failMsg;
    }
    //toString method for this class
    @Override
    public String toString(){
        return super.getQNum() + "," + super.getQ() + "," + ",Fake," + successMsg + "," + failMsg;
    }
}
