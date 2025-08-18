package com.asuna.ai;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.Gravity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Simple UI without XML layout
        LinearLayout layout = new LinearLayout(this);
        layout.setGravity(Gravity.CENTER);
        layout.setOrientation(LinearLayout.VERTICAL);

        TextView textView = new TextView(this);
        textView.setText("Hello, I am Asuna!");
        textView.setTextSize(24);

        layout.addView(textView);
        setContentView(layout);
    }
          }
