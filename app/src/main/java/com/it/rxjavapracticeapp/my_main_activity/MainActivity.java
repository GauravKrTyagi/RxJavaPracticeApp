package com.it.rxjavapracticeapp.my_main_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.it.rxjavapracticeapp.R;
import com.it.rxjavapracticeapp.ui.operators.OperatorsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startOperatorsActivity(View view) {
        startActivity(new Intent(MainActivity.this, OperatorsActivity.class));
    }

    public void startNetworkingActivity(View view) {
        //startActivity(new Intent(MainActivity.this, NetworkingActivity.class));
    }


    public void startPaginationActivity(View view) {
        //startActivity(new Intent(MainActivity.this, PaginationActivity.class));
    }

    public void startComposeOperator(View view) {
        //startActivity(new Intent(MainActivity.this, ComposeOperatorExampleActivity.class));
    }

    public void startSearchActivity(View view) {
        //startActivity(new Intent(MainActivity.this, SearchActivity.class));
    }

}
