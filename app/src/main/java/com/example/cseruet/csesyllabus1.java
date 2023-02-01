package com.example.cseruet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class csesyllabus1 extends AppCompatActivity {

    PDFView cseoneodd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesyllabus1);
        cseoneodd=(PDFView)findViewById(R.id.csesyllabus1);
        cseoneodd.fromAsset("csesyllabus1.pdf").load();
    }
}
