package com.example.jameswing.flagquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Button button3;
    private Button button;
    private Button button2;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private int c = 0, g = 0; //c = correct, g = guesses
    private double score = 0.0;
    //private Spinner spinner;
    //private Spinner spinner2;
    private TextView textView2;
    private TextView textView3;
    private ImageView imageView;
    int index = 0;
    int n = 1;
    int size = 80;

    private boolean ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);
        button4=(Button)findViewById(R.id.button4);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button9.setEnabled(false);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.canadaflag);
        ans=false;

        //button3.setVisibility(View.INVISIBLE);
        //button4.setVisibility(View.INVISIBLE);
        //button5.setVisibility(View.INVISIBLE);
        //button6.setVisibility(View.INVISIBLE);
        //button7.setVisibility(View.INVISIBLE);
        //button8.setVisibility(View.INVISIBLE);
        /*spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.regions,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this,R.array.choices,android.R.layout.simple_spinner_item);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(this);
*/
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                if (button.getText().toString().equals("Canada") || button.getText().toString().equals("Australia") || button.getText().toString().equals("China") || button.getText().toString().equals("Netherlands") || button.getText().toString().equals("Cambodia") || button.getText().toString().equals("Saudi Arabia") || button.getText().toString().equals("Uganda") || button.getText().toString().equals("Peru") || button.getText().toString().equals("El Salvador") || button.getText().toString().equals("Uzbekistan")) {
                    ans = true;

                    button.setBackgroundColor(Color.GREEN);
                    button.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    g++;
                    c++;
                    button9.setEnabled(true);
                } else {
                    ans = false;
                    button.setBackgroundColor(Color.RED);
                    button.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG).show();
                    g++;
                    button9.setEnabled(true);
                }
                score = (c*1.0)/(g*1.0)*100;
                textView2.setText(String.format("%.2f", score)+"%");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button2.getText().toString().equals("Canada") || button2.getText().toString().equals("Australia") || button2.getText().toString().equals("China") || button2.getText().toString().equals("Netherlands") || button2.getText().toString().equals("Cambodia") || button2.getText().toString().equals("Saudi Arabia") || button2.getText().toString().equals("Uganda") || button2.getText().toString().equals("Peru") || button2.getText().toString().equals("El Salvador") || button2.getText().toString().equals("Uzbekistan")) {
                    ans = true;

                    button2.setBackgroundColor(Color.GREEN);
                    button2.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    g++;
                    c++;
                    button9.setEnabled(true);
                } else {
                    ans = false;
                    button2.setBackgroundColor(Color.RED);
                    button2.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG).show();
                    g++;
                    button9.setEnabled(true);
                }
                score = (c*1.0)/(g*1.0)*100;
                textView2.setText(String.format("%.2f", score)+"%");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button3.getText().toString().equals("Canada") || button3.getText().toString().equals("Australia") || button3.getText().toString().equals("China") || button3.getText().toString().equals("Netherlands") || button3.getText().toString().equals("Cambodia") || button3.getText().toString().equals("Saudi Arabia") || button3.getText().toString().equals("Uganda") || button3.getText().toString().equals("Peru") || button3.getText().toString().equals("El Salvador") || button3.getText().toString().equals("Uzbekistan")) {
                    ans = true;

                    button3.setBackgroundColor(Color.GREEN);
                    button3.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    g++;
                    c++;
                    button9.setEnabled(true);
                } else {
                    ans = false;
                    button3.setBackgroundColor(Color.RED);
                    button3.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG).show();
                    g++;
                    button9.setEnabled(true);
                }
                score = (c*1.0)/(g*1.0)*100;
                textView2.setText(String.format("%.2f", score)+"%");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button4.getText().toString().equals("Canada") || button4.getText().toString().equals("Australia") || button4.getText().toString().equals("China") || button4.getText().toString().equals("Netherlands") || button4.getText().toString().equals("Cambodia") || button4.getText().toString().equals("Saudi Arabia") || button4.getText().toString().equals("Uganda") || button4.getText().toString().equals("Peru") || button4.getText().toString().equals("El Salvador") || button4.getText().toString().equals("Uzbekistan")) {
                    ans = true;

                    button4.setBackgroundColor(Color.GREEN);
                    button4.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    g++;
                    c++;
                    button9.setEnabled(true);
                } else {
                    ans = false;
                    button4.setBackgroundColor(Color.RED);
                    button4.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG).show();
                    g++;
                    button9.setEnabled(true);
                }
                score = (c*1.0)/(g*1.0)*100;
                textView2.setText(String.format("%.2f", score)+"%");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button5.getText().toString().equals("Canada") || button5.getText().toString().equals("Australia") || button5.getText().toString().equals("China") || button5.getText().toString().equals("Netherlands") || button5.getText().toString().equals("Cambodia") || button5.getText().toString().equals("Saudi Arabia") || button5.getText().toString().equals("Uganda") || button5.getText().toString().equals("Peru") || button5.getText().toString().equals("El Salvador") || button5.getText().toString().equals("Uzbekistan")) {
                    ans = true;

                    button5.setBackgroundColor(Color.GREEN);
                    button5.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    g++;
                    c++;
                    button9.setEnabled(true);
                } else {
                    ans = false;
                    button5.setBackgroundColor(Color.RED);
                    button5.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG).show();
                    g++;
                    button9.setEnabled(true);
                }
                score = (c*1.0)/(g*1.0)*100;
                textView2.setText(String.format("%.2f", score)+"%");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button6.getText().toString().equals("Canada") || button6.getText().toString().equals("Australia") || button6.getText().toString().equals("China") || button6.getText().toString().equals("Netherlands") || button6.getText().toString().equals("Cambodia") || button6.getText().toString().equals("Saudi Arabia") || button6.getText().toString().equals("Uganda") || button6.getText().toString().equals("Peru") || button6.getText().toString().equals("El Salvador") || button6.getText().toString().equals("Uzbekistan")) {
                    ans = true;

                    button6.setBackgroundColor(Color.GREEN);
                    button6.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    g++;
                    c++;
                    button9.setEnabled(true);
                } else {
                    ans = false;
                    button6.setBackgroundColor(Color.RED);
                    button6.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG).show();
                    g++;
                    button9.setEnabled(true);
                }
                score = (c*1.0)/(g*1.0)*100;
                textView2.setText(String.format("%.2f", score)+"%");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button7.getText().toString().equals("Canada") || button7.getText().toString().equals("Australia") || button7.getText().toString().equals("China") || button7.getText().toString().equals("Netherlands") || button7.getText().toString().equals("Cambodia") || button7.getText().toString().equals("Saudi Arabia") || button7.getText().toString().equals("Uganda") || button7.getText().toString().equals("Peru") || button7.getText().toString().equals("El Salvador") || button7.getText().toString().equals("Uzbekistan")) {
                    ans = true;

                    button7.setBackgroundColor(Color.GREEN);
                    button7.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    g++;
                    c++;
                    button9.setEnabled(true);
                } else {
                    ans = false;
                    button7.setBackgroundColor(Color.RED);
                    button7.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG).show();
                    g++;
                    button9.setEnabled(true);
                }
                score = (c*1.0)/(g*1.0)*100;
                textView2.setText(String.format("%.2f", score)+"%");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (button8.getText().toString().equals("Canada") || button8.getText().toString().equals("Australia") || button8.getText().toString().equals("China") || button8.getText().toString().equals("Netherlands") || button8.getText().toString().equals("Cambodia") || button8.getText().toString().equals("Saudi Arabia") || button8.getText().toString().equals("Uganda") || button8.getText().toString().equals("Peru") || button8.getText().toString().equals("El Salvador") || button8.getText().toString().equals("Uzbekistan")) {
                    ans = true;

                    button8.setBackgroundColor(Color.GREEN);
                    button8.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    g++;
                    c++;
                    button9.setEnabled(true);
                } else {
                    ans = false;
                    button8.setBackgroundColor(Color.RED);
                    button8.setEnabled(false);
                    Toast.makeText(MainActivity.this, "Incorrect!", Toast.LENGTH_LONG).show();
                    g++;
                    button9.setEnabled(true);
                }
                score = (c*1.0)/(g*1.0)*100;
                textView2.setText(String.format("%.2f", score)+"%");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans=false;
                button.setBackgroundColor(Color.YELLOW);
                button2.setBackgroundColor(Color.YELLOW);
                button3.setBackgroundColor(Color.YELLOW);
                button4.setBackgroundColor(Color.YELLOW);
                button5.setBackgroundColor(Color.YELLOW);
                button6.setBackgroundColor(Color.YELLOW);
                button7.setBackgroundColor(Color.YELLOW);
                button8.setBackgroundColor(Color.YELLOW);

                button.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
                button7.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(false);

                if(index==0)
                    imageView.setImageResource(R.drawable.ugandaflag);
                else if(index==8)
                    imageView.setImageResource(R.drawable.chinaflag);
                else if(index==16)
                    imageView.setImageResource(R.drawable.australiaflag);
                else if(index==24)
                    imageView.setImageResource(R.drawable.netherlandsflag);
                else if(index==32)
                    imageView.setImageResource(R.drawable.saudiarabiaflag);
                else if(index==40)
                    imageView.setImageResource(R.drawable.cambodiaflag);
                else if(index==48)
                    imageView.setImageResource(R.drawable.peruflag);
                else if(index==56)
                    imageView.setImageResource(R.drawable.elsalvadorflag);
                else if(index==64)
                    imageView.setImageResource(R.drawable.uzbekistanflag);
                else if(index==72) {
                    button.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    button4.setVisibility(View.INVISIBLE);
                    button5.setVisibility(View.INVISIBLE);
                    button6.setVisibility(View.INVISIBLE);
                    button7.setVisibility(View.INVISIBLE);
                    button8.setVisibility(View.INVISIBLE);
                   button9.setVisibility(View.INVISIBLE);
                }

                index += 8;
                n++;

                String[] x = new String[size];
                x[0]="USA";
                x[1]="Canada";
                x[2]="Bahamas";
                x[3]="Mexico";
                x[4]="Panama";
                x[5]="Costa Rica";
                x[6]="Jamaica";
                x[7]="Cuba";
                x[8]="Zimbabwe";
                x[9]="Egypt";
                x[10]="Morocco";
                x[11]="Uganda";
                x[12]="Gabon";
                x[13]="Chad";
                x[14]="Ghana";
                x[15]="Burkina Faso";
                x[16]="China";
                x[17]="Japan";
                x[18]="Bangladesh";
                x[19]="Kazakhstan";
                x[20]="North Korea";
                x[21]="South Korea";
                x[22]="Sri Lanka";
                x[23]="India";
                x[24]="Papua New Guinea";
                x[25]="Tahiti";
                x[26]="Indonesia";
                x[27]="Singapore";
                x[28]="Marshall Islands";
                x[29]="Kiribati";
                x[30]="New Zealand";
                x[31]="Australia";
                x[32]="France";
                x[33]="Russia";
                x[34]="United Kingdom";
                x[35]="Denmark";
                x[36]="Netherlands";
                x[37]="Germany";
                x[38]="Norway";
                x[39]="Lithuania";
                x[40]="Iran";
                x[41]="Yemen";
                x[42]="Afghanistan";
                x[43]="Oman";
                x[44]="Iraq";
                x[45]="Saudi Arabia";
                x[46]="Pakistan";
                x[47]="Israel";
                x[48]="Hong Kong";
                x[49]="Philippines";
                x[50]="Laos";
                x[51]="Cambodia";
                x[52]="Myanmar";
                x[53]="Thailand";
                x[54]="Malaysia";
                x[55]="Vietnam";
                x[56]="Bolivia";
                x[57]="Uruguay";
                x[58]="Brazil";
                x[59]="Paraguay";
                x[60]="Chile";
                x[61]="Guyana";
                x[62]="Peru";
                x[63]="Ecuador";
                x[64]="Nicaragua";
                x[65]="Barbados";
                x[66]="Haiti";
                x[67]="El Salvador";
                x[68]="Honduras";
                x[69]="Dominican Republic";
                x[70]="Trinidad & Tobago";
                x[71]="Belize";
                x[72]="Estonia";
                x[73]="Uzbekistan";
                x[74]="Azerbaijan";
                x[75]="Tajikistan";
                x[76]="Georgia";
                x[77]="Kyrgyzstan";
                x[78]="Turkmenistan";
                x[79]="Nepal";

                if(index != size){
                    button.setText(x[index]);
                    button2.setText(x[index+1]);
                    button3.setText(x[index+2]);
                    button4.setText(x[index+3]);
                    button5.setText(x[index+4]);
                    button6.setText(x[index+5]);
                    button7.setText(x[index+6]);
                    button8.setText(x[index+7]);
                }
                textView3.setText(String.format("Question %d of 10", n));

            }
        });
        }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //TextView myText= (TextView) view;
        //Toast.makeText(this,"You selected ", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}