package com.example.applendario;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int countSim = 0;
    private int countNao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSim = findViewById(R.id.button_sim);
        Button buttonNao = findViewById(R.id.button_nao);
        TextView counterSim = findViewById(R.id.counter_sim);
        TextView counterNao = findViewById(R.id.counter_nao);

        // Ação para o botão "Sim"
        buttonSim.setOnClickListener(v -> {
            countSim++;
            counterSim.setText("Sim: " + countSim);
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra("COUNTER", countSim);
            startActivity(intent);
        });

        // Ação para o botão "Não"
        buttonNao.setOnClickListener(v -> {
            countNao++;
            counterNao.setText("Não: " + countNao);
            Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
            intent.putExtra("COUNTER", countNao);
            startActivity(intent);
        });
    }
}

