package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Layout_menu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    int kode;
    Button BtnPS;
    Button BtnPP;
    Button BtnS3;
    Button BtnLR;
    Button BtnTP;
    Button Btnoff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_menu);
        BtnPS = findViewById(R.id.btnPersegi);
        BtnPP = findViewById(R.id.btnPP);
        BtnS3 = findViewById(R.id.btnSetiga);
        BtnLR = findViewById(R.id.btnLingkaran);
        BtnTP = findViewById(R.id.btntrapesium);
        Btnoff = findViewById(R.id.btnoff);
        BtnPS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 1;
                PopupMenu pop = new PopupMenu(Layout_menu.this, v);
                pop.setOnMenuItemClickListener(Layout_menu.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        BtnLR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 2;
                PopupMenu pop = new PopupMenu(Layout_menu.this, v);
                pop.setOnMenuItemClickListener(Layout_menu.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        BtnPP.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 3;
                PopupMenu pop = new PopupMenu(Layout_menu.this, v);
                pop.setOnMenuItemClickListener(Layout_menu.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        BtnS3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 4;
                PopupMenu pop = new PopupMenu(Layout_menu.this, v);
                pop.setOnMenuItemClickListener(Layout_menu.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        BtnTP.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                kode = 5;
                PopupMenu pop = new PopupMenu(Layout_menu.this, v);
                pop.setOnMenuItemClickListener(Layout_menu.this);
                pop.inflate(R.menu.optionmenu);
                pop.show();
            }
        });
        Btnoff.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mKL:
                int i = kode;
                if (i == 1) {
                    startActivity(new Intent(getApplicationContext(),Activity_kl_persegi.class));
                    break;
                }
                if (i == 2) {
                    startActivity(new Intent(getApplicationContext(), Activity_kl_lingkaran.class));
                    break;
                }
                if (i == 3) {
                    startActivity(new Intent(getApplicationContext(), Activity_kl_PP.class));
                    break;
                }
                if (i == 4) {
                    startActivity(new Intent(getApplicationContext(), Activity_kl_s3.class));
                    break;
                }
                if (i == 5) {
                    startActivity(new Intent(getApplicationContext(), Activity_kl_tp.class));
                    break;
                }
            case R.id.mLS:
                int i2 = kode;
                if (i2 == 1) {
                    startActivity(new Intent(getApplicationContext(), Activity_Ls_persegi.class));
                    break;
                }
                if (i2 == 2) {
                    startActivity(new Intent(getApplicationContext(), Activity_Ls_lingkaran.class));
                    break;
                }
                if (i2 == 3) {
                    startActivity(new Intent(getApplicationContext(), Activity_Ls_PP.class));
                    break;
                }
                if (i2 == 4) {
                    startActivity(new Intent(getApplicationContext(), Activity_Ls_s3.class));
                    break;
                }
                if (i2 == 5) {
                    startActivity(new Intent(getApplicationContext(), Activity_Ls_tp.class));
                    break;
                }
        }
        return true;
    }
}
