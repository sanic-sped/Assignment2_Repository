/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziche
 */
public class True_False extends Question{
    private String headline;
    private boolean answer;
    public True_False(String q, int qNum, String headline, boolean isFake){
        super(q, qNum);
        this.headline = headline;
        this.isFake = isFake;
    }
    //Getter and setter methods for the variables in this class
    public String getHeadline(){
        return headline;
    }
    public void setHeadline(String headline){
        this.headline = headline;
    }
    public boolean getAnswer (){
        return answer;
    }
    public void setAnswer(boolean isFake){
        this.answer = answer;
    }
    //toString method for this class
    @Override
    public String toString(){
        return super.getQNum() + "," + super.getQ() + "," + ",True," + headline + "," + answer;
    }
}
