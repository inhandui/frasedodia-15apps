package com.cursoandroid.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button novaFrase; //Button to perform an action to show a new phrase
    private TextView frase; //actual phrase

    private String[] frases = { "Please understand this ... It's important to wake up everyday and feel like it's Saturday - Gary Vee",
            "You don't decide what's quality, the market does - Gary Vee",
            "Give, give, give, then ask - Gary Vee"
    };

    private Random random;

    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        novaFrase = findViewById(R.id.btn_novaFrase);
        frase = findViewById(R.id.txt_frase);

    }
}
