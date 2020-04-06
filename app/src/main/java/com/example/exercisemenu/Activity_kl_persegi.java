package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_kl_persegi extends AppCompatActivity {
    Button Btn;
    EditText SS_P;
    TextView TVhsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kl_persegi);
        SS_P = findViewById(R.id.msk_p_sisi);
        Btn = findViewById(R.id.btnhitung_k_p);
        TVhsl = findViewById(R.id.hsl_k_p);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double sisi = Double.parseDouble(SS_P.getText().toString());
                double keliling = sisi*4;
                StringBuilder sb = new StringBuilder();
                sb.append("Keliling persegi dengan sisi: ");
                sb.append(sisi);
                sb.append(" adalah: ");
                sb.append(keliling);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
