package id.co.gesangmultimedia.sarpawas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void seting(View view) {
        Intent seting = new Intent(MainActivity.this, BerandaSeting.class);
        startActivity(seting);
    }

    public void pawas(View view) {
        Intent pawas = new Intent(MainActivity.this, BerandaPawasb.class);
        startActivity(pawas);
    }
}