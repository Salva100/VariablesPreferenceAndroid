package com.example.salvador.variablespreference;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtRes=(TextView) findViewById(R.id.txtTexto);
        SharedPreferences sp = getSharedPreferences("prefe", Activity.MODE_PRIVATE);

        String myIntValue = sp.getString("var","h");
        if (myIntValue!=""){
            txtRes.setText("Ya hay algo "+myIntValue);

        }
        findViewById(R.id.btn_g).setOnClickListener(new Accion());
    }
    class Accion implements View.OnClickListener {
        public void onClick(View v) {
            SharedPreferences sp = getSharedPreferences("prefe", Activity.MODE_PRIVATE);
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("var", "como estas luna");
            editor.commit();
        }
    }
}
