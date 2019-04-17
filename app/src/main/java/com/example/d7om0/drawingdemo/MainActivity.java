package com.example.d7om0.drawingdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText total_student, as_student, bs_student, cs_student, ds_student, fs_student;
    Button compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total_student = (EditText) findViewById(R.id.total_students);
        as_student = (EditText) findViewById(R.id.as_students);
        bs_student = (EditText) findViewById(R.id.bs_students);
        cs_student = (EditText) findViewById(R.id.cs_students);
        ds_student = (EditText) findViewById(R.id.ds_students);
        fs_student = (EditText) findViewById(R.id.fs_students);

        compute = (Button) findViewById(R.id.btn_compute);

        compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("total", total_student.getText());
                intent.putExtra("as", as_student.getText());
                intent.putExtra("bs", bs_student.getText());
                intent.putExtra("cs", cs_student.getText());
                intent.putExtra("ds", ds_student.getText());
                intent.putExtra("fs", fs_student.getText());
                startActivity(intent);
            }
        });

    }
}
