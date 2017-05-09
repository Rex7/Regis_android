package com.example.regis.cte;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class mainpage extends ActionBarActivity implements OnClickListener {
    Button bsimple,btough,baboutus,brateus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
        bsimple=(Button)findViewById(R.id.question_simple);
        btough=(Button)findViewById(R.id.tough_question);
        baboutus=(Button)findViewById(R.id.About_Us);
        brateus=(Button)findViewById(R.id.RateApp);
        bsimple.setOnClickListener(this);
        btough.setOnClickListener(this);
        baboutus.setOnClickListener(this);
        brateus.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mainpage, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify ansq parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent n;
        int i = v.getId();
        switch (i)
        {
            case R.id.question_simple:
                 n = new Intent(getApplicationContext(),Simple.class);
                 startActivity(n);
                 break;
            case R.id.tough_question:
                n = new Intent(getApplicationContext(),Tough.class);
                startActivity(n);
                break;
            case R.id.About_Us:
                n = new Intent(this,hg.class);
                startActivity(n);
                break;
            case R.id.RateApp:
                break;
        }

    }



}
