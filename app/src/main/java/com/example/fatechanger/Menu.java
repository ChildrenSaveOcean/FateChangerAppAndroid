package com.example.fatechanger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button b = (Button)findViewById(R.id.student);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(),Studentone.class);
                startActivity(i);
            }

        });
        Button c = (Button)findViewById(R.id.teacher);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(), Teacherone.class);
                startActivity(i);
            }
        });
        Button d = (Button)findViewById(R.id.someone);
        d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(), Someoneone.class);
                startActivity(i);
            }
        });
    }
}
