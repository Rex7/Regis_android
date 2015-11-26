package com.example.regis.cte;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class Tough extends ActionBarActivity implements OnClickListener {

    String[] tough_ques, tough_ans;
    Button bleft, bright, banser;
    int index;
    TextView tquestion, tanswer, ttotal, tpresent;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);
        //Array inistialization
        tough_ques = getResources().getStringArray(R.array.tough_question);
        tough_ans = getResources().getStringArray(R.array.tough_ans);
        //TextView

        tquestion = (TextView) findViewById(R.id.textquestion);
        tanswer = (TextView) findViewById(R.id.textforanswer);
        tpresent = (TextView) findViewById(R.id.textView);
        ttotal = (TextView) findViewById(R.id.textView2);

        //Button Time
        bleft = (Button) findViewById(R.id.btnleft);
        bright = (Button) findViewById(R.id.btnright);
        banser = (Button) findViewById(R.id.btnans);
        //Button set For Listener
        bleft.setOnClickListener(this);
        bright.setOnClickListener(this);
        banser.setOnClickListener(this);
        //setting text to values
        index = 0;
        tquestion.setText(tough_ques[index]);
        tpresent.setText(String.valueOf(index + 1)+"/");

        ttotal.setText(String.valueOf(tough_ques.length));

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.btnright:
                index++;
                int len = tough_ques.length;
                if(index==len) {
                    index=0;
                    tpresent.setText(String.valueOf(index + 1)+"/");
                    ttotal.setText(String.valueOf(tough_ques.length));
                    tquestion.setText(tough_ques[index]);
                    tanswer.setText("Press A for Answer");


                }


                    else
                    {
                    tpresent.setText(String.valueOf(index + 1)+"/");
                    ttotal.setText(String.valueOf(tough_ques.length));
                    tquestion.setText(tough_ques[index]);
                    tanswer.setText("Press A for Answer");
                }


                break;
            case R.id.btnans:
                tanswer.setText(tough_ans[index]);
                break;
            case R.id.btnleft:
                index--;
                if(index == -1)
                {
                   index= tough_ques.length-1;
                    tquestion.setText(tough_ques[index]);
                    tpresent.setText(String.valueOf(index + 1)+"/");

                }
                    else {

                    //Setting Question using array index
                    tquestion.setText(tough_ques[index]);
                    tpresent.setText(String.valueOf(index + 1)+"/");
                    ttotal.setText(String.valueOf(tough_ques.length));
                }

                break;


        }
    }
}
