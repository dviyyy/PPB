package com.vv.bidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Segitiga extends Fragment {
    private EditText txt_alas,txt_tinggi;
    private Button btn_hasil;
    private TextView hasil;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_segitiga, container, false);

        txt_alas = v.findViewById(R.id.txt_alas);
        txt_tinggi = v.findViewById(R.id.txt_tinggi);
        btn_hasil = v.findViewById(R.id.btn_hasil);
        hasil = v.findViewById(R.id.hasil);

        btn_hasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = txt_alas.getText().toString();
                String n2 = txt_tinggi.getText().toString();

                if(n1.isEmpty()) {
                    txt_alas.setError("Data tidak boleh kosong");
                    txt_tinggi.requestFocus();
                } else if(n2.isEmpty()){
                    txt_alas.setError("Data tidak boleh kosong");
                    txt_tinggi.requestFocus();
                } else {
                    Double alas = Double.parseDouble(n1);
                    Double tinggi = Double.parseDouble(n2);

                    Double luas = alas * tinggi * 0.5;
                    hasil.setText(String.valueOf(luas));
                    Double sisimiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
                    Double keliling = sisimiring * 3;
                    hasil.setText(String.valueOf(keliling));
                }
            }
        });

        return v;
    }
}