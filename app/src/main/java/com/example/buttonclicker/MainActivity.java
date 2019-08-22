package com.example.buttonclicker;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private int timesClicked;
    private Button buttonClickerButton;
    private TextView textViewScore;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timesClicked = 0;

        buttonClickerButton = findViewById(R.id.button_main_click);
        textViewScore = findViewById(R.id.textview_main__score);
        constraintLayout = findViewById(R.id.constraint_layout_main);
    }

    public void onClickerClicked(View view) {
        Toast.makeText(this, "gg", Toast.LENGTH_SHORT).show();

        timesClicked++;

        textViewScore.setText("Score:" + timesClicked);

        buttonClickerButton.setText("Clicked:" + timesClicked);

        changeBackgroundColor();

    }

    private void changeBackgroundColor()
    {
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        int color = Color.rgb(r, g, b);
        constraintLayout.setBackgroundColor(color);
        int r2 = 255 - r;
        int g2 = 255 - g;
        int b2 = 255 - b;
        int negColor = Color.rgb(r2, g2, b2);
        textViewScore.setTextColor(negColor);

    }
}
