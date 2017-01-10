package com.salle.master.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class FirstQuestion extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstquestion);

        Button submitbtn = (Button) findViewById(R.id.submitbtn);
        final RadioButton correctradio = (RadioButton) findViewById(R.id.radioButton2);
        final Integer[] correctes = {0};


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correctradio.isChecked()){
                    correctes[0]++;
                }
                Intent intent =new Intent(getApplicationContext(),LastQuestion.class);
                intent.putExtra("correctes", correctes[0]);
                startActivity(intent);
            }
        });




    }
}