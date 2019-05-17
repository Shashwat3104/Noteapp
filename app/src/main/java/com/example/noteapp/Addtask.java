package com.example.noteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class Addtask extends AppCompatActivity {

    Button btn;
    EditText titleofnote;
    String note;
    EditText typecontent;
    String contentofnote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtask);
        typecontent = findViewById(R.id.content);
        titleofnote = findViewById(R.id.titleofnote);
        btn = findViewById(R.id.save_button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(Addtask.this, Viewnotes.class);
                note = titleofnote.getText().toString();
                contentofnote = typecontent.getText().toString();
                i.putExtra ("Transfernotename", note);
                i.putExtra ("Transfercontent", contentofnote);
                startActivity(i);
                finish();
            }
        });
    }

}
