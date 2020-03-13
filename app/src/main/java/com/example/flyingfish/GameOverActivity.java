package com.example.flyingfish;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private Button StartGameAgain;
    TextView yourscore;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        StartGameAgain=findViewById(R.id.play_again_btn);
        yourscore=findViewById(R.id.yourscore);

        newString=getIntent().getExtras().get("SCORE").toString();

        StartGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GameOverActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        yourscore.setText("Your Score : "+newString);
    }
}
