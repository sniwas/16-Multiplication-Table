package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class multiplytablescreen extends AppCompatActivity {
    int multiplicand,multiplier;
    TextView textView;
    int value=0,i;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.multiplytablescreen);
        textView=findViewById(R.id.textView2);
        Intent intent2=getIntent();
        multiplicand=intent2.getIntExtra("M1",0);
        multiplier=intent2.getIntExtra("M2",0);
       for(i=1;i<=multiplicand;i++){
            value=i*multiplier;
            String result=i+" × "+multiplier+" = "+value+"\n";
            textView.append(result);
        }
    }
}