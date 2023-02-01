package com.example.cseruet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cseruet.R;
import com.github.barteksc.pdfviewer.PDFView;

public class csesyllabus2 extends AppCompatActivity {

    PDFView cseoneodd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesyllabus2);
        cseoneodd=(PDFView)findViewById(R.id.csesyllabus2);
        cseoneodd.fromAsset("csesyllabus2.pdf").load();
    }
}
