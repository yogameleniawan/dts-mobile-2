package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtLuas;
    TextView txtKeliling;
    Button btnHitung;
    EditText editJari;
    float  jari;
    double keliling;
    double luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitung(View view){
        txtLuas = findViewById(R.id.txtv_luas);
        txtKeliling = findViewById(R.id.txtv_keliling);
        btnHitung = findViewById(R.id.btn_hitung);
        editJari = findViewById(R.id.etext_jari);

        jari = Float.parseFloat(editJari.getText().toString());

        luas = Math.pow(jari,2)* Math.PI;
        keliling = jari * 2 * Math.PI;
        txtLuas.setText("Luas : " + String.valueOf(luas));
        txtKeliling.setText("Keliling : " + String.valueOf(keliling));
    }
}