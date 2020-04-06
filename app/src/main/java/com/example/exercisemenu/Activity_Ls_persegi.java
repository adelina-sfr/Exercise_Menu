package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Ls_persegi extends AppCompatActivity {
    Button Btn;
    EditText SS_P;
    TextView TVhsl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ls_persegi);
        SS_P = findViewById(R.id.msk_p_sisi);
        Btn = findViewById(R.id.btnhitung_L_p);
        TVhsl = findViewById(R.id.hsl_L_P);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double sisi = Double.parseDouble(SS_P.getText().toString());
                double luas = sisi*sisi;
                StringBuilder sb = new StringBuilder();
                sb.append("luas persegi dengan sisi: ");
                sb.append(sisi);
                sb.append(" adalah: ");
                sb.append(luas);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
