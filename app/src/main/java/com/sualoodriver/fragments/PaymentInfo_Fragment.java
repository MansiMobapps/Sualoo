package com.sualoodriver.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import com.sualoodriver.R;


public class PaymentInfo_Fragment extends Fragment {

    LinearLayout ll_credit_card_number,ll_paypal,ll_mpesa,ll_sualoo_cd_card;
    RadioButton rb_creditcard_reg,rb_paypal_reg,rb_mpesa_reg,rb_sulaoocredit_reg;
    TextView txt_register_me_paymentfrag;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_payment_info, container, false);

        ll_credit_card_number = view.findViewById(R.id.ll_credit_card_number);
        ll_paypal = view.findViewById(R.id.ll_paypal);
        ll_mpesa = view.findViewById(R.id.ll_mpesa);
        ll_sualoo_cd_card = view.findViewById(R.id.ll_sualoo_cd_card);
        rb_creditcard_reg = view.findViewById(R.id.rb_creditcard_reg);
        rb_paypal_reg = view.findViewById(R.id.rb_paypal_reg);
        rb_mpesa_reg = view.findViewById(R.id.rb_mpesa_reg);
        rb_sulaoocredit_reg = view.findViewById(R.id.rb_sulaoocredit_reg);
        txt_register_me_paymentfrag = view.findViewById(R.id.txt_register_me_paymentfrag);

        rb_creditcard_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_credit_card_number.setVisibility(View.VISIBLE);
                ll_paypal.setVisibility(View.GONE);
                ll_mpesa.setVisibility(View.GONE);
                ll_sualoo_cd_card.setVisibility(View.GONE);
            }
        });

        rb_paypal_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_credit_card_number.setVisibility(View.GONE);
                ll_paypal.setVisibility(View.VISIBLE);
                ll_mpesa.setVisibility(View.GONE);
                ll_sualoo_cd_card.setVisibility(View.GONE);
            }
        });

        rb_mpesa_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_credit_card_number.setVisibility(View.GONE);
                ll_paypal.setVisibility(View.GONE);
                ll_mpesa.setVisibility(View.VISIBLE);
                ll_sualoo_cd_card.setVisibility(View.GONE);
            }
        });

        rb_sulaoocredit_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ll_credit_card_number.setVisibility(View.GONE);
                ll_paypal.setVisibility(View.GONE);
                ll_mpesa.setVisibility(View.GONE);
                ll_sualoo_cd_card.setVisibility(View.VISIBLE);
            }
        });

        return view;
    }
}
