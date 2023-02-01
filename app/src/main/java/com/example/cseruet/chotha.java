package com.example.cseruet;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class chotha extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chotha);
        pdfView=findViewById(R.id.online);
        pdfView.fromAsset("onlineroutine.pdf").load();

    }
}
