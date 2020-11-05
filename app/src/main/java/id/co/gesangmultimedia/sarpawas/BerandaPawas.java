package id.co.gesangmultimedia.sarpawas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class BerandaPawas extends AppCompatActivity {
    private ImageButton ibJasaMarga;
    private ImageButton ibDishub;
    private ImageButton ibDpu;
    private ImageButton ibDinkes;
    private ImageButton ibDpbd;
    private ImageButton ibPmi;
    private ImageButton ibFatimah;
    private ImageButton ibRsud;
    private ImageButton ibRspc;
    private ImageButton ibDamkar;
    private ImageButton ibSatpolpp;
    private ImageButton ibBasarnas;
    private ImageButton ibSantamaria;
    String strNotelp = " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda_pawas);

        ImageButton ibJasaRaharja = findViewById(R.id.btnJasHar);
        ibJasaRaharja.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                showTelponJashar();
            }
        });
        ImageButton ibDishub = findViewById(R.id.btnDishub);
        ibDishub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponDishub();
            }
        });
        ImageButton ibDpu = findViewById(R.id.btnDpu);
        ibDpu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponDpu();
            }
        });
        ImageButton ibDinkes = findViewById(R.id.btnDinkes);
        ibDinkes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponDinkes();
            }
        });
        ImageButton ibBpbd = findViewById(R.id.btnDpbd);
        ibBpbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponBpbd();
            }
        });
        ImageButton ibPmi = findViewById(R.id.btnPmi);
        ibPmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponPmi();
            }
        });
        ImageButton ibFatimah = findViewById(R.id.btnFatimah);
        ibFatimah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponFatimah();
            }
        });
        ImageButton ibRsu = findViewById(R.id.btnRsu);
        ibRsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponRsud();
            }
        });
        ImageButton ibRspc = findViewById(R.id.btnRspc);
        ibRspc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponRspc();
            }
        });
        ImageButton ibDamkar = findViewById(R.id.btnDamkar);
        ibDamkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponDamkar();
            }
        });
        ImageButton ibSatpolpp = findViewById(R.id.btnSatpolpp);
        ibSatpolpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponSatpolpp();
            }
        });
        ImageButton ibBasarnas = findViewById(R.id.btnBasarnas);
        ibBasarnas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponBasarnas();
            }
        });
        ImageButton ibSantaMaria = findViewById(R.id.btnSantaMaria);
        ibSantaMaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTelponSantaMaria();
            }
        });
    }
    private void showTelponJashar(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 0);

        popupmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(popupmenu.getId()==R.id.btnCallDinas){
                    Intent calldinas = new Intent(BerandaPawas.this, TelponActivity.class);
                    String strNotelp = "0282633961";
                    calldinas.putExtra("notelp", strNotelp);
                    startActivity(calldinas);
                }
                else if(popupmenu.getId()==R.id.btnCallKadin){
                    String strNoTelp = "";
                    Intent callkadin = new Intent(BerandaPawas.this, TelponActivity.class);
                    callkadin.putExtra("notelp", strNoTelp);
                    startActivity(callkadin);
                }
                popupWindow.dismiss();
            }
        });
    }
    private void showTelponDishub(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        @SuppressLint("InflateParams") View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponDpu(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponDinkes(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponBpbd(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponPmi(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponFatimah(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponRsud(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponRspc(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponDamkar(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponSatpolpp(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponBasarnas(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
    private void showTelponSantaMaria(){
        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupmenu = inflater.inflate(R.layout.menutelpon, null);

        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupmenu, width, height, true);

        popupWindow.showAtLocation(popupmenu, Gravity.CENTER, 0, 500);

        popupmenu.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }


}