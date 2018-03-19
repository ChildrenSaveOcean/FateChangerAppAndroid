package com.example.fatechanger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class firstlearn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstlearn);
        Button c = (Button) findViewById(R.id.goback);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), studentlearnmore.class);
                startActivity(i);
            }
        });
        Button cd = (Button) findViewById(R.id.spread);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), spread.class);
                startActivity(i);
            }

        });
        Button cde = (Button) findViewById(R.id.write);
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), write.class);
                startActivity(i);
            }

        });
        Button cdef = (Button) findViewById(R.id.changefate);       // changed from R.id.changefates to R.id.changefate
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), changefate.class);
                startActivity(i);
            }

        });
    }
}
