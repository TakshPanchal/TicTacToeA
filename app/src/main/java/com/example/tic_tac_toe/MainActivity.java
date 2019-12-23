package com.example.tic_tac_toe;
/*
*  step 1 : all are null
*  step 2 : user clicks on a button take input{set method for tap}
*  step 3 : show img according to player's turn
*  step 4 : if win situation occurs then show winner
*  step 5 : print draw if no one is win (last at fun)
*
* reset button
* */


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

int playerState = 0;
//stateOfButtons
//    0 - o
//    1 - X
//    2 - null
    int[] state = {2,2,2,2,2,2,2,2,2};
//    int[][] win = {{0,1,2},{3,4,5},{6,7,8},
//                    {0,3,6},{1,4,7},{2,5,8},
//                    {3,6,9}};

    public void tapped(View view)
    {  ImageView img =(ImageView) view;

        int tappedTag = Integer.parseInt(img.getTag().toString());
       //display 0 and X
        if(state[tappedTag] == 2)
        {

            //display 0 and X
            if(playerState == 0 )
            {
              playerState = 1 ;
              state[tappedTag] = 0;
              img.setImageResource(R.drawable.o);
            }
            else { playerState = 0;
                state[tappedTag] = 1;
              img.setImageResource(R.drawable.x);
                 }


        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
//toast
