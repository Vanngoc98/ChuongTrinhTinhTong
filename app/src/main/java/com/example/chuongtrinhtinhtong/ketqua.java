package com.example.chuongtrinhtinhtong;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ketqua extends AppCompatActivity {
    TextView TKQ;
    Button BTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kq);
        BTV=(Button) findViewById(R.id.BTV);
        TKQ=(TextView) findViewById(R.id.TKQ);
        Intent callerIntent=getIntent();
        Bundle packageFromCaller= callerIntent.getBundleExtra("MyPackage");
        int a=packageFromCaller.getInt("Nhập Số N1");
        int b=packageFromCaller.getInt("Nhập Số N2");
        TinhTong(a, b);
        BTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void TinhTong(int a, int b) {
        int kq =a+b;
        TKQ.setText(String.valueOf(kq));
        }
    }

