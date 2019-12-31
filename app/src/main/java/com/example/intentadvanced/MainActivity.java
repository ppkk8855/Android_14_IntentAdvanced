package com.example.intentadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_phone;
    private Button btn_map;
    private Button btn_web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_phone=findViewById(R.id.btn_phone);
        btn_map=findViewById(R.id.btn_map);
        btn_web=findViewById(R.id.btn_web);

        btn_phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("tel:0912345678");
                Intent Call = new Intent(Intent.ACTION_DIAL, uri);
                startActivity(Call);
            }
        });

        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strURL = "https://maps.google.com/maps?f=d";

                Intent intent_map= new Intent();
                intent_map.setAction(android.content.Intent.ACTION_VIEW);
                intent_map.setData
                        (
                                Uri.parse(strURL )
                        );
                startActivity(intent_map);
            }
        });

        btn_web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.com./"));
                startActivity(intent);
            }
        });



    }
}
