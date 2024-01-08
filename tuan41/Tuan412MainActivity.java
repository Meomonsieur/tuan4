package com.example.scapplication.tuan41;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.scapplication.R;

public class Tuan412MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvKq;
    Context context=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan412_main);
        VolleyFn volleyFn=new VolleyFn();
        tvKq = findViewById(R.id.tuan412TvKq);
        btnGetData=findViewById(R.id.tuan412Btn);
        btnGetData.setOnClickListener(new View.OnClickListener()){
            public void onClick(View v)
            VolleyFn.getJsonArrayOfObject(context,tvKq)
        }
    }
}