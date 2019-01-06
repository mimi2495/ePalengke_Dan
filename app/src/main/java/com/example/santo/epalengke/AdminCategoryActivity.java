package com.example.santo.epalengke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity
{
    private Button LgoutBtn;
    private ImageView pork, beef, poultry;
    private ImageView seafoods, fruits, rice;
    private ImageView condiments, beverages, vegetables;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LgoutBtn = (Button) findViewById(R.id.button2);

        pork = (ImageView) findViewById(R.id.pork);
        beef = (ImageView) findViewById(R.id.beef);
        poultry = (ImageView) findViewById(R.id.poultry);

        seafoods = (ImageView) findViewById(R.id.seafoods);
        fruits = (ImageView) findViewById(R.id.fruits);
        rice = (ImageView) findViewById(R.id.rice);

        condiments = (ImageView) findViewById(R.id.condiments);
        beverages = (ImageView) findViewById(R.id.beverages);
        vegetables = (ImageView) findViewById(R.id.vegetables);

        LgoutBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        pork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pork");
                startActivity(intent);
            }
        });

        beef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Beef");
                startActivity(intent);
            }
        });

        poultry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Poultry");
                startActivity(intent);
            }
        });

        seafoods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Seafoods");
                startActivity(intent);
            }
        });

        fruits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Fruits");
                startActivity(intent);
            }
        });

        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Rice");
                startActivity(intent);
            }
        });

        condiments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Condiments");
                startActivity(intent);
            }
        });

        beverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "beverages");
                startActivity(intent);
            }
        });

        vegetables.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Vegetables");
                startActivity(intent);
            }
        });


    }
}
