package com.example.cseruet;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button info;
    private Button routine;
    private Button syllabus;
    private Button emergency;
    private Button chotha,about;
    LinearLayout layout;
    private Toolbar main;
    int[] colours = {Color.parseColor("#04c5fd"), Color.parseColor("#a9e9fb")};

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (LinearLayout) findViewById(R.id.home);
        info = (Button) findViewById(R.id.info);
        routine = (Button) findViewById(R.id.routine);
        syllabus = (Button) findViewById(R.id.syllabus);
        emergency = (Button) findViewById(R.id.emmergency);
        main = (Toolbar) findViewById(R.id.toolbar);
        chotha=findViewById(R.id.chotha);
        about=findViewById(R.id.about);
        setSupportActionBar(main);
        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, colours);
        gd.setCornerRadius(0f);
        layout.setBackground(gd);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, info.class);
                startActivity(intent);
            }
        });
        syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, csesyllabus.class);
                startActivity(intent);
            }
        });
        routine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, routine.class);
                startActivity(intent);
            }
        });
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, emmergency.class);
                startActivity(intent);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, about.class));
            }
        });
        chotha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, chotha.class));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
