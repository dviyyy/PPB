package com.vv.bidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void fragmentSegitiga(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Segitiga()).commit();
    }

    public void fragmentLingkaran(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Lingkaran()).commit();
    }

    public void fragmentPersegi(View view) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new Persegi()).commit();
    }
}