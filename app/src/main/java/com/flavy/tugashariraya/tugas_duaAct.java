package com.flavy.tugashariraya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.ref.SoftReference;
import java.math.BigInteger;
import java.util.ArrayList;

import static java.sql.Types.NULL;

public class tugas_duaAct extends AppCompatActivity {
    EditText et_angka;
    Button btn_hasil2;
    TextView hasil2;

    int inputan;
    int temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_dua);

        et_angka = findViewById(R.id.et_angka);
        btn_hasil2 = findViewById(R.id.btn_hasil2);
        hasil2 = findViewById(R.id.hasil2);

        btn_hasil2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String Tempnum = et_angka.getText().toString();

                if(!Tempnum.equals("")){

                    inputan = Integer.parseInt(et_angka.getText().toString());

                    String num = "Factors dari " + inputan + " adalah : ";


                    for (int i = 1; i <= inputan; i++){

                        if(inputan%i==0){

                            num = num + " " + String.valueOf(i);

                        }
                    }

                    hasil2.setText(num);
//                    hasil2.setText(fbil(inputan,inputan));

                }
                //jika tidak mengisi min dan max maka akan tampil notifikasi
                else if(inputan==NULL){
                    Toast.makeText(getApplication(),"Nilai tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }


            }
        });

    }

//    public void fbil(int bil, int rekursif)///Fungsi tambahan
//    {
//
//        if(rekursif==1)
//        {
//            System.out.println(rekursif);
//        }
//        else
//        {
//            if(rekursif==bil)
//            {
//                temp=bil;
//            }
//            if(factors(rekursif)!=0)
//            {
//                System.out.println(factors(rekursif));
//            }
//            fbil(bil,rekursif-1);
//        }
//    }
//    int factors(int number)///Fungsi yang dimaksud
//    {
//        if(temp%number==0)
//        {
//            return number;
//        }
//        else
//        {
//            return 0;
//        }
//    }

}
