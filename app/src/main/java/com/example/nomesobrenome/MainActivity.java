package com.example.nomesobrenome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    EditText sobrenome;
    TextView nomeSobrenome;
    Button consultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = (EditText) findViewById(R.id.editTextTextPersonName);
        sobrenome = (EditText) findViewById(R.id.editTextTextPersonName2);
        nomeSobrenome = (TextView) findViewById(R.id.textView3);
        consultar = (Button) findViewById(R.id.button);

        consultar.setOnClickListener(c->{
            if (nome.getText().toString().equals("") && sobrenome.getText().toString().equals("")){
                nomeSobrenome.setText("Nome não inserido");
            } else {
                nomeSobrenome.setText("Olá " + nome.getText() + " " + sobrenome.getText());
            }
        });
    }
}