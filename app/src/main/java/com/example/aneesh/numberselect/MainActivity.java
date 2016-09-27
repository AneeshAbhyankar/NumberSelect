package com.example.aneesh.numberselect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button rightButton;
    private Button leftButton;
    private TextView pts;
    private int points = 0;

    public void buttonInit(){
        leftButton = (Button)findViewById(R.id.leftButton);
        rightButton = (Button)findViewById(R.id.rightButton);
        int left = 0;
        int right = 0;

        Random r = new Random();

        do{
            left = r.nextInt(10);
            right = r.nextInt(10);
        }while(left == right);

        leftButton.setText(left + "");
        rightButton.setText(right + "");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonInit();
    }

    public void leftButtonClick(View view) {
        leftButton = (Button)findViewById(R.id.leftButton);
        rightButton = (Button)findViewById(R.id.rightButton);
        pts = (TextView)findViewById(R.id.pointsText);

        int l = Integer.parseInt(leftButton.getText().toString());
        int r = Integer.parseInt(rightButton.getText().toString());

        if(l > r){
            //Toast.makeText(this, "correct!", Toast.LENGTH_SHORT).show();
            points++;
            pts.setText("points: " + points);
            buttonInit();
        }else{
            //Toast.makeText(this, "wrong!", Toast.LENGTH_SHORT).show();
            points--;
            pts.setText("points: " + points);
            buttonInit();
        }
    }

    public void rightButtonClick(View view) {
        leftButton = (Button)findViewById(R.id.leftButton);
        rightButton = (Button)findViewById(R.id.rightButton);
        pts = (TextView)findViewById(R.id.pointsText);

        int l = Integer.parseInt(leftButton.getText().toString());
        int r = Integer.parseInt(rightButton.getText().toString());

        if(r > l){
            //Toast.makeText(this, "correct!", Toast.LENGTH_SHORT).show();
            points++;
            pts.setText("points: " + points);
            buttonInit();
        }else{
            //Toast.makeText(this, "wrong!", Toast.LENGTH_SHORT).show();
            points--;
            pts.setText("points: " + points);
            buttonInit();
        }
    }
}
