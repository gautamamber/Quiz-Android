package com.example.amber.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Congratulation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulation);
        Button b1;
        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Congratulation.this,Home.class);
                        startActivity(i);
                    }
                }

        );



    }
}
