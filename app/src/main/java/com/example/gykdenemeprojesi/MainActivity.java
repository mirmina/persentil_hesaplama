package com.example.gykdenemeprojesi;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    Button bttn;
    EditText boy, kilo, bascevresi, ay;
    Double boytext, kilotext, bastext, aytext;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        boy=(EditText)findViewById(R.id.boy);
        kilo=(EditText)findViewById(R.id.kilo);
        bascevresi=(EditText)findViewById(R.id.bascevresi);
        ay=(EditText)findViewById(R.id.ay);
        text1=(TextView)findViewById(R.id.text1);
        setContentView(R.layout.activity_main);
        bttn=(Button)findViewById(R.id.bttn);
        bttn.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick(View v) {
                kilotext = Double.parseDouble(kilo.getText().toString());
                boytext = Double.parseDouble(boy.getText().toString());
                bastext = Double.parseDouble(bascevresi.getText().toString());
                aytext = Double.parseDouble(ay.getText().toString());
                text1 = (TextView) findViewById(R.id.text1);

                if (aytext == 0){
                    if (boytext >= 45.6 && boytext <= 49.1)
                        text1.setText("Persentil eğrisi %3, boy gelişimi Zayıf");
                    else if (boytext == 49.1)
                        text1.setText("Persentil eğrisi %50, boy gelişimi Normal");
                    else if (boytext >= 49.1 && boytext <= 52.7)
                        text1.setText("Persentil eğrisi %97, boy gelişimi Yüksek");




                    if (kilotext >= 2.4 && kilotext <= 3.2)
                        text1.setText("Persentil eğrisi %3, kilo gelişimi Zayıf");
                    else if (kilotext == 3.2)
                        text1.setText("Persentil eğrisi %50, kilo gelişimi Normal");
                    else if (kilotext >= 3.2 && kilotext <= 4.2)
                        text1.setText("Persentil eğrisi %97, kilo gelişimi Yüksek");



                    if (bastext >= 31.7 && bastext <= 33.9)
                        text1.setText("Persentil eğrisi %3, baş çevresi gelişimi Zayıf");
                    else if (bastext == 33.9)
                        text1.setText("Persentil eğrisi %50, baş çevresi gelişimi Normal");
                    else if (bastext >= 33.9 && bastext <= 36.1)
                        text1.setText("Persentil eğrisi %97, baş çevresi gelişimi Yüksek");
                }



                else if (aytext == 1){
                    if (boytext >= 50.0 && boytext <= 53.7)
                        text1.setText("Persentil eğrisi %3, boy gelişimi Zayıf");
                    else if (boytext == 53.7)
                        text1.setText("Persentil eğrisi %50, boy gelişimi Normal");
                    else if (boytext >= 53.7 && boytext <= 57.4)
                        text1.setText("Persentil eğrisi %97, boy gelişimi Yüksek");



                    if (kilotext >= 3.2 && kilotext <= 4.2)
                        text1.setText("Persentil eğrisi %3, kilo gelişimi Zayıf");
                    else if (kilotext == 4.2)
                        text1.setText("Persentil eğrisi %50, kilo gelişimi Normal");
                    else if (kilotext >= 4.2 && kilotext <= 5.4)
                        text1.setText("Persentil eğrisi %97, kilo gelişimi Yüksek");

                    if (bastext >= 34.3 && bastext <= 36.5)
                        text1.setText("Persentil eğrisi %3, baş çevresi gelişimi Zayıf");
                }


                else{
                    if (bastext == 36.5)
                        text1.setText("Persentil eğrisi %50, baş çevresi gelişimi Normal");
                    else if (bastext >= 36.5 && bastext <= 38.8)
                        text1.setText("Persentil eğrisi %97, baş çevresi gelişimi Yüksek");
                }


            }});
    }
}