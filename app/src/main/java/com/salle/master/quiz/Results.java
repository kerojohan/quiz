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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        Integer total = 5;
        Integer incorrectes = 0;

        TextView totalquestions;
        TextView totalcorrect;
        TextView totalincorrect;
        Button tryagain = (Button) findViewById(R.id.tryagain);
        Intent intent = getIntent();
        Integer correctes = intent.getIntExtra("correctes",0);


        totalquestions = (TextView) findViewById(R.id.totalquestions);
        totalcorrect = (TextView) findViewById(R.id.totalcorrect);
        totalincorrect = (TextView) findViewById(R.id.totalincorrect);

        totalquestions.setText(total.toString());
        incorrectes= total - correctes;
        totalincorrect.setText(incorrectes.toString());
        totalcorrect.setText(correctes.toString());

        System.out.println("total: "+total);
        System.out.println("correctes: "+correctes);
        System.out.println("incorrectes: "+incorrectes);

        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),FirstQuestion.class);
                startActivity(intent);

            }
        });




    }
}