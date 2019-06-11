package com.flavy.tugashariraya;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.io.*;
import static java.sql.Types.NULL;

public class tugas_tigaAct extends AppCompatActivity {

    EditText et_nilai_1, et_nilai_2;
    Button btn_fpb;
    TextView hasil_fpb;

    int nilai1, nilai2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_tiga);

        et_nilai_1 = findViewById(R.id.et_nilai_1);
        et_nilai_2 = findViewById(R.id.et_nilai_2);
        btn_fpb = findViewById(R.id.btn_fpb);
        hasil_fpb = findViewById(R.id.hasil_fpb);

        btn_fpb.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String TempNum1, TempNum2;

                TempNum1 = et_nilai_1.getText().toString();
                TempNum2 = et_nilai_2.getText().toString();

                if(!TempNum1.equals("") && !TempNum2.equals("") ){

                    nilai1 = Integer.parseInt(et_nilai_1.getText().toString());
                    nilai2 = Integer.parseInt(et_nilai_2.getText().toString());

                    hasil_fpb. setText("Fpb dari " + nilai1 + " dan " + nilai2 + " adalah : " + get_fpb(nilai1, nilai2));


                }
                //jika nilai kosong akan muncul toast dibawah ini
                else if(nilai1==NULL && nilai2==NULL){
                    Toast.makeText(getApplicationContext(), " Nilai tidak boleh kosong", Toast.LENGTH_LONG).show();
                }




            }
        });


    }

    private static int get_fpb(int num1, int num2){

        if((num2<=num1) && (num1%num2==0)){

            return num2;
        }

        else if(num1 < num2){

            return  get_fpb(num2, num1);
        }
        else {
            return get_fpb(num2, num1%num2);
        }
    }
}
