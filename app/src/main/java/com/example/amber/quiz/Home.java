package com.example.amber.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button b1,b2;
        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Home.this,First.class);
                        startActivity(i);
                    }
                }

        );

        b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Toast.makeText(Home.this, "Developed by: Amber Gautam", Toast.LENGTH_SHORT).show();
                    }
                }

        );


    }
}
