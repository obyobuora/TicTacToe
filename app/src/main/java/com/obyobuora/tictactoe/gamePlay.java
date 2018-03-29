package com.obyobuora.tictactoe;

import android.util.Log;

/**
 * Created by obyobuora on 2/27/18.
 */

public class gamePlay {
    public  int  x;
    public  int  y;
    public  int[][] view = new int[3][3];


    public  Boolean addToBoard(int x,int  y,player p){
        view[x][y] = p.getId();
        boolean win = checkWin(p);
        if(win){

        }
        return win;

    }

    public boolean checkWin(player p){
        return  checkColumn(p) || checkRows(p)  || checkDiagonals(p);
    }

    public  boolean checkColumn(player p){
       return  (
                       ((view[0][0] == p.getId()) && (view[1][0] == p.getId()) && (view[2][0] == p.getId())) ||
                       ((view[0][1] == p.getId()) && (view[1][1] == p.getId()) && (view[2][1] == p.getId())) ||
                       ((view[0][2] == p.getId()) && (view[1][2] == p.getId()) && (view[2][2] == p.getId()))

               );
    }

    public  boolean checkRows(player p){
        return  (
                ((view[0][0] == p.getId()) && (view[0][1] == p.getId()) && (view[0][2] == p.getId())) ||
                        ((view[1][0] == p.getId()) && (view[1][1] == p.getId()) && (view[1][2] == p.getId())) ||
                        ((view[2][0] == p.getId()) && (view[2][1] == p.getId()) && (view[2][2] == p.getId()))

        );
    }


    public  boolean checkDiagonals(player p){
        return  (
                ((view[0][0] == p.getId()) && (view[1][1] == p.getId()) && (view[2][2] == p.getId())) ||
                        ((view[2][0] == p.getId()) && (view[1][1] == p.getId()) && (view[0][2] == p.getId()))

        );
    }

    /*
    0,0  0,1  0,2
    1,0  1,1  1,2
    2,0  2,1  2,2
    */



}
