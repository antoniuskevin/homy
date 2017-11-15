package com.example.antonius.homy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CustomerMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_main);
    }

    public void onKatalog(View view){
        Intent register = new Intent(CustomerMain.this, KatalogActivity.class);
        startActivity(register);
    }

    public void onTransToko(View view){
        Intent register = new Intent(CustomerMain.this, KontrolPenyediaActivity.class);
        startActivity(register);
    }
}
