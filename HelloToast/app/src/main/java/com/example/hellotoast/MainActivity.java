package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView showCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // RIGA MANCANTE FONDAMENTALE: Collega il layout XML all'Activity
        setContentView(R.layout.activity_main); // Bug brutto
        showCount = findViewById(R.id.textShowCount);

    }

    public void countUp(View view) {
        count++;
        if(showCount!=null) {
            showCount.setText(Integer.toString(count));
        }
    }
    public void countDown(View view) {
        count--;
        if(showCount!=null) {
            showCount.setText(Integer.toString(count));
        }
    }
}