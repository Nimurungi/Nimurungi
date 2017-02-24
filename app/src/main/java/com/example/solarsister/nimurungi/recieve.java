package com.example.solarsister.nimurungi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class recieve extends AppCompatActivity {
Button b2;
TextView t;
    String rev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);
        b2=(Button)findViewById(R.id.button2);
        t=(TextView)findViewById(R.id.textView2);
        rev=getIntent().getExtras().getString("value");
        t.setText(rev);
    }
    public void clos(View view){
        Intent n=new Intent(this,details.class);
        startActivity(n);
        finish();

    }
}
