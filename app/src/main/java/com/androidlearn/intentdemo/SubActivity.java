package com.androidlearn.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity {

    Button go;
    TextView setTexts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        go = (Button) findViewById(R.id.button2);
        String getNames =  getIntent().getExtras().getString("myname");;
        String getText=getIntent().getStringExtra("myname");
        Toast.makeText(getApplicationContext(),"name is"+getText,Toast.LENGTH_LONG).show();
        //Toast.makeText(getApplicationContext(),"name is"+getNames,Toast.LENGTH_LONG).show();
        setTexts = (TextView) findViewById(R.id.textView2);
        setTexts.setText(getNames);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}
