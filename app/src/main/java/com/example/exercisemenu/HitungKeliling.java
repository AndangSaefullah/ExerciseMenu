package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HitungKeliling extends AppCompatActivity {
    TextView txtHasil;
    EditText txtPanjang, txtLebar;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_keliling);

        txtHasil = (TextView)findViewById(R.id.txtHasil);
        txtPanjang = (EditText) findViewById(R.id.txtPanjang);
        txtLebar = (EditText) findViewById(R.id.txtLebar);
        btnHitung = (Button) findViewById(R.id.btnHitungLuas);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p,l,h;
                p = Integer.parseInt(txtPanjang.getText().toString());
                l = Integer.parseInt(txtLebar.getText().toString());
                h = p+l+p+l;
                txtHasil.setText("Keliling : " + h);
            }
        });
    }
}

