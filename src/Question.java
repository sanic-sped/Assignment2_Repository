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
    public Question(String q, int qNum, String headline, boolean isFake){
        this.q = q;
        this.qNum = qNum;
        this.headline = headline;
        this.isFake = isFake;
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
    //toString method for this class
    @Override
    public String toString(){
        return q + " " + qNum + " " + headline + " " + isFake;
    }
}
