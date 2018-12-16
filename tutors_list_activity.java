package com.example.user.project_v3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class tutors_list_activity extends AppCompatActivity {

    LinearLayout linearLayout, linearLayout_math,linearLayout_physics;
    Button mathBtn,physicsBtn,mathTutor1;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutors_list_activity);

        linearLayout = findViewById(R.id.subjects_lyaout);
        linearLayout_math = findViewById(R.id.math_tutors);
        linearLayout_physics = findViewById(R.id.physics_tutors);

        mathBtn = findViewById(R.id.math_btn);
        physicsBtn = findViewById(R.id.physics_btn);
        mathTutor1 = findViewById(R.id.math_tutor_1);

        mathBtn.setOnClickListener(onClickListener);
        physicsBtn.setOnClickListener(onClickListener);
        mathTutor1.setOnClickListener(onClickListener);
    }

    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.math_btn:

                    linearLayout.setVisibility(View.GONE);
                    linearLayout_math.setVisibility(View.VISIBLE);
                        switch (v.getId()){
                            case R.id.math_tutor_1:
                                //intent = new Intent(MainActivity.this, tutors_list_activity.class);
                        }
                    //startActivity(intent);
                    break;
                case R.id.physics_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_physics.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}
