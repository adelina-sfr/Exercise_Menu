package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn2;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn2 = findViewById(R.id.btnok);
        username = findViewById(R.id.editUN);
        password = findViewById(R.id.editPass);
//
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //if else blm
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("123")){
                    Intent intent = new Intent(MainActivity.this,Layout_menu.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(),"Password Salah",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}
