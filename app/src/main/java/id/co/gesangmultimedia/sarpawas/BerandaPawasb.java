package id.co.gesangmultimedia.sarpawas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import androidx.appcompat.app.AppCompatActivity;

public class BerandaPawasb extends AppCompatActivity {
    String strNotelp = "";
    String strNoHp = "";
    String strDinas = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_pawasb);
    }

    public void jashar(View view) {
        String strNoTelp = "+62281633961";
        String strNoHp = "";
        String strDinas = "Jasa Raharja";
        Intent pawas = new Intent(BerandaPawasb.this, DialerActivity.class);
        pawas.putExtra("nodinas", strNoTelp);
        pawas.putExtra("nohp", strNoHp);
        pawas.putExtra("dinas", strDinas);
        startActivity(pawas);
    }

    public void dishub(View view) {
        String strNoTelp = "+62282534725";
        String strNoHP = "6281327341063";
        String strDinas = "Dishub";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void dpu(View view) {
        String strNoTelp = "+62282545603";
        String strNoHP = "628122953435";
        String strDinas = "DPU";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void Dinkes(View view) {
        String strNoTelp = "+62282534079";
        String strNoHP = "628122953396";
        String strDinas = "Dinkes";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void Bpbd(View view) {
        String strNoTelp = "+62282533520";
        String strNoHP = "6281325846595";
        String strDinas = "Bpbd";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void pmi(View view) {
        String strNoTelp = "+62282531706";
        String strNoHP = "62816692469";
        String strDinas = "PMI";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void Fatimah(View view) {
        String strNoTelp = "+62282542396";
        String strNoHP = "6281327341063";
        String strDinas = "Fatimah";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void rspc(View view) {
        String strNoTelp = "+62282509973";
        String strNoHP = "6281327341063";
        String strDinas = "Rspc";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void rsud(View view) {
        String strNoTelp = "+62282533010";
        String strNoHP = "6281327341063";
        String strDinas = "Rsud";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void Damkar(View view) {
        String strNoTelp = "+62282537413";
        String strNoHP = "6281327341063";
        String strDinas = "Damkar";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void Satpolpp(View view) {
        String strNoTelp = "+62282537413";
        String strNoHP = "6281327341063";
        String strDinas = "Satpolpp";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void Basarnas(View view) {
        String strNoTelp = "+62282534725";
        String strNoHP = "6281327341063";
        String strDinas = "Basarnas";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
    public void SantaMaria(View view) {
        String strNoTelp = "+62282534859";
        String strNoHP = "6281327341063";
        String strDinas = "SantaMaria";
        Intent dishub = new Intent(BerandaPawasb.this, DialerActivity.class);
        dishub.putExtra("nodinas", strNoTelp);
        dishub.putExtra("nohp", strNoHP);
        dishub.putExtra("dinas", strDinas);
        startActivity(dishub);
    }
}