package com.example.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText m1,m2;
    Button b;
    int c1,c2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1=findViewById(R.id.Multiplicand);
        m2=findViewById(R.id.Multiplier);
        b=findViewById(R.id.btdisplaytable);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c1=0;
                c2=0;
                String v1=m1.getText().toString();
                String v2=m2.getText().toString();
                if(TextUtils.isEmpty(v1)){
                    m1.setError("Enter Multiplicand Value");
                    c1=1;
                }
                if (TextUtils.isEmpty(v2)){
                    m2.setError("Enter Multiplier Value");
                    c2=1;
                }
                if(c1==0&&c2==0){
                    Intent intent=new Intent(getApplicationContext(), multiplytablescreen.class);
                    c1= Integer.parseInt(v1);
                    c2= Integer.parseInt(v2);
                    intent.putExtra("M1",c1);
                    intent.putExtra("M2",c2);
                    startActivity(intent);
                }
            }
        });
    }
}