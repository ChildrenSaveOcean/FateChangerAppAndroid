package com.example.fatechanger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Studentone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentone);
        Button b = (Button)findViewById(R.id.home);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(),Home.class);
                startActivity(i);
            }

        });
        Button c = (Button)findViewById(R.id.location);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(),Location.class);
                startActivity(i);
            }

        });
        Button e = (Button)findViewById(R.id.photovideo);
        e.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(),photovideo.class);
                startActivity(i);
            }

        });
        Button f = (Button)findViewById(R.id.donation);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(),Donation.class);
                startActivity(i);
            }

        });
        Button g = (Button)findViewById(R.id.Tips);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(),ips.class);
                startActivity(i);
            }

        });
        Button h = (Button)findViewById(R.id.share);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(),sharepage.class);
                startActivity(i);
            }

        });
        Button eb = (Button)findViewById(R.id.learnmore);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(v.getContext(),studentlearnmore.class);
                startActivity(i);
            }

        });
    }
}
