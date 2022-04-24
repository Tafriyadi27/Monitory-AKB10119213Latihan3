package com.skullbreker.monitory;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.skullbreker.monitory.DoneActivity.ID_EXTRA_MSG_EXIT;
// Tanggal Pengerjaan   : 23-April-2022
// Deskripsi Pengerjaan : 23-April-2022
//                       - Mengerjakan Layout activity_main(Welcome)
//                       - Mengerjakan Layout activity_login_code
//                       - Mengerjakan Layout activity_biodata
//                       - Mengerjakan Layout activity_done
//                       - Mengerjakan Layout activity_warning_dialog
//                        24-April-2022
//                       - Membuat Class MainActivity
//                       - Memasangkan logika pada Button "Mulai" agar dapat pindah class dari MainActivity.java ke class LoginCodeActivity.java
//                       - Membuat Class LoginCodeActivity
//                       - Memasangkan logika pada Button "Masuk" agar dapat pindah class dari LoginCodeActivity.java ke class BiodataActivity.java
//                       - Membuat Class BiodataActivity
//                       - Memasangkan logika pada Button "Selanjutnya" agar dapat pindah class dari BiodataActivity.java ke class DoneActivity.java
//                       - Membuat Class DoneActivity
//                       - Memasangkan logika pada Button "Oke" agar dapat keluar dari class DoneActivity.java
// Nama                 : Tri Tafriyadi
// NIM                  : 10119213
// Kelas                : IF-6
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        if (getIntent().getBooleanExtra(ID_EXTRA_MSG_EXIT, false)) {
            finish();
        }
    }
    @OnClick(R.id.btnWalkthroughStart)
    void mulai() {
        Intent intent = new Intent(this, LoginCodeActivity.class);
        startActivity(intent);
    }
}