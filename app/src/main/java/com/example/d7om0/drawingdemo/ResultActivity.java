package com.example.d7om0.drawingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView result;
    Button plot;
    Float as,bs,cs,ds,fs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result = (TextView) findViewById(R.id.result);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        plot = (Button) findViewById(R.id.plot);

        int total = Integer.parseInt(b.get("total").toString());

        as = (Float.parseFloat(b.get("as").toString())/total)*100;
        bs = (Float.parseFloat(b.get("bs").toString())/total)*100;
        cs = (Float.parseFloat(b.get("cs").toString())/total)*100;
        ds = (Float.parseFloat(b.get("ds").toString())/total)*100;
        fs = (Float.parseFloat(b.get("fs").toString())/total)*100;

        result.setText("The percentage of grade distribution are \n A%: " +
                as + "%\n B%: "+
                bs + "%\n C%: "+
                cs + "%\n D%: "+
                ds + "%\n F%: "+
                fs + "%"
        );

        plot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultActivity.this, PlotActivity.class);
                intent.putExtra("as", as);
                intent.putExtra("bs", bs);
                intent.putExtra("cs", cs);
                intent.putExtra("ds", ds);
                intent.putExtra("fs", fs);
                startActivity(intent);
            }
        });


    }
}
