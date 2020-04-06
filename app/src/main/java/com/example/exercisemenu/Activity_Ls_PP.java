package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_Ls_PP extends AppCompatActivity {
    Button Btn;
    EditText PP_P;
    EditText PP_L;
    TextView TVhsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ls__pp);
        PP_P = findViewById(R.id.msk_pj_PP);
        PP_L = findViewById(R.id.msk_lb_PP);
        Btn = findViewById(R.id.btnhitung_L_PP);
        TVhsl = findViewById(R.id.hsl_L_PP);
        Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double panjang = Double.parseDouble(PP_P.getText().toString());
                double lebar = Double.parseDouble(PP_L.getText().toString());
                double Luas = panjang*lebar;
                StringBuilder sb = new StringBuilder();
                sb.append("Luas persegi dengan panjang: ");
                sb.append(panjang);
                sb.append("dan lebar: ");
                sb.append(lebar);
                sb.append(" adalah: ");
                sb.append(Luas);
                sb.append(BuildConfig.FLAVOR);
                TVhsl.setText(sb.toString());
            }
        });
    }
}
