package com.example.cseruet;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class csesyllabus extends AppCompatActivity {

    private Button one,two,three,four,five,six,seven,eight;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesyllabus);
        one=(Button)findViewById(R.id.csesyllabusone);
        two=(Button)findViewById(R.id.csesyllabustwo);
        three=(Button)findViewById(R.id.csesyllabusthree);
        four=(Button)findViewById(R.id.csesyllabusfour);
        five=(Button)findViewById(R.id.csesyllabusfive);
        six=(Button)findViewById(R.id.csesyllabussix);
        seven=(Button)findViewById(R.id.csesyllabusseven);
        eight=(Button)findViewById(R.id.csesyllabuseight);
        toolbar=(androidx.appcompat.widget.Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(csesyllabus.this,csesyllabus1.class);
                startActivity(intent1);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(csesyllabus.this, csesyllabus2.class);
                startActivity(intent2);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(csesyllabus.this, csesyllabus3.class);
                startActivity(intent3);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4=new Intent(csesyllabus.this, csesyllabus4.class);
                startActivity(intent4);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(csesyllabus.this, csesyllabus5.class);
                startActivity(intent1);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(csesyllabus.this, csesyllabus6.class);
                startActivity(intent1);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(csesyllabus.this, csesyllabus7.class);
                startActivity(intent1);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(csesyllabus.this, csesyllabus8.class);
                startActivity(intent1);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.infor:
                startActivity(new Intent(this, info.class));
                return true;
            case R.id.about:
                startActivity(new Intent(this, about.class));
                return true;
            case R.id.settings:
                startActivity(new Intent(this, settings.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
