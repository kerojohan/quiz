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


        Button submitbtn = (Button) findViewById(R.id.submitbtn2);
        final RadioButton correctradio = (RadioButton) findViewById(R.id.radioButton21);



        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                Integer correctes =intent.getIntExtra("correctes",0);
                if(correctradio.isChecked()){
                    correctes++;
                }
                Intent intentToResult =new Intent(getApplicationContext(),Results.class);
                intentToResult.putExtra("correctes", correctes);
                startActivity(intentToResult);
            }
        });




    }
}