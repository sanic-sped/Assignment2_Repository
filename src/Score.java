/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ziche
 */
public class Score {
    private String name;
    private String region;
    private int value;
    public Score(String name, String region, int value){
        this.name = name;
        this.region = region;
        this.value = value;
    }
    public Score(){
        this("", "", 0);
    }
    //Getter and setter methods for the variables in this class
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getRegion(){
        return region;
    }
    public void setRegion(String region){
        this.region = region;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int value){
        this.value = value;
    }
    //toString method for this class
    @Override
    public String toString(){
        return name + "." + region + "," + value;
    }
}
