package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView QuestionTextView;
    TextView ScoreTextview;
    Button yesbotton;
    Button nobotton;
    private int index=0;
    private int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesbotton=findViewById(R.id.yesbutton);
        nobotton=findViewById(R.id.nobutton);
        QuestionTextView=findViewById(R.id.QuestionTextView);
        ScoreTextview=findViewById(R.id.ScoreTextView);
        String [] questionArray={"Java is based on Object oriented Programming?","Java is not a flatform independence?","Java was introduce in 1989?",};
        boolean [] answerArray={true,false,false};

        QuestionTextView.setText(questionArray[index]);

        yesbotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questionArray.length-1) {
                    //To show final score in textview.

                    if (answerArray[index] == true) {
                        score++;
                    }
                    index++;
                    if (index<=questionArray.length-1) {
                        QuestionTextView.setText(questionArray[index]);
                    }
                    else {
                        ScoreTextview.setText("Your score: " + score + "/" + questionArray.length);
                        Toast.makeText(MainActivity.this, "Restart App To Play Again", Toast.LENGTH_SHORT).show();
                    }
                }

            }

        });

        nobotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questionArray.length-1) {
                    //To show final score in textview.

                    if (answerArray[index] == false) {
                        score++;
                    }
                    index++;
                    if (index<=questionArray.length-1) {
                        QuestionTextView.setText(questionArray[index]);
                    }
                    else {
                        ScoreTextview.setText("Your score: " + score + "/" + questionArray.length);
                        Toast.makeText(MainActivity.this, "Restart App To Play Again", Toast.LENGTH_LONG).show();
                    }
                }

            }

        });
    }

}