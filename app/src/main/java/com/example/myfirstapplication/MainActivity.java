package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int size = 20;
    public void bigger(View v){
        TextView txv;
        txv = (TextView) findViewById(R.id.txv);
        txv.setTextSize(++size);
    }

    public void display(View v){
        EditText name = (EditText) findViewById(R.id.name);
        TextView text2 = (TextView) findViewById(R.id.txv);
        text2.setText(name.getText().toString());
    }
<<<<<<< HEAD


}
=======
}
>>>>>>> e5201aa03c3049c370fb5ce47535efaf0b2f5fb0
