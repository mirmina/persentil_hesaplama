package com.example.gykdenemeprojesi;

import android.content.ClipData;
import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Spinner;

import androidx.appcompat.view.menu.MenuView;

import org.w3c.dom.Text;


public class MainActivity extends Activity {
    Button bttn;
    EditText boy, kilo, bascevresi;
    Double boytext, kilotext, bastext;
    TextView text1, text2, text3;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Spinner ay;
    String aytext;
    private Object String;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boy = findViewById(R.id.boy);
        kilo = findViewById(R.id.kilo);
        bascevresi = findViewById(R.id.bascevresi);
        ay = findViewById(R.id.ay);

        text1 = findViewById(R.id.bastext);
        text2 = findViewById(R.id.boytext);
        text3 = findViewById(R.id.kilotext);

        radioGroup = findViewById(R.id.radiGroup);

        bttn = findViewById(R.id.bttn);
        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String b = kilo.getText().toString();
                String c = boy.getText().toString();
                String d = bascevresi.getText().toString();
                int cinsiyet = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(cinsiyet);

                if ( !b.isEmpty() && !c.isEmpty() && !d.isEmpty() && radioButton.isChecked()) {


                    kilotext = Double.parseDouble(b);
                    boytext = Double.parseDouble(c);
                    bastext = Double.parseDouble(d);

                    if (radioButton.getText().equals("Kız")) { // kız
                        String str = ay.getSelectedItem().toString();
                        if (String == "Yeni Doğan") ;{
                         // ay==0
                            if (bastext >= 31.7 && bastext < 33.9)
                                text1.setText("Persentil eğrisi %3, baş çevresi gelişimi Zayıf");
                            else if (bastext == 33.9)
                                text1.setText("Persentil eğrisi %50, baş çevresi gelişimi Normal");
                            else if (bastext > 33.9 && bastext <= 36.1)
                                text1.setText("Persentil eğrisi %97, baş çevresi gelişimi Yüksek");
                            else
                                text1.setText("Girilen değer yanlış");

                            if (boytext >= 45.6 && boytext < 49.1)
                                text2.setText("Persentil eğrisi %3, boy gelişimi Zayıf");
                            else if (boytext == 49.1)
                                text2.setText("Persentil eğrisi %50, boy gelişimi Normal");
                            else if (boytext > 49.1 && boytext <= 52.7)
                                text2.setText("Persentil eğrisi %97, boy gelişimi Yüksek");
                            else
                                text2.setText("Girilen değer yanlış");

                            if (kilotext >= 2.4 && kilotext < 3.2)
                                text3.setText("Persentil eğrisi %3, kilo gelişimi Zayıf");
                            else if (kilotext == 3.2)
                                text3.setText("Persentil eğrisi %50, kilo gelişimi Normal");
                            else if (kilotext > 3.2 && kilotext <= 4.2)
                                text3.setText("Persentil eğrisi %97, kilo gelişimi Yüksek");
                            else
                                text3.setText("Girilen değer yanlış");}

                        else if (String == "1 Aylık") { //ay == 1
                            if (bastext >= 34.3 && bastext < 36.5)
                                text1.setText("Persentil eğrisi %3, baş çevresi gelişimi Zayıf");
                            else if (bastext == 36.5)
                                text1.setText("Persentil eğrisi %50, baş çevresi gelişimi Normal");
                            else if (bastext > 36.5 && bastext <= 38.8)
                                text1.setText("Persentil eğrisi %97, baş çevresi gelişimi Yüksek");
                            else
                                text1.setText("Girilen değer yanlış");

                            if (boytext >= 50.0 && boytext < 53.7)
                                text2.setText("Persentil eğrisi %3, boy gelişimi Zayıf");
                            else if (boytext == 53.7)
                                text2.setText("Persentil eğrisi %50, boy gelişimi Normal");
                            else if (boytext > 53.7 && boytext <= 57.4)
                                text2.setText("Persentil eğrisi %97, boy gelişimi Yüksek");
                            else
                                text2.setText("Girilen değer yanlış");

                            if (kilotext >= 3.2 && kilotext < 4.2)
                                text3.setText("Persentil eğrisi %3, kilo gelişimi Zayıf");
                            else if (kilotext == 4.2)
                                text3.setText("Persentil eğrisi %50, kilo gelişimi Normal");
                            else if (kilotext > 4.2 && kilotext <= 5.4)
                                text3.setText("Persentil eğrisi %97, kilo gelişimi Yüksek");
                            else
                                text3.setText("Girilen değer yanlış");
                        }
                    }


                    if (radioButton.getText().equals("Erkek")) { // Erkek

                        if (String == "Yeni Doğan") { // ay==0
                            if (bastext >= 3.1 && bastext < 34.5)
                                text1.setText("Persentil eğrisi %3, baş çevresi gelişimi Zayıf");
                            else if (bastext == 34.5)
                                text1.setText("Persentil eğrisi %50, baş çevresi gelişimi Normal");
                            else if (bastext > 34.5 && bastext <= 36.9)
                                text1.setText("Persentil eğrisi %97, baş çevresi gelişimi Yüksek");
                            else
                                text1.setText("Girilen değer yanlış");

                            if (boytext >= 46.3 && boytext < 49.9)
                                text2.setText("Persentil eğrisi %3, boy gelişimi Zayıf");
                            else if (boytext == 49.9)
                                text2.setText("Persentil eğrisi %50, boy gelişimi Normal");
                            else if (boytext > 49.9 && boytext <= 53.4)
                                text2.setText("Persentil eğrisi %97, boy gelişimi Yüksek");
                            else
                                text2.setText("Girilen değer yanlış");

                            if (kilotext >= 2.5 && kilotext < 3.3)
                                text3.setText("Persentil eğrisi %3, kilo gelişimi Zayıf");
                            else if (kilotext == 3.3)
                                text3.setText("Persentil eğrisi %50, kilo gelişimi Normal");
                            else if (kilotext > 3.3 && kilotext <= 4.3)
                                text3.setText("Persentil eğrisi %97, kilo gelişimi Yüksek");
                            else
                                text3.setText("Girilen değer yanlış");
                        } else if (String == "1 Aylık") { //ay == 1
                            if (bastext >= 35.1 && bastext < 37.3)
                                text1.setText("Persentil eğrisi %3, baş çevresi gelişimi Zayıf");
                            else if (bastext == 37.3)
                                text1.setText("Persentil eğrisi %50, baş çevresi gelişimi Normal");
                            else if (bastext > 37.3 && bastext <= 39.5)
                                text1.setText("Persentil eğrisi %97, baş çevresi gelişimi Yüksek");
                            else
                                text1.setText("Girilen değer yanlış");

                            if (boytext >= 51.1 && boytext < 54.7)
                                text2.setText("Persentil eğrisi %3, boy gelişimi Zayıf");
                            else if (boytext == 54.7)
                                text2.setText("Persentil eğrisi %50, boy gelişimi Normal");
                            else if (boytext > 54.7 && boytext <= 58.4)
                                text2.setText("Persentil eğrisi %97, boy gelişimi Yüksek");
                            else
                                text2.setText("Girilen değer yanlış");

                            if (kilotext >= 3.4 && kilotext < 4.5)
                                text3.setText("Persentil eğrisi %3, kilo gelişimi Zayıf");
                            else if (kilotext == 4.5)
                                text3.setText("Persentil eğrisi %50, kilo gelişimi Normal");
                            else if (kilotext > 4.5 && kilotext <= 5.7)
                                text3.setText("Persentil eğrisi %97, kilo gelişimi Yüksek");
                            else
                                text3.setText("Girilen değer yanlış");
                        } else {
                            Toast.makeText(getApplicationContext(), "Lütfen tüm boşlukları doldurunuz", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        }