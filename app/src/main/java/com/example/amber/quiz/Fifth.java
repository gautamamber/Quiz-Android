package com.example.amber.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Fifth extends AppCompatActivity {
    Button c1, c2, c3, c4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        c1 = (Button) findViewById(R.id.c1);
        c2 = (Button) findViewById(R.id.c2);
        c3 = (Button) findViewById(R.id.c3);
        c4 = (Button) findViewById(R.id.c4);


        c1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Fifth.this,Fail.class);
                        startActivity(i);
                    }
                }

        );
        c2.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Fifth.this,Congratulation
                                .class);
                        startActivity(i);
                    }
                }

        );
        c3.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Fifth.this,Fail.class);
                        startActivity(i);
                    }
                }

        );
        c4.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i =new Intent(Fifth.this,Congratulation.class);
                        startActivity(i);
                    }
                }

        );

}
}
