package com.example.delta.psychomatrix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Psychomatrix extends AppCompatActivity {
    Spinner spinner;
    Spinner spinner2;
    Spinner spinner3;
    ArrayAdapter<CharSequence> adapter;
    ArrayAdapter<CharSequence> adapter2;
    ArrayAdapter<CharSequence> adapter3;
    TextView txtrezult;
    TextView txtVtoroe;
    TextView txttri;
    TextView txtfor;
    TextView txtAll;
    TextView txtOne;
    TextView txtTwo;
    TextView txtTri;
    TextView txtchet;
    TextView txtpat;
    TextView txtshest;
    TextView txtsem;
    TextView txtvosem;
    TextView txtdev;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btnOk;
        setContentView(R.layout.activity_psychomatrix);
        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);

        adapter = ArrayAdapter.createFromResource(this, R.array.select_day, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_1);

        adapter2 = ArrayAdapter.createFromResource(this, R.array.select_mounf, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_list_item_1);

        adapter3 = ArrayAdapter.createFromResource(this, R.array.select_age, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_list_item_1);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter2);
        spinner3.setAdapter(adapter3);
        txtrezult = (TextView) findViewById(R.id.txtrezult);
        txtVtoroe = (TextView) findViewById(R.id.txtVtoroe);
        txttri = (TextView) findViewById(R.id.txttri);
        txtfor = (TextView) findViewById(R.id.txtfor);
        txtAll = (TextView) findViewById(R.id.txtAll);
        txtOne = (TextView) findViewById(R.id.txtOne);
        txtTwo = (TextView) findViewById(R.id.txtTwo);
        txtTri = (TextView) findViewById(R.id.txtTri);
        txtchet = (TextView) findViewById(R.id.txtchet);
        txtpat = (TextView) findViewById(R.id.txtpat);
        txtshest = (TextView) findViewById(R.id.txtshest);
        txtsem = (TextView) findViewById(R.id.txtsem);
        txtvosem = (TextView) findViewById(R.id.txtvosem);
        txtdev = (TextView) findViewById(R.id.txtdev);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Чтнение символов и сложение их в страке
                String year = spinner3.getSelectedItem().toString();
                int result = 0;
                for (int i = 0; i < year.length(); i++) {
                    result += Integer.parseInt(String.valueOf(year.charAt(i)));
                }

                String mounf_day = spinner.getSelectedItem().toString();
                String day = spinner.getSelectedItem().toString();
                int result_day = 0;
                int w = 0;
                int t = w * 2;
                for (int i = 0; i < mounf_day.length(); i++) {
                    result_day += Integer.parseInt(String.valueOf(mounf_day.charAt(i)));
                    w = Integer.parseInt(String.valueOf(mounf_day.charAt(0)));

                }

                int a = Integer.valueOf(result_day);
                int b = Integer.valueOf(result);
                int c = a + b;
                //    txtrezult.setText("" + c);
                int yanvar = 1;
                int fevral = 2;
                int mart = 3;
                int aprel = 4;
                int may = 5;
                int iun = 6;
                int iul = 7;
                int avgust = 8;
                int september = 9;
                int october = 1 + 0;
                int novober = 1 + 1;
                int dekabr = 1 + 2;

                String mounf = spinner2.getSelectedItem().toString();
                if (mounf.equals("Январь")) {
                    int asd = c + yanvar;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));
                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);

                }

                if (mounf.equals("Февраль"))

                {
                    int asd = c + fevral;
                    int chisl = asd - (w * 2);2
                    txtrezult.setText(" " + asd);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }

                if (mounf.equals("Март"))

                {
                    int asd = c + mart;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }
                if (mounf.equals("Аперль"))

                {
                    int asd = c + aprel;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }
                if (mounf.equals("Май"))

                {
                    int asd = c + may;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }

                if (mounf.equals("Июнь"))

                {
                    int asd = c + iun;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }
                if (mounf.equals("Июль"))

                {
                    int asd = c + iul;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }
                if (mounf.equals("Август"))

                {
                    int asd = c + avgust;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }

                if (mounf.equals("Сентябрь"))

                {
                    int asd = c + september;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);

                }
                if (mounf.equals("Октябрь"))

                {

                    int asd = c + october;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }

                if (mounf.equals("Ноябрь"))

                {
                    int asd = c + novober;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }
                if (mounf.equals("Декабрь"))

                {
                    int asd = c + dekabr;
                    int chisl = asd - (w * 2);
                    String xxx = String.valueOf(asd).toString();
                    int q = 0;
                    for (int i = 0; i < xxx.length(); i++) {
                        q += Integer.parseInt(String.valueOf(xxx.charAt(i)));

                    }
                    String yyy = String.valueOf(chisl).toString();
                    int j = 0;
                    for (int i = 0; i < yyy.length(); i++) {
                        j += Integer.parseInt(String.valueOf(yyy.charAt(i)));

                    }
                    txttri.setText("" + chisl);
                    txtVtoroe.setText("" + q);
                    txtrezult.setText("" + asd);
                    txtfor.setText("" + j);
                    txtAll.setText(mounf_day + "." + "0" + yanvar + "." + year + " " + asd + "." + q + "." + chisl + "." + j);
                }


            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //   Toast.makeText(getBaseContext(), parent.getItemIdAtPosition(position) + " выбранно", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}



