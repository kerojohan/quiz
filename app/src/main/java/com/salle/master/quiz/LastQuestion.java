package com.salle.master.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class LastQuestion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lastquestion);


        Button submitbtn = (Button) findViewById(R.id.submitbtn);
        final RadioButton correctradio = (RadioButton) findViewById(R.id.radioButton1);
        Intent intent = getIntent();
        final Integer[] correctes = {intent.getIntExtra("correctes",0)};


        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(correctradio.isChecked()){
                    correctes[0]++;
                }
                Intent intent =new Intent(getApplicationContext(),Results.class);
                intent.putExtra("correctes", correctes[0]);
                startActivity(intent);
            }
        });




    }
}