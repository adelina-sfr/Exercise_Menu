package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Ls_s3 extends AppCompatActivity {
    Button Btn;
    EditText Als_s3;
    EditText s3_t;
    TextView TVhsl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ls_s3);
        Als_s3 = findViewById(R.id.mskAls_s3);
        s3_t = findViewById(R.id.msk_s3_t);
        Btn = findViewById(R.id.btnhitung_s3);
        TVhsl = findViewById(R.id.hsl_L_s3);

        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double alas = Double.parseDouble(Als_s3.getText().toString());
                double tinggi = Double.parseDouble(s3_t.getText().toString());
                double luas = (alas * tinggi) / 2.0;
                StringBuilder sb = new StringBuilder();
                sb.append("Luas Segitiga dengan alas: ");
                sb.append(alas);
                sb.append(" dan tinggi: ");
                sb.append(tinggi);
                sb.append(" adalah: ");
                sb.append(luas);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}