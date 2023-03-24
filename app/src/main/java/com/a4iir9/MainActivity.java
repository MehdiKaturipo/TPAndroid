package com.a4iir9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAGNAME = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAGNAME,"on est dans onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAGNAME,"on est dans onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAGNAME,"on est dans onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAGNAME,"on est dans onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAGNAME,"on est dans onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAGNAME,"on est dans onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAGNAME,"on est dans onRestart");
    }

    public void clickHander(View view) {
        Toast.makeText(this, "Boutton clické", Toast.LENGTH_SHORT).show();
    }
}