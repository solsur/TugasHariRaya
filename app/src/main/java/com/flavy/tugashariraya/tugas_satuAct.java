package com.flavy.tugashariraya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import static java.sql.Types.NULL;

public class tugas_satuAct extends AppCompatActivity {

    EditText et_min, et_max;
    Button btn_hasil;
    TextView hasil;

    Random rand;
    int max, min, output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_satu);

        rand = new Random();

        et_min = findViewById(R.id.et_min);
        et_max = findViewById(R.id.et_max);
        btn_hasil = findViewById(R.id.btn_hasil);
        hasil = findViewById(R.id.hasil);


        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String tempMin, tempMax;
                tempMin = et_min.getText().toString();
                tempMax = et_max.getText().toString();


                if (!tempMin.equals("") && !tempMax.equals("")) {

                    min = Integer.parseInt(et_min.getText().toString());
                    max = Integer.parseInt(et_max.getText().toString());

                    if (max > min) {

                        output = rand.nextInt((max - min) + 1) + min;

                        hasil.setText("" + output);
                    }


                }

                //jika tidak mengisi min dan max maka akan tampil notifikasi
                else if(min==NULL && max==NULL){
                    Toast.makeText(getApplication(),"Nilai Minimal dan maksimal tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }


            }
        });


    }
}
