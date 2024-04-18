package com.example.screens;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
public class TextViewActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        String greeting = "Good dag";
        Bundle extras = getIntent().getExtras();

        if(extras != null) {
            String temp = extras.getString("greeting");
            if (temp != null) {
                greeting = temp;
            }
        }

        TextView textView = findViewById(R.id.my_textView);
        textView.setText(greeting);

    }
}