package com.flavy.tugashariraya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    Button buttonprofil;
    TextView tugas1;
    TextView tugas2;
    TextView tugas3;
    TextView tugas4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonprofil = findViewById(R.id.buttonprofil);
        tugas1 = findViewById(R.id.tugas1);
        tugas2 = findViewById(R.id.tugas2);
        tugas3 = findViewById(R.id.tugas3);
        tugas4 = findViewById(R.id.tugas4);

        buttonprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent simplemode = new Intent(MainActivity.this, homeAct.class);
                startActivity(simplemode);
            }
        });


        tugas1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tugas1 = new Intent(MainActivity.this, tugas_satuAct.class);
                startActivity(tugas1);
            }
        });

        tugas2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tugas2 = new Intent(MainActivity.this, tugas_duaAct.class);
                startActivity(tugas2);
            }
        });

        tugas3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tugas3 = new Intent(MainActivity.this, tugas_tigaAct.class);
                startActivity(tugas3);
            }
        });

        tugas4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tugas4 = new Intent(MainActivity.this, tugas_empatAct.class);
                startActivity(tugas4);
            }
        });
    }

    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int nilai = userInput.nextInt();
        System.out.println("Anda memasukkan nilai = " + nilai);
        printnilai(nilai);

        int jumlah = jumlahnilai(nilai);
        System.out.println("Jumlah = " + jumlah);

        int faktorial = hitungFaktorial(nilai);
        System.out.println("Faktorial = " + faktorial);
    }

    private static void printnilai(int parameter){
        System.out.println("nilai = " + parameter);
        if(parameter==0)
        {
            return;
        }
        parameter--;

        printnilai(parameter);


    }

    private static int jumlahnilai(int parameter){
        System.out.println("parameter = " + parameter);

        if(parameter == 1)
        {
            return parameter;
        }
        return parameter + jumlahnilai(parameter-1);

    }

    private static int hitungFaktorial(int parameter){
        System.out.println("parameter = " + parameter);

        if(parameter == 1)
        {
            return parameter;
        }
        return parameter * hitungFaktorial(parameter-1);

    }


}
