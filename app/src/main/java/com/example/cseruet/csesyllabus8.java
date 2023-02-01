package com.example.cseruet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cseruet.R;
import com.github.barteksc.pdfviewer.PDFView;

public class csesyllabus8 extends AppCompatActivity {


    PDFView cseoneodd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesyllabus8);
        cseoneodd=(PDFView)findViewById(R.id.csesyllabus8);
        cseoneodd.fromAsset("csesyllabus8.pdf").load();
    }
}
