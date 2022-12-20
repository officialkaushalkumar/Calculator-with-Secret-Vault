package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.contentcapture.ContentCaptureCondition;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    TextView resulttxt,solutiontxt;
    MaterialButton buttonc , buttonbrackopen,buttonbrackclose,buttondivide,button7,button8,button9,button4,button5,button6,button1,button2,button3,button0,buttonmultiply,buttonplus,buttonminus,buttonac,buttondot,buttonequal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeVariables();
        setclicklistener();

    }

    private void initializeVariables(){

        resulttxt = findViewById(R.id.result);
        solutiontxt = findViewById(R.id.solution);
        buttonac = findViewById(R.id.button_ac);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);
        button7 = findViewById(R.id.button_7);
        button8 = findViewById(R.id.button_8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button_0);
        buttonc = findViewById(R.id.button_c);
        buttonmultiply = findViewById(R.id.button_multiply);
        buttonplus = findViewById(R.id.button_plus);
        buttonminus = findViewById(R.id.button_minus);
        buttondivide = findViewById(R.id.button_divide);
        buttondot = findViewById(R.id.button_dot);
        buttonbrackopen = findViewById(R.id.button_open_bracket);
        buttonbrackclose= findViewById(R.id.button_close_bracket);
        buttonequal = findViewById(R.id.button_equal);

    }

    String getresult(String data){
        try{
            Context context = Context.enter();
            context.setOptimizationLevel(-1);
            Scriptable scriptable =context.initStandardObjects();
            String finalresult = context.evaluateString(scriptable,data,"Javascript",1,null).toString();
            if(finalresult.endsWith(".0")){
                finalresult = finalresult.replace(".0","");
            }
            return finalresult;
        }catch(Exception e){
            return "Err";
        }
    }

    private void setclicklistener(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button1.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button2.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button3.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button4.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button5.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button6.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button7.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button8.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button9.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = button0.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttonac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttonac.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttonc.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttonbrackopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttonbrackopen.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttonbrackclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttonbrackclose.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttondot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttondot.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttondivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttondivide.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttonmultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttonmultiply.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttonplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttonplus.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttonminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttonminus.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;

                }
                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });
        buttonequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String buttontxt = buttonequal.getText().toString();
                String datatocalculate = solutiontxt.getText().toString();

                if(buttontxt.equals("AC")){
                    solutiontxt.setText("");
                    resulttxt.setText("0");
                }
                if(buttontxt.equals("=")){
                    if(datatocalculate.equals("112211")){
                        startActivity(new Intent(MainActivity.this,dashboard.class));
                    }
                    solutiontxt.setText(resulttxt.getText());
                    return;
                }
                if(buttontxt.equals("C")){
                    datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
                }
                else{

                    datatocalculate = datatocalculate + buttontxt;
                }

                solutiontxt.setText(datatocalculate);
                String finalresult=getresult(datatocalculate);
                if(!finalresult.equals("Err")){
                    resulttxt.setText(finalresult);
                }
            }
        });

    }

}