package com.example.scannella.testhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final Button button = (Button) findViewById(R.id.btnPress);
        final TextView word = (TextView) findViewById(R.id.txtHello);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word.setText("Yo");
            }
        });
    }
}