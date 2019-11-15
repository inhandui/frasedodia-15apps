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

    private String[] frases = { "Please understand this ... It's important to wake up everyday and feel like it's Saturday. - Gary Vee",
            "You don't decide what's quality, the market does. - Gary Vee",
            "Give, give, give, then ask. - Gary Vee",
            "Skills are cheap. Passion is priceless. - Gary Vee",
            "No matter what you do, your job is to tell your story. - Gary Vee",
            "Look yourself in the mirror and ask yourself, what do I want to do everyday for the rest of my life…do that. - Gary Vee",
            "The truth is that finding happiness in what you do every day is so imperative. - Gary Vee",
            "There is never a bad time to start a business – unless you want to start a mediocre one. - Gary Vee",
            "All your ideas may be solid or even good .. But you have to Actually EXECUTE on them for them to matter. - Gary Vee",
            "Love your family, work super hard, live your passion. - Gary Vee",
            "Anyone giving you hate has it way worse than you. - Gary Vee",
            "You can't read about push ups. You gotta do them. - Gary Vee"
    };

    private Random random;

    private int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        novaFrase = findViewById(R.id.btn_novaFrase);
        frase = findViewById(R.id.txt_frase);

        novaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero = random.nextInt(3);
                frase.setText(frases[numero]);
            }
        });

    }
}
