package com.gdeaditya.eventku;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tanggal, judul, lokasi, kategori;
    ImageView gambar;
    SharedPreferences pref;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = getSharedPreferences("data", MODE_PRIVATE);
        editor = pref.edit();

        gambar = (ImageView) findViewById(R.id.imgGambar);
        tanggal = (TextView) findViewById(R.id.txtanggal);
        judul = (TextView) findViewById(R.id.txjudul);
        lokasi = (TextView) findViewById(R.id.txokasi);
        kategori = (TextView) findViewById(R.id.txkategori);

    }

    public void ubah(View view) {
//        gambar.setImageResource(R.drawable.bg_event3);
//        tanggal.setText(getResources().getString(R.string.tanggal_2));
//        judul.setText(getResources().getString(R.string.judul_2));
//        lokasi.setText(getResources().getString(R.string.lokasi_2));
//        kategori.setText(getResources().getString(R.string.kategori_2));
        merubahtampilan(R.drawable.bg_event,
                getResources().getString(R.string.tanggal_1),
                getResources().getString(R.string.judul_1),
                getResources().getString(R.string.lokasi_1),
                getResources().getString(R.string.kategori_1));
    }

    public void ubah2(View view) {
        merubahtampilan(R.drawable.bg_event2,
                getResources().getString(R.string.tanggal_2),
                getResources().getString(R.string.judul_2),
                getResources().getString(R.string.lokasi_2),
                getResources().getString(R.string.kategori_2));
    }

    public void ubah3(View view) {
        merubahtampilan(R.drawable.bg_event3,
                getResources().getString(R.string.tanggal_3),
                getResources().getString(R.string.judul_3),
                getResources().getString(R.string.lokasi_3),
                getResources().getString(R.string.kategori_3));

    }

    private void merubahtampilan(int gmbr, String tgl, String jdl, String lok, String kat) {
        gambar.setImageResource(gmbr);
        tanggal.setText(tgl);
        judul.setText(jdl);
        lokasi.setText(lok);
        kategori.setText(kat);


    }

    public void Logout(View view){
        editor.clear();
        editor.commit();
        Intent i = new Intent(this,LoginActivity.class);
        startActivity(i);
        finish();

    }
}
