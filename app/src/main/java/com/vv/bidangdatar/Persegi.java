package com.vv.bidangdatar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Persegi extends Fragment {
    private Button btn_hasil;
    private EditText txt_panjang,txt_lebar;
    private TextView hasil;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_persegi, container, false);
        btn_hasil = v.findViewById(R.id.btn_hasil);
        txt_panjang = v.findViewById(R.id.txt_panjang);
        txt_lebar = v.findViewById(R.id.txt_lebar);
        hasil = v.findViewById(R.id.hasil);

        btn_hasil.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = txt_panjang.getText().toString();
                String n2 = txt_lebar.getText().toString();

                if(n1.isEmpty()) {
                    txt_panjang.setError("Data tidak boleh kosong");
                    txt_panjang.requestFocus();
                } else if(n2.isEmpty()){
                    txt_lebar.setError("Data tidak boleh kosong");
                    txt_lebar.requestFocus();
                } else {
                    Integer panjang = Integer.parseInt(n1);
                    Integer lebar = Integer.parseInt(n2);

                    Integer luas = panjang * lebar;
                    hasil.setText(String.valueOf(luas));
                    Integer keliling = 2 * panjang + 2 * lebar;
                    hasil.setText(String.valueOf(keliling));
                }
            }
        }));


        return v;
    }
}