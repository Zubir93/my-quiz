package com.bitm3453.myquiz;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

///////////////////////BUTTON///////////////////////////////////////
        Button buttonStartQuiz = findViewById(R.id.button_start_quiz);
        buttonStartQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
///////////////////////CALL METHOD///////////////////////////////////////
                  startQuiz();
///////////////////////CALL METHOD///////////////////////////////////////
            }
        });
    }

///////////////////////CALL METHOD//////////////////////////////////////
    private void startQuiz() {
        //////ERROR/////Intent intent =new Intent(packageContext: StartingScreenActivity.this,QuizActivity.class);
       //// startActivity(Intent);
    }
///////////////////////CALL METHOD//////////////////////////////////////
}

