package com.example.applendario;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageView imageView = findViewById(R.id.imageView);
        TextView textView = findViewById(R.id.textView);

        imageView.setImageResource(R.drawable.mentira);
        textView.setText("Mentira");

        Button buttonVoltar = findViewById(R.id.button_voltar);

        int countNao = getIntent().getIntExtra("COUNTER_NAO", 0);

        buttonVoltar.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.putExtra("COUNTER_NAO", countNao);
            setResult(RESULT_OK, intent);
            finish();
        });
    }
}
