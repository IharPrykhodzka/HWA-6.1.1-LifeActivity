package com.example.a611lifeactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String LOG = "Lifecycle";
    private static final String MY_SAVE = "save_main_activity";
    private String text = "";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);


        Log.d(LOG, "onCreate");
        textView.append("\n" + "onCreate");
        savedInstanceState = null;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "onStart");
        textView.append("\n" + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG, "onResume");
        textView.append("\n" + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG, "onPause");
        textView.append("\n" + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG, "onStop");
        textView.append("\n" + "onStop");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(LOG, "onPostResume");
        textView.append("\n" + "onPostResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy");
        textView.append("\n" + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG, "onRestart");
        textView.append("\n" + "onRestart");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(LOG, "onPostCreate");
        textView.append("\n" + "onPostCreate");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(LOG, "onKeyDown");
        textView.append("\n" + "onKeyDown");
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(LOG, "onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(LOG, "onBackPressed");
        textView.append("\n" + "onBackPressed");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(LOG, "onSaveInstanceState");
        textView.append("\n" + "onSaveInstanceState");
        text = textView.getText().toString();
        outState.putString(MY_SAVE, text);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(LOG, "onRestoreInstanceState");
        String takeText = savedInstanceState.getString(MY_SAVE);
        textView.append("\n" + "onRestoreInstanceState" + "\n" + takeText);
    }
}
