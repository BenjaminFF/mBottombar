package com.benjamin.mbottombar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.benjamin.library.testUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String hello= testUtil.getText();

        Toast.makeText(this,hello,Toast.LENGTH_LONG).show();
    }
}
