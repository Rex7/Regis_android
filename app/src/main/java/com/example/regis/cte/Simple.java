package com.example.regis.cte;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView;




public class Simple extends ActionBarActivity implements OnClickListener {

    String[] simple_ques, simple_ans;
    Button bleft, bright, banser;
    TextView tquestion, tanswer, ttotal, tpresent;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);
        //Setting TextView to TextView Widgets
        tquestion = (TextView) findViewById(R.id.textquestion);
        tanswer = (TextView) findViewById(R.id.textforanswer);
        tpresent = (TextView) findViewById(R.id.textView);
        ttotal = (TextView) findViewById(R.id.textView2);
        //Array Resource allocation
        simple_ques = getResources().getStringArray(R.array.simple_question);
        simple_ans = getResources().getStringArray(R.array.simple_answer);
        //Setting button variable to button widgets
        bleft = (Button) findViewById(R.id.btnleft);
        bright = (Button) findViewById(R.id.btnright);
        banser = (Button) findViewById(R.id.btnans);
        //Setting buttons for listening
        bleft.setOnClickListener(this);
        bright.setOnClickListener(this);
        banser.setOnClickListener(this);
        //Setting TextView to values
        index = 0;
        tquestion.setText(simple_ques[index]);
        tpresent.setText(String.valueOf(index + 1)+"/");
        ttotal.setText(String.valueOf(simple_ques.length));


    }

    @Override
    public void onClick(View v) {

        int i = v.getId();
        {
            switch (i) {
                case R.id.btnright:
                    index++;
                    int len = simple_ques.length;
                    if (index == len) {
                        index = 0;
                        tpresent.setText(String.valueOf(index + 1)+"/");
                        ttotal.setText(String.valueOf(simple_ques.length));
                        tquestion.setText(simple_ques[index]);
                        tanswer.setText("Press A for Answer");


                    } else {
                        tpresent.setText(String.valueOf(index + 1)+"/");
                        ttotal.setText(String.valueOf(simple_ques.length));
                        tquestion.setText(simple_ques[index]);
                        tanswer.setText("Press A for Answer");
                    }


                    break;
                case R.id.btnans:
                    tanswer.setText(simple_ans[index]);
                    break;
                case R.id.btnleft:
                    index--;
                    if (index == -1)
                    {
                        index = simple_ques.length - 1;
                        tquestion.setText(simple_ques[index]);
                        tpresent.setText(String.valueOf(index + 1));
                        ttotal.setText(String.valueOf(simple_ques.length));

                    }
                    else {


                        tquestion.setText(simple_ques[index]);
                        tpresent.setText(String.valueOf(index + 1)+"/");
                        ttotal.setText(String.valueOf(simple_ques.length));
                    }

                    break;
            }


        }
    }
}

