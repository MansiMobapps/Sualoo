package com.sualoodriver.activities;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import com.sualoodriver.R;
import com.sualoodriver.fragments.Login_Details_Driver_Fragment;
import com.sualoodriver.fragments.Login_Details_Fragment;
import com.sualoodriver.fragments.PaymentInfo_Fragment;
import com.sualoodriver.fragments.PersonalInfo_Driver_Fragment;
import com.sualoodriver.fragments.PersonalInfo_Fragment;
import com.sualoodriver.fragments.Verification_Driver_Fragment;

public class Individual_Registration_Activity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner_enter_country;
    TextView txt_personal_info,login_details,payment_info,txt_personal_info_driver,login_details_driver,verification_driver;
    RadioButton rb_business_reg,rb_individuals_reg,rb_driver_reg;
    LinearLayout reg_individual,reg_business,reg_driver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual__registration);

        spinner_enter_country = findViewById(R.id.spinner_enter_country);
        txt_personal_info = findViewById(R.id.txt_personal_info);
        txt_personal_info.setOnClickListener(this);
        login_details = findViewById(R.id.login_details);
        login_details.setOnClickListener(this);
        payment_info = findViewById(R.id.payment_info);
        payment_info.setOnClickListener(this);
        reg_individual = findViewById(R.id.reg_individual);
        reg_business = findViewById(R.id.reg_business);
        reg_driver = findViewById(R.id.reg_driver);
        rb_business_reg = findViewById(R.id.rb_business_reg);
        rb_individuals_reg = findViewById(R.id.rb_individuals_reg);
        rb_driver_reg = findViewById(R.id.rb_driver_reg);
        txt_personal_info_driver = findViewById(R.id.txt_personal_info_driver);
        txt_personal_info_driver.setOnClickListener(this);
        login_details_driver = findViewById(R.id.login_details_driver);
        login_details_driver.setOnClickListener(this);
        verification_driver = findViewById(R.id.verification_driver);
        verification_driver.setOnClickListener(this);



        Fragment fragment = new PersonalInfo_Fragment();
        addFragment(fragment,"PersonalInfo_Fragment");


//        rb_business_reg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                reg_individual.setVisibility(View.GONE);
//                reg_business.setVisibility(View.VISIBLE);
//
//                Fragment fragment = new PersonalInfo_Fragment();
//                addFragment(fragment,"PersonalInfo_Fragment");
//            }
//        });
//
//        rb_individuals_reg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                reg_individual.setVisibility(View.VISIBLE);
//                reg_business.setVisibility(View.GONE);
//
//
//            }
//        });

        rb_business_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reg_individual.setVisibility(View.GONE);
                reg_business.setVisibility(View.VISIBLE);
                reg_driver.setVisibility(View.GONE);
            }
        });

        rb_individuals_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reg_individual.setVisibility(View.VISIBLE);
                reg_business.setVisibility(View.GONE);
                reg_driver.setVisibility(View.GONE);
            }
        });

        rb_driver_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reg_individual.setVisibility(View.GONE);
                reg_business.setVisibility(View.GONE);
                reg_driver.setVisibility(View.VISIBLE);


            }
        });

    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch (v.getId())
        {
            case R.id.txt_personal_info:
                fragment = new PersonalInfo_Fragment();
                replaceFragment(fragment,"PersonalInfo_Fragment");
                break;

            case R.id.login_details:
                fragment = new Login_Details_Fragment();
                replaceFragment(fragment,"Login_Details_Fragment");
                break;

            case R.id.payment_info:
                fragment = new PaymentInfo_Fragment();
                replaceFragment(fragment,"PaymentInfo_Fragment");
                break;


            case R.id.txt_personal_info_driver:
                fragment = new PersonalInfo_Driver_Fragment();
                replaceFragmentDriver(fragment,"PersonalInfo_Driver_Fragment");
                break;


            case R.id.login_details_driver:
                fragment = new Login_Details_Driver_Fragment();
                replaceFragmentDriver(fragment,"Login_Details_Driver_Fragment");
                break;

            case R.id.verification_driver:
                fragment = new Verification_Driver_Fragment();
                replaceFragmentDriver(fragment,"Verification_Driver_Fragment");
                break;

        }
    }

    public void replaceFragment(Fragment allFragments, String tag) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_business, allFragments,tag);
        transaction.commit();
    }

    public void addFragment(Fragment addFragments, String tag){
        FragmentTransaction add_transaction = getFragmentManager().beginTransaction();
        add_transaction.add(R.id.frame_business,addFragments,tag);
        add_transaction.commit();
    }


    public void replaceFragmentDriver(Fragment allFragments, String tag) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_driver, allFragments,tag);
        transaction.commit();
    }

    public void addFragmentDriver(Fragment addFragments, String tag){
        FragmentTransaction add_transaction = getFragmentManager().beginTransaction();
        add_transaction.add(R.id.frame_driver,addFragments,tag);
        add_transaction.commit();
    }
}
