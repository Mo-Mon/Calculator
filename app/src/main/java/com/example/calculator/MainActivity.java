package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    //thanh hiển thị kết quả
    private EditText edmain;

    // button số 0 đến 9
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    // button phép toán cộng trừ nhân chia
    private Button btndaunhan;
    private Button btndauchia;
    private Button btndaucong;
    private Button btndautru;
    // button xử lý
    private Button btndaubang;
    private Button btnce;
    private Button btnc;
    private Button btnbs;

    private Button btndaucham;
    // hàm khởi tạo cho các view theo id
    public void initwidget(){
        edmain=(EditText) findViewById(R.id.edmain);
        btn0=(Button)findViewById(R.id.btn0);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btndaunhan=(Button)findViewById(R.id.btndaunhan);
        btndauchia=(Button)findViewById(R.id.btndauchia);
        btndaucong=(Button)findViewById(R.id.btndaucong);
        btndautru=(Button)findViewById(R.id.btndautru);
        btndaubang=(Button)findViewById(R.id.btndaubang);
        btnce=(Button)findViewById(R.id.btnce);
        btnc=(Button)findViewById(R.id.btnc);
        btnbs=(Button)findViewById(R.id.btnbs);
        btndaucham=(Button)findViewById(R.id.btndaucham);
    }

    public void setEventClickViews(){
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btndaunhan.setOnClickListener(this);
        btndauchia.setOnClickListener(this);
        btndaucong.setOnClickListener(this);
        btndautru.setOnClickListener(this);
        btndaubang.setOnClickListener(this);
        btnce.setOnClickListener(this);
        btnc.setOnClickListener(this);
        btnbs.setOnClickListener(this);
        btndaucham.setOnClickListener(this);
    }
    public String delete(String s){
        int i=s.length()-1;
        if(i>=0) {
            String temp = s.substring(0, i);
            return temp;
        }
        return s;
    }
    private float numbermain,numbertemp;
    int toantu,dau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initwidget();
        setEventClickViews();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn0:
                String a=edmain.getText().toString();
                if(a.matches("")){}
                else {
                    edmain.append("0");
                }

                break;
            case R.id.btn1:
                edmain.append("1");
                break;
            case R.id.btn2:
                edmain.append("2");
                break;
            case R.id.btn3:
                edmain.append("3");
                break;
            case R.id.btn4:
                edmain.append("4");
                break;
            case R.id.btn5:
                edmain.append("5");
                break;
            case R.id.btn6:
                edmain.append("6");
                break;
            case R.id.btn7:
                edmain.append("7");
                break;
            case R.id.btn8:
                edmain.append("8");
                break;
            case R.id.btn9:
                edmain.append("9");
                break;
            case R.id.btndaucham:

                edmain.append(".");
                break;
            case R.id.btndaucong:

                String s= edmain.getText().toString();
                numbermain=Float.parseFloat(s);
                toantu=1;
                edmain.setText("");
                break;
            case R.id.btndautru:
                s= edmain.getText().toString();
                numbermain=Float.parseFloat(s);
                toantu=2;
                edmain.setText("");
                break;
            case R.id.btndaunhan:
                s= edmain.getText().toString();
                numbermain=Float.parseFloat(s);
                toantu=3;
                edmain.setText("");
                break;
            case R.id.btndauchia:
                s= edmain.getText().toString();
                numbermain=Float.parseFloat(s);
                toantu=4;
                edmain.setText("");
                break;
            case R.id.btndaubang:
                s= edmain.getText().toString();
                numbertemp=Float.parseFloat(s);
                switch(toantu) {
                    case 1:
                        numbermain+=numbertemp;
                        break;
                    case 2:
                        numbermain-=numbertemp;
                        break;
                    case 3:
                        numbermain*=numbertemp;
                        break;
                    case 4:
                        numbermain/=numbertemp;
                        break;
                }
                edmain.setText(String.valueOf(numbermain));
                numbermain=0;
                break;
            case R.id.btnce:
                edmain.setText("");
                break;
            case R.id.btnc:
                edmain.setText("");
                numbermain=0;
                break;
            case R.id.btnbs:
                String temp=delete(edmain.getText().toString());
                edmain.setText(temp);
                break;
            case R.id.btndau:

                break;
        }
    }
}