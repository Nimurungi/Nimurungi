package com.example.solarsister.nimurungi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class details extends AppCompatActivity {
Button btn;
EditText ed;
String text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        btn=(Button)findViewById(R.id.button);
        ed=(EditText)findViewById(R.id.editText);
    }
    public void sen(View view){
        Intent n=new Intent(this,recieve.class);
        text=ed.getText().toString();
        n.putExtra("value",text);
        startActivity(n);
        finish();
    }
}
