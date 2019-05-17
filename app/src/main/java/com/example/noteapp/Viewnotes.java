package com.example.noteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Viewnotes extends AppCompatActivity {
    TextView fortitle;
    String title;
    TextView forcontent;
    String content;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewnotes);
        fortitle =findViewById(R.id.notetitle);
        forcontent =findViewById(R.id.notecontent);
        title =getIntent().getExtras().getString("Transfernotename");
        content =getIntent().getExtras().getString("Transfercontent");
        fortitle.setText("Title-"+title);
        forcontent.setText("Content-"+content);

    }
}
