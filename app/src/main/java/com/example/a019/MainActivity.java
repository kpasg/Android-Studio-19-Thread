package com.example.a019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView)findViewById(R.id.msg123);
        textView.setText("Got Message");
        Handler handler = new Handler();
        handler.postDelayed(runTimer123, 2000);
    }
    private final Runnable runTimer123 = new Runnable() {
        @Override
        public void run() {
            Message msg = new Message();
            msg.obj = "Got it";
            Handler handler = new Handler();
            TextView textView = (TextView)findViewById(R.id.msg123);
            handler.sendMessage(msg);
            textView.setText("Got it");
        }
    };
}