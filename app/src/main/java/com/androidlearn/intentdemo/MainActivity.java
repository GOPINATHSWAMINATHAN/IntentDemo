package com.androidlearn.intentdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button go;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        go=(Button)findViewById(R.id.button);
        name=(EditText)findViewById(R.id.editText);
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String myName= name.getText().toString();
                //type one
                Intent i=new Intent(getApplicationContext(),SubActivity.class);
                i.putExtra("myname",myName);
                startActivity(i);
                //type two
           //startActivity(new Intent(getApplicationContext(),SubActivity.class));
            }
        });
    }
}
