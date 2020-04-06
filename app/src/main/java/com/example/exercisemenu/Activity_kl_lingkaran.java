package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_kl_lingkaran extends AppCompatActivity {
    EditText JJ_LG;
    Button Btn;
    TextView TVhsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kl_lingkaran);
        JJ_LG = findViewById(R.id.msk_jj_LG);
        Btn = findViewById(R.id.btnhitung_K_LG);
        TVhsl = findViewById(R.id.hsl_K_LG);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double jari2 = Double.parseDouble(JJ_LG.getText().toString());
                double phi = 3.14;
                double keliling = 2 * phi *jari2 ;
                StringBuilder sb = new StringBuilder();
                sb.append("Keliling lingkaran dengan jari2: ");
                sb.append(jari2);
                sb.append(" adalah: ");
                sb.append(keliling);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });

    }
}
