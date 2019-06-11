package com.flavy.tugashariraya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.*;

public class homeAct extends AppCompatActivity {

    LinearLayout btn_tugas_satu;
    LinearLayout btn_tugas_dua;
    LinearLayout btn_tugas_tiga;
    LinearLayout btn_tugas_empat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_tugas_satu = findViewById(R.id.btn_tugas_satu);
        btn_tugas_dua = findViewById(R.id.btn_tugas_dua);
        btn_tugas_tiga = findViewById(R.id.btn_tugas_tiga);
        btn_tugas_empat = findViewById(R.id.btn_tugas_empat);

        btn_tugas_satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tugas_satu = new Intent(homeAct.this, tugas_satuAct.class);
                startActivity(tugas_satu);
            }
        });

        btn_tugas_dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tugas_dua = new Intent(homeAct.this, tugas_duaAct.class);
                startActivity(tugas_dua);
            }
        });

        btn_tugas_tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tugas_tiga = new Intent(homeAct.this, tugas_tigaAct.class);
                startActivity(tugas_tiga);
            }
        });

        btn_tugas_empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tugas_empat = new Intent(homeAct.this, tugas_empatAct.class);
                startActivity(tugas_empat);
            }
        });
    }


}
