package com.example.santo.epalengke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    private TextView TxtAdobo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        TxtAdobo = (TextView) findViewById(R.id.adobo);

        TxtAdobo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecipeActivity.this, AdoboActivity.class);
                startActivity(intent);
            }
        });

    }
}
