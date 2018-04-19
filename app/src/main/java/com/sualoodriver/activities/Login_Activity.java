package com.sualoodriver.activities;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.sualoodriver.R;

public class Login_Activity extends AppCompatActivity {

    RadioGroup type_of_driver;
    RadioButton rb_individuals,rb_business,rb_driver;
    TextView txt_remember_me,txt_register;
    ImageView img_tgl_btn_off,img_tgl_btn_on;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        type_of_driver = findViewById(R.id.type_of_driver);
        rb_individuals = findViewById(R.id.rb_individuals);
        rb_business = findViewById(R.id.rb_business);
        rb_driver = findViewById(R.id.rb_driver);
        txt_remember_me = findViewById(R.id.txt_remember_me);
        img_tgl_btn_off = findViewById(R.id.img_tgl_btn_off);
        img_tgl_btn_on = findViewById(R.id.img_tgl_btn_on);
        txt_register = findViewById(R.id.txt_register);

        img_tgl_btn_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_tgl_btn_on.setVisibility(View.VISIBLE);
               // img_tgl_btn_off.setVisibility(View.GONE);

            }
        });

        img_tgl_btn_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img_tgl_btn_on.setVisibility(View.GONE);
                img_tgl_btn_off.setVisibility(View.VISIBLE);

            }
        });

        txt_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_Activity.this, Individual_Registration_Activity.class);
                startActivity(intent);
            }
        });

//        type_of_driver.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                if (rb_individuals.isChecked()) {
//                    rb_individuals.setTextColor(Color.GREEN);
//                    rb_business.setTextColor(Color.GRAY);
//                    rb_driver.setTextColor(Color.GRAY);
//                }
//                if (rb_business.isChecked()){
//                    rb_individuals.setTextColor(Color.GRAY);
//                    rb_business.setTextColor(Color.BLUE);
//                    rb_driver.setTextColor(Color.GRAY);
//                }
//                if (rb_driver.isChecked()){
//                    rb_individuals.setTextColor(Color.GRAY);
//                    rb_business.setTextColor(Color.GRAY);
//                    rb_driver.setTextColor(Color.BLUE);
//                }
//            }
//        });
    }
}
