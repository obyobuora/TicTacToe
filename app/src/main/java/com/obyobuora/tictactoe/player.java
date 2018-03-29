package com.obyobuora.tictactoe;

/**
 * Created by obyobuora on 2/27/18.
 */

public class player {
    private int id;
    private String  name;

    public player(int  id,String name){
        this.id = id;
        this.name = name;
    }
    public  int  getId(){
        return id;
    }
    public  String getName(){
        return name;
    }
}
