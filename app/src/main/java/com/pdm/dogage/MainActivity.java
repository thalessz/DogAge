package com.pdm.dogage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtIdade = findViewById(R.id.edt_idade);
        Button btnConverter = findViewById(R.id.btn_converter);
        TextView resp = findViewById(R.id.resul);
        btnConverter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("rafa boiola");
                int idade = Integer.parseInt(edtIdade.getText().toString());
                idade*=7;
                resp.setText("Seu cão tem " +idade+" anos humanos");
            }
        });
    }
}