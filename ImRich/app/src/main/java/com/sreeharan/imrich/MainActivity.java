package com.sreeharan.imrich;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast; //Import this for creating Toast object

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked(View view) {
        String message = "I'm Rich"; // message to be displayed in Toast
        int duration = Toast.LENGTH_SHORT; // duration of the Toast

        Toast toast = Toast.makeText(MainActivity.this, message, duration); //Creating a Toast Object
        toast.show(); //Showing the Toast message
    }
}