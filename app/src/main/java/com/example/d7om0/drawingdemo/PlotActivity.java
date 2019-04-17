package com.example.d7om0.drawingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class PlotActivity extends AppCompatActivity {

    View vertical_line, horizontal_line;
    View line_one, line_two, line_three, line_four, line_five;
    int as, bs, cs, ds, fs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot);

        vertical_line = (View) findViewById(R.id.vertical_line);
        horizontal_line = (View) findViewById(R.id.horizontal_line);

        line_one = (View) findViewById(R.id.line_one);
        line_two = (View) findViewById(R.id.line_two);
        line_three = (View) findViewById(R.id.line_three);
        line_four = (View) findViewById(R.id.line_four);
        line_five = (View) findViewById(R.id.line_five);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        as = (int) b.getFloat("as");
        bs = (int) b.getFloat("bs");
        cs = (int) b.getFloat("cs");
        ds = (int) b.getFloat("ds");
        fs = (int) b.getFloat("fs");

        draw();

    }

    public void draw()
    {
        RelativeLayout.LayoutParams paramsA = new RelativeLayout.LayoutParams(40, as*10);
        paramsA.addRule(RelativeLayout.RIGHT_OF, vertical_line.getId());
        paramsA.addRule(RelativeLayout.ABOVE, horizontal_line.getId());
        paramsA.setMargins(5,2,5,2);
        line_one.setLayoutParams(paramsA);


        RelativeLayout.LayoutParams paramsB = new RelativeLayout.LayoutParams(40, bs*10);
        paramsB.addRule(RelativeLayout.RIGHT_OF, line_one.getId());
        paramsB.addRule(RelativeLayout.ABOVE, horizontal_line.getId());
        paramsB.setMargins(5,2,5,2);
        line_two.setLayoutParams(paramsB);

        RelativeLayout.LayoutParams paramsC = new RelativeLayout.LayoutParams(40, cs*10);
        paramsC.addRule(RelativeLayout.RIGHT_OF, line_two.getId());
        paramsC.addRule(RelativeLayout.ABOVE, horizontal_line.getId());
        paramsC.setMargins(5,2,5,2);
        line_three.setLayoutParams(paramsC);

        RelativeLayout.LayoutParams paramsD = new RelativeLayout.LayoutParams(40, ds*10);
        paramsD.addRule(RelativeLayout.RIGHT_OF, line_three.getId());
        paramsD.addRule(RelativeLayout.ABOVE, horizontal_line.getId());
        paramsD.setMargins(5,2,5,2);
        line_four.setLayoutParams(paramsD);

        RelativeLayout.LayoutParams paramsF = new RelativeLayout.LayoutParams(40, fs*10);
        paramsF.addRule(RelativeLayout.RIGHT_OF, line_four.getId());
        paramsF.addRule(RelativeLayout.ABOVE, horizontal_line.getId());
        paramsF.setMargins(5,2,5,2);
        line_five.setLayoutParams(paramsF);
    }
}
