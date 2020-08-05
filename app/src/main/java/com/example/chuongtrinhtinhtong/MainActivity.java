package com.example.chuongtrinhtinhtong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {
    EditText SoA, SoB;
    Button BTT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SoA = (EditText) findViewById(R.id.SoA);
        SoB = (EditText) findViewById(R.id.SoB);
        BTT = (Button) findViewById(R.id.BTT);
        BTT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, ketqua.class);
                Bundle bundle = new Bundle();
                int a = Integer.parseInt(SoA.getText().toString());
                int b = Integer.parseInt(SoB.getText().toString());
                bundle.putInt("Nhập Số N1", a);
                bundle.putInt("Nhập Số N2", b);
                myIntent.putExtra("MyPackage", bundle);
                startActivity(myIntent);
            }
        });
    }
}