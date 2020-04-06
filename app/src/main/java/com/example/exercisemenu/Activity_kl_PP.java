package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_kl_PP extends AppCompatActivity {
    Button Btn;
    EditText PP_P;
    EditText PP_L;
    TextView TVhsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kl__pp);
        PP_P = findViewById(R.id.msk_pj_PP);
        PP_L = findViewById(R.id.msk_lb_PP);
        Btn = findViewById(R.id.btnhitung_K_PP);
        TVhsl = findViewById(R.id.hsl_K_PP);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double panjang = Double.parseDouble(PP_P.getText().toString());
                double lebar = Double.parseDouble(PP_L.getText().toString());
                double keliling = 2*(panjang+lebar);
                StringBuilder sb = new StringBuilder();
                sb.append("Keliling persegi dengan panjang: ");
                sb.append(panjang);
                sb.append("dan lebar: ");
                sb.append(lebar);
                sb.append(" adalah: ");
                sb.append(keliling);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
