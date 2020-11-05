package id.co.gesangmultimedia.sarpawas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BerandaSeting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_seting);
    }

    public void user(View view) {
        Intent pengguna = new Intent(BerandaSeting.this, AdminLoginActivity.class);
        startActivity(pengguna);
    }
}