/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziche
 */
public class Fake_News extends Question{
    private String successMsg;
    private String failMsg;
    public Fake_News(String q, int qNum, String successMsg, String failMsg){
        super(q, qNum);
        this.successMsg = successMsg;
        this.failMsg = failMsg;
    }
    //Getter and setter methods for the variables in this class
    public String getsuccessMsg(){
        return successMsg;
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
