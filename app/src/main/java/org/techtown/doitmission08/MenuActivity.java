package org.techtown.doitmission08;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_CUSTOMER = 201;
    public static final int REQUEST_CODE_REVENUE = 202;
    public static final int REQUEST_CODE_PRODUCT = 203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Intent receivedIntent = getIntent();

        Button customerButton = findViewById(R.id.customerButton);
        customerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerActivity.class);

                startActivityForResult(intent, REQUEST_CODE_CUSTOMER);
            }
        });

        Button revenueButton = findViewById(R.id.revenueButton);
        revenueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerActivity.class);

                startActivityForResult(intent, REQUEST_CODE_REVENUE);
            }
        });

        Button productButton = findViewById(R.id.productButton);
        productButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CustomerActivity.class);

                startActivityForResult(intent, REQUEST_CODE_PRODUCT);
            }
        });
    }
}