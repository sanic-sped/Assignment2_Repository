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
    boolean isFake;
    public Question(String q, int qNum){
        this.q = q;
        this.qNum = qNum;
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
    //toString method for this class
    @Override
    public String toString(){
        return qNum + "# :" + q ;
    }
}
