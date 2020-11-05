package id.co.gesangmultimedia.sarpawas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login_Fake extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__fake);
        EditText email = findViewById(R.id.tv_email);
        EditText pass = findViewById(R.id.tv_pass);
        Button masuk = findViewById(R.id.btn_masuk);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(email.equals("admin@cilacap") && (pass.equals("admin"))){
                    Intent masuk = new Intent(Login_Fake.this, BerandaPawasb.class);
                }
                else {
                    Toast.makeText(Login_Fake.this, "User atau password salah!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}