package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Ls_tp extends AppCompatActivity {
    Button Btn;
    EditText PJ_AB_TP;
    EditText PJ_EF_TP;
    EditText PJ_t_TP;
    TextView TVhsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ls_tp);
        PJ_AB_TP = findViewById(R.id.mskPJ_AB_TP);
        PJ_EF_TP = findViewById(R.id.mskPJ_EF_TP);
        PJ_t_TP = findViewById(R.id.mskPJ_t_TP);
        Btn = findViewById(R.id.btnhitung_K_TP);
        TVhsl =  findViewById(R.id.hsl_K_TP);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double AB = Double.parseDouble(PJ_AB_TP.getText().toString());
                double EF = Double.parseDouble(PJ_EF_TP.getText().toString());
                double t = Double.parseDouble(PJ_t_TP.getText().toString());
                double luas = ((AB + EF *t)/2);
                StringBuilder sb = new StringBuilder();
                sb.append("keliling Trapesium dengan panjang AB: ");
                sb.append(AB);
                sb.append(" dan panjang EF: ");
                sb.append(EF);
                sb.append(" dan tinggi: ");
                sb.append(t);
                sb.append(" adalah: ");
                sb.append(luas);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}