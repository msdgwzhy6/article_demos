package com.article.demos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * @author a
 */
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void clickConfig(View view) {

        Toast.makeText(view.getContext(), BuildConfig.isRelease + "", Toast.LENGTH_SHORT).show();



    }
}
