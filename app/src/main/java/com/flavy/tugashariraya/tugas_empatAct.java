package com.flavy.tugashariraya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tugas_empatAct extends AppCompatActivity {

    EditText et_array, et_batas;
    Button btn_jumlah;
    TextView jumlah;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_empat);

        et_array = findViewById(R.id.et_angka_array);
        et_batas = findViewById(R.id.et_angka_batas);
        btn_jumlah = findViewById(R.id.btn_jumlah);
        jumlah = findViewById(R.id.jumlah);


        btn_jumlah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] arrays = et_array.getText().toString().split(",");
                Integer[] arr = new Integer[arrays.length];

                int batas = Integer.parseInt(et_batas.getText().toString());

                jumlah.setText("Jumlah angka ganjil dari data array diatas adalah " + count_odds(arr, batas ));


            }
        });


    }

    private int count_odds(Integer[] data, int Size)///Fungsi yang dimaksud
    {
        int hitung = 0 ;
        if(Size==1)
        {
            if(data[Size-1]%2!=0)
            {
                hitung++;
            }
            int n=hitung;
            hitung=0;
            return n;
        }
        else
        {
            if(data[Size-1]%2!=0)
            {
                hitung++;
            }
            return count_odds(data,Size-1);
        }
    }

}

