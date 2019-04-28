package com.example.skyze.topquiz.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.skyze.topquiz.R;
import com.example.skyze.topquiz.modele.Utilisateur;

public class MainActivity extends AppCompatActivity {

    private TextView texteTitre;
    private EditText nom;
    private Button boutonNom;
    private Utilisateur user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = new Utilisateur();
        // recupere les objets de l'interface
        texteTitre = findViewById(R.id.textView);
        nom = findViewById(R.id.editText);
        boutonNom = findViewById(R.id.button);

        // desactive le bouton
        boutonNom.setEnabled(false);

        nom.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if( s.toString().length() != 0){
                    boutonNom.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        boutonNom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nom.getText().toString();
                user.setNom(name);
                Intent gameActivity = new Intent(MainActivity.this,GameActivity.class);
                startActivity(gameActivity);
            }
        });


    }
}
