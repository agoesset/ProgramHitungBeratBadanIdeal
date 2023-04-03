package com.example.programhitungberatbadanideal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_nama, edit_umur, edit_bb, edit_tb;
    TextView edit_hasil;
    Button button_hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_nama=findViewById(R.id.editNama);
        edit_umur=findViewById(R.id.editUmur);
        edit_bb=findViewById(R.id.editBeratBadan);
        edit_tb=findViewById(R.id.editTinggiBadan);
        edit_hasil=findViewById(R.id.editHasil);
        //button_hitung = findViewById(R.id.buttonHitung);
        Button proses = findViewById(R.id.buttonHitung);
        proses.setOnClickListener(this::onClick);
    }
    private void onClick(View v) {
        String stringNama = edit_nama.getText().toString();
        double bbi2;
        String stringTinggiBadan = edit_tb.getText().toString();
        double tinggibadan = Double.parseDouble(stringTinggiBadan);
        String stringBeratBadan = edit_bb.getText().toString();
        double beratbadan = Double.parseDouble(stringBeratBadan);
        bbi2 = beratbadan/(tinggibadan * tinggibadan);

        if (bbi2 < 18.5){
            String bbi3=String.valueOf(bbi2);
            edit_hasil.setText("Hasil BMI " + stringNama + " adalah "+bbi3+ " dengan status Kekurangan berat badan");
        }
        if (bbi2 >= 18.5 && bbi2 <= 24.9){
            String bbi3=String.valueOf(bbi2);
            edit_hasil.setText("Hasil BMI " + stringNama + " adalah "+bbi3+ " dengan status Normal(ideal)");
        }
        if (bbi2 >= 25.0 && bbi2 <= 29.9){
            String bbi3=String.valueOf(bbi2);
            edit_hasil.setText("Hasil BMI " + stringNama + " adalah "+bbi3+ " dengan status Kelebihan berat badan");
        }
        if (bbi2 >= 30.0){
            String bbi3=String.valueOf(bbi2);
            edit_hasil.setText("Hasil BMI " + stringNama + " adalah "+bbi3+ " dengan status Kegemukan (Obesitas)");
        }

    }
}
