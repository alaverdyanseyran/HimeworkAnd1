package com.example.sey.intres;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv= findViewById(R.id.toGet);
        String ss=getIntent().getStringExtra("SECOND");
        tv.setText(ss);


    }

    @Override
    public void onBackPressed() {
        Intent returnIntent = new Intent();
        returnIntent.putExtra("result",tv.getText().toString());
        setResult(Activity.RESULT_OK,returnIntent);
        Toast.makeText(this, tv.getText().toString(), Toast.LENGTH_LONG).show();
        finish();

    }
}
