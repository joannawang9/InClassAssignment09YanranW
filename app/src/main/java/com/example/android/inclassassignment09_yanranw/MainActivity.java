package com.example.android.inclassassignment09_yanranw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText keyword;
    EditText title;
    EditText year;
    CheckBox isAvailable;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference albumRef = database.getReference("Keyword");
    private DatabaseReference albumsRef = database.getReference("Multiple albums");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        keyword = (EditText) findViewById(R.id.keyword);
        title = (EditText) findViewById(R.id.title);
        year = (EditText) findViewById(R.id.year);
        isAvailable = (CheckBox) findViewById(R.id.available);
    }

    public void set(View view) {
        albumRef.setValue(keyword.getText().toString());
    }

    public void add(View view) {
        albumsRef.push().setValue(new Album(title.getText().toString(), Integer.parseInt(year.getText().toString()), isAvailable.isChecked()));
    }
}
