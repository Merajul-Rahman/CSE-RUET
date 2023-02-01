package com.example.cseruet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.cseruet.R;
import com.github.barteksc.pdfviewer.PDFView;

public class csesyllabus7 extends AppCompatActivity {
    PDFView cseoneodd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesyllabus7);
        cseoneodd=(PDFView)findViewById(R.id.csesyllabus7);
        cseoneodd.fromAsset("csesyllabus7.pdf").load();
    }
}
