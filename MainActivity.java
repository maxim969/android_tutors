package com.example.user.project_v3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
//implements View.OnClickListener
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mathBtn = (Button) findViewById(R.id.math_btn);

        mathBtn.setOnClickListener(onClickListener); // Обработчик
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.math_btn:
                Intent intent = new Intent(v.getContext(), math_tutors_activity.class);
                startActivity(intent);
                break;
                default:
                    break;
            }
        }
    };
}
