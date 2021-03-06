package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Ls_lingkaran extends AppCompatActivity {
    EditText JJ_LG;
    Button Btn;
    TextView TVhsl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ls_lingkaran);
        JJ_LG = findViewById(R.id.msk_jj_LG);
        Btn = findViewById(R.id.btnhitung_L_LG);
        TVhsl = findViewById(R.id.hsl_L_LG);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double jari2 = Double.parseDouble(JJ_LG.getText().toString());
                double phi = 3.14;
                double luas = 0.5 * phi *jari2 * jari2;
                StringBuilder sb = new StringBuilder();
                sb.append("luas lingkaran dengan jari2: ");
                sb.append(jari2);
                sb.append(" adalah: ");
                sb.append(luas);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
