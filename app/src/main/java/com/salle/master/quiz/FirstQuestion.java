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

        Button submitbtn = (Button) findViewById(R.id.submitbtn1);
        final RadioButton correctradio = (RadioButton) findViewById(R.id.radioButton12);



        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer correctes = 0;
                if(correctradio.isChecked()){
                    correctes++;
                }
                Intent intent =new Intent(getApplicationContext(),LastQuestion.class);
                intent.putExtra("correctes", correctes);
                startActivity(intent);
            }
        });




    }
}