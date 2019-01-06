package com.example.santo.epalengke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdoboActivity extends AppCompatActivity {
    private Button DoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adobo);

        DoneBtn = (Button) findViewById(R.id.done_btn);

        DoneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdoboActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
