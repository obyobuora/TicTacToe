package com.obyobuora.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Boolean FirstPlayer = true;
    String  Mark ;

    player p1 ;
    player p2;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    gamePlay game;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p1 = new player(1,"maher");
        p2 = new  player(2,"sunny");
        game = new gamePlay();
        b1 = findViewById(R.id.b1);
         b2 = findViewById(R.id.b2);
         b3 = findViewById(R.id.b3);
         b4 = findViewById(R.id.b4);
         b5 = findViewById(R.id.b5);
         b6 = findViewById(R.id.b6);
         b7 = findViewById(R.id.b7);
         b8 = findViewById(R.id.b8);
         b9 = findViewById(R.id.b9);
    }

    public void clicked(View view) {



        Button b = (Button) view;

        if(FirstPlayer){
            Mark= "X";

        }else{
            Mark = "O";
        }

        if(b.getId() == b1.getId()){
            b1.setText(Mark);
            if(FirstPlayer){
                if(game.addToBoard(0,0,p1)){
                    Toast.makeText(getApplicationContext(),p1.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = false;
            } else{
                if(game.addToBoard(0,0,p2)){
                    Toast.makeText(getApplicationContext(),p2.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = true;
            }
            b1.setEnabled(false);
        }

        if(b.getId() == b2.getId()){
            b2.setText(Mark);
            if(FirstPlayer){
                if(game.addToBoard(0,1,p1)){
                    Toast.makeText(getApplicationContext(),p1.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = false;
            } else{
                if(game.addToBoard(0,1,p2)){
                    Toast.makeText(getApplicationContext(),p2.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = true;
            }
            b2.setEnabled(false);
        }


        if(b.getId() == b3.getId()){
            b3.setText(Mark);
            if(FirstPlayer){
                if(game.addToBoard(0,2,p1)){
                    Toast.makeText(getApplicationContext(),p1.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = false;
            } else{
                if(game.addToBoard(0,2,p2)){
                    Toast.makeText(getApplicationContext(),p2.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = true;
            }
            b3.setEnabled(false);
        }


        if(b.getId() == b4.getId()){
            b4.setText(Mark);
            if(FirstPlayer){
                if(game.addToBoard(1,0,p1)){
                    Toast.makeText(getApplicationContext(),p1.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = false;
            } else{
                if(game.addToBoard(1,0,p2)){
                    Toast.makeText(getApplicationContext(),p2.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = true;
            }
            b4.setEnabled(false);
        }


        if(b.getId() == b5.getId()){
            b5.setText(Mark);
            if(FirstPlayer){
                if(game.addToBoard(1,1,p1)){
                    Toast.makeText(getApplicationContext(),p1.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = false;
            } else{
                if(game.addToBoard(1,1,p2)){
                    Toast.makeText(getApplicationContext(),p2.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = true;
            }
            b5.setEnabled(false);
        }


        if(b.getId() == b6.getId()){
            b6.setText(Mark);
            if(FirstPlayer){
                if(game.addToBoard(1,2,p1)){
                    Toast.makeText(getApplicationContext(),p1.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = false;
            } else{
                if(game.addToBoard(1,2,p2)){
                    Toast.makeText(getApplicationContext(),p2.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = true;
            }
            b6.setEnabled(false);
        }


        if(b.getId() == b7.getId()){
            b7.setText(Mark);
            if(FirstPlayer){
                if(game.addToBoard(2,0,p1)){
                    Toast.makeText(getApplicationContext(),p1.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = false;
            } else{
                if(game.addToBoard(2,0,p2)){
                    Toast.makeText(getApplicationContext(),p2.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = true;
            }
            b7.setEnabled(false);
        }


        if(b.getId() == b8.getId()){
            b8.setText(Mark);
            if(FirstPlayer){
                if(game.addToBoard(2,1,p1)){
                    Toast.makeText(getApplicationContext(),p1.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = false;
            } else{
                if(game.addToBoard(2,1,p2)){
                    Toast.makeText(getApplicationContext(),p2.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = true;
            }
            b8.setEnabled(false);
        }


        if(b.getId() == b9.getId()){
            b9.setText(Mark);
            if(FirstPlayer){
                if(game.addToBoard(2,2,p1)){
                    Toast.makeText(getApplicationContext(),p1.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = false;
            } else{
                if(game.addToBoard(2,2,p2)){
                    Toast.makeText(getApplicationContext(),p2.getName()+ "Win !",Toast.LENGTH_SHORT).show();
                    restart();
                }
                FirstPlayer = true;
            }
            b9.setEnabled(false);
        }

        if(gameIsOver()){
            restart();
        }


    }

    public boolean gameIsOver() {
        if(!b1.isEnabled() && !b2.isEnabled() && !b3.isEnabled() && !b4.isEnabled() && !b5.isEnabled() && !b6.isEnabled() && !b7.isEnabled() && !b8.isEnabled() && !b9.isEnabled())
            return true;
        return false;
    }

    public void restartGame(View view){
        restart();
    }

    public void restart(){
        game =  new gamePlay();

        b1.setText("");
        b1.setEnabled(true);
        b2.setText("");
        b2.setEnabled(true);

        b3.setText("");
        b3.setEnabled(true);

        b4.setText("");
        b4.setEnabled(true);

        b5.setText("");
        b5.setEnabled(true);

        b6.setText("");
        b6.setEnabled(true);

        b7.setText("");
        b7.setEnabled(true);

        b8.setText("");
        b8.setEnabled(true);

        b9.setText("");
        b9.setEnabled(true);



    }
}
