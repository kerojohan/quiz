package com.salle.master.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        TextView totalquestions;
        TextView totalcorrect;
        TextView totalincorrect;
        Button start = (Button) findViewById(R.id.startbtn);
        Intent intent = getIntent();
        final Integer[] correctes = {intent.getIntExtra("correctes",0)};

        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);


        totalquestions = (TextView) findViewById(R.id.totalquestions);
        totalcorrect = (TextView) findViewById(R.id.totalcorrect);
        totalincorrect = (TextView) findViewById(R.id.totalincorrect);

        //totalquestions.setText("5");
        //totalincorrect.setText(5 - correctes[0]);
        //totalcorrect.setText(correctes[0]);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),FirstQuestion.class);
                startActivity(intent);

            }
        });




    }
}