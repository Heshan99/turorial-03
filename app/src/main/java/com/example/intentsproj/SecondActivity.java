package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText snumber1s,snumber2s;
    TextView viewResult;
    Button btonadd,btonsub,btonmul,btondiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        snumber1s = findViewById(R.id.txt1);
        snumber2s = findViewById(R.id.txt2);
        viewResult=findViewById(R.id.text);

        btonadd = findViewById(R.id.addbut);
        btonsub = findViewById(R.id.subbut);
        btonmul = findViewById(R.id.multibut);
        btondiv = findViewById(R.id.divbut);

        String nm1 = getIntent().getStringExtra("number1");
        String nm2 = getIntent().getStringExtra("number2");

        snumber1s.setText(nm1);
        snumber2s.setText(nm2);

        btonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(snumber1s.getText().toString());
                int numberT = Integer.parseInt(snumber2s.getText().toString());
                int btonadd = numberO+numberT;
                viewResult.setText((numberO)+"+"+(numberT)+"="+(btonadd));


            }
        });
        btonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(snumber1s.getText().toString());
                int numberT = Integer.parseInt(snumber2s.getText().toString());
                int btonsub = numberO - numberT;
                viewResult.setText((numberO)+"-"+(numberT)+"="+(btonsub));
            }
        });
        btonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(snumber1s.getText().toString());
                int numberT = Integer.parseInt(snumber2s.getText().toString());
                int btonmul = numberO * numberT;
                viewResult.setText((numberO)+"*"+(numberT)+"="+(btonmul));
            }
        });
        btondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numberO = Integer.parseInt(snumber1s.getText().toString());
                int numberT = Integer.parseInt(snumber2s.getText().toString());
                int btondiv = numberO / numberT;
                viewResult.setText((numberO)+"/"+(numberT)+"="+(btondiv));
            }
        });

    }
}