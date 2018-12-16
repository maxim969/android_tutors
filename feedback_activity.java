package com.example.user.project_v3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class feedback_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_activity);
        String name;
        name = getIntent().getExtras().getString("имя");
        TextView nameText = findViewById(R.id.feedback_tutors_name);
        Button feedbackBtn = findViewById(R.id.feedback_button);
        nameText.setText(name);
        feedbackBtn.setOnClickListener(onClickListener);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.feedback_button:
                   Intent intent = new Intent(feedback_activity.this, feedback_activity.class);
                    startActivity(intent);
                    break;
            }
        }
    };
}
