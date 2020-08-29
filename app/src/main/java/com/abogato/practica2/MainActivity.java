package com.abogato.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button miboton = (Button) findViewById(R.id.button3);
        final TextView mitexto = (TextView) findViewById(R.id.texto1);

        miboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mitexto.setText("!!!Enviado!!!");
            }
        });
    }
}