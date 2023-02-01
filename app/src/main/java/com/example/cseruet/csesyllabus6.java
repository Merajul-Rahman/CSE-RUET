package com.example.cseruet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cseruet.R;
import com.github.barteksc.pdfviewer.PDFView;

public class csesyllabus6 extends AppCompatActivity {

    PDFView cseoneodd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesyllabus6);
        cseoneodd=(PDFView)findViewById(R.id.csesyllabus6);
        cseoneodd.fromAsset("csesyllabus6.pdf").load();
    }
}
