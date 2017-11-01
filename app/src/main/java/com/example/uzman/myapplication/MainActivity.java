package com.example.uzman.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText firstText = (EditText) findViewById(R.id.txt_first);
        final EditText secondText = (EditText) findViewById(R.id.txt_second);
        final EditText resultText = (EditText) findViewById(R.id.txt_result);

        Button btn_arti = (Button)findViewById(R.id.btn_arti);
        btn_arti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int firstSayi = Integer.parseInt(firstText.getText().toString());
                int secondSayi = Integer.parseInt(secondText.getText().toString());
                resultText.setText(String.valueOf(firstSayi + secondSayi));
            }
        });

        Button btn_eksi = (Button)findViewById(R.id.btn_eksi);
        btn_eksi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int firstSayi = Integer.parseInt(firstText.getText().toString());
                int secondSayi = Integer.parseInt(secondText.getText().toString());
                resultText.setText(String.valueOf(firstSayi - secondSayi));
            }
        });

        Button btn_carpi = (Button)findViewById(R.id.btn_carpi);
        btn_carpi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText resultText = (EditText) findViewById(R.id.txt_result);

                int firstSayi = Integer.parseInt(firstText.getText().toString());
                int secondSayi = Integer.parseInt(secondText.getText().toString());
                resultText.setText(String.valueOf(firstSayi * secondSayi));
            }
        });

        Button btn_bolme = (Button)findViewById(R.id.btn_bolme);
        btn_bolme.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                int firstSayi = Integer.parseInt(firstText.getText().toString());
                int secondSayi = Integer.parseInt(secondText.getText().toString());
                resultText.setText(String.valueOf(firstSayi / secondSayi));
            }
        });

    }
}
