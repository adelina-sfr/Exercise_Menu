package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_kl_s3 extends AppCompatActivity {
    Button Btn;
    EditText Als_s3;
    EditText s3_t;
    EditText msk_MRG_s3;
    TextView TVhsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kl_s3);
        Als_s3 = findViewById(R.id.mskAls_s3);
        s3_t = findViewById(R.id.mskTG_s3);
        msk_MRG_s3 = findViewById(R.id.mskMRG_s3);
        Btn = findViewById(R.id.btnhitung_k_s3);
        TVhsl = findViewById(R.id.hsl_k_s3);

        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double alas = Double.parseDouble(Als_s3.getText().toString());
                double tinggi = Double.parseDouble(s3_t.getText().toString());
                double miring = Double.parseDouble(msk_MRG_s3.getText().toString());
                double keliling = alas + tinggi + miring;
                StringBuilder sb = new StringBuilder();
                sb.append("Keliling Segitiga dengan alas: ");
                sb.append(alas);
                sb.append(" dan tinggi: ");
                sb.append(tinggi);
                sb.append(" dan miring: ");
                sb.append(miring);
                sb.append(" adalah: ");
                sb.append(keliling);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
