package com.example.user.project_v3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class tutors_list_activity extends AppCompatActivity {

    LinearLayout linearLayout, linearLayout_math, linearLayout_physics;
    LinearLayout linearLayout_russian, linearLayout_english, linearLayout_belarussian;
    LinearLayout linearLayout_chemistry, linearLayout_geografy, linearLayout_biology, linearLayout_history;
    Button mathBtn, physicsBtn, russianBtn, englishBtn, belarussianBtn, chemistryBtn, geografyBtn, biologyBtn, historyBtn;
    Button mathTutor1, mathTutor2, mathTutor3;
    Button physicsTutor1, physicsTutor2, physicsTutor3;
    Button russianTutor1, russianTutor2, russianTutor3;
    Button englishTutor1, englishTutor2, englishTutor3;
    Button belarussianTutor1, belarussianTutor2, belarussianTutor3;
    Button chemistryTutor1, chemistryTutor2, chemistryTutor3;
    Button geographyTutor1, geographyTutor2, geographyTutor3;
    Button biologyTutor1, biologyTutor2, biologyTutor3;
    Button historyTutor1, historyTutor2, historyTutor3;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutors_list_activity);

        linearLayout = findViewById(R.id.subjects_lyaout);
        linearLayout_math = findViewById(R.id.math_tutors);
        linearLayout_physics = findViewById(R.id.physics_tutors);
        linearLayout_russian = findViewById(R.id.russian_tutors);
        linearLayout_english = findViewById(R.id.english_tutors);
        linearLayout_belarussian = findViewById(R.id.belarussian_tutors);
        linearLayout_chemistry = findViewById(R.id.chemistry_tutors);
        linearLayout_geografy = findViewById(R.id.geografy_tutors);
        linearLayout_biology = findViewById(R.id.biology_tutors);
        linearLayout_history = findViewById(R.id.history_tutors);

        mathBtn = findViewById(R.id.math_btn);
        physicsBtn = findViewById(R.id.physics_btn);
        russianBtn = findViewById(R.id.russian_lg_btn);
        englishBtn = findViewById(R.id.english_lg_btn);
        belarussianBtn = findViewById(R.id.belarussian_lg_btn);
        chemistryBtn = findViewById(R.id.chemistry_btn);
        geografyBtn = findViewById(R.id.geography_btn);
        biologyBtn = findViewById(R.id.biology_btn);
        historyBtn = findViewById(R.id.history_btn);

        mathTutor1 = findViewById(R.id.math_tutor_1);
        mathTutor2 = findViewById(R.id.math_tutor_2);
        mathTutor3 = findViewById(R.id.math_tutor_3);

        physicsTutor1 = findViewById(R.id.physics_tutor_1);
        physicsTutor2 = findViewById(R.id.physics_tutor_2);
        physicsTutor3 = findViewById(R.id.physics_tutor_3);

        russianTutor1 = findViewById(R.id.russian_tutor_1);
        russianTutor2 = findViewById(R.id.russian_tutor_2);
        russianTutor3 = findViewById(R.id.russian_tutor_3);

        englishTutor1 = findViewById(R.id.english_tutor_1);
        englishTutor2 = findViewById(R.id.english_tutor_2);
        englishTutor3 = findViewById(R.id.english_tutor_3);

        belarussianTutor1 = findViewById(R.id.belarussian_tutor_1);
        belarussianTutor2 = findViewById(R.id.belarussian_tutor_2);
        belarussianTutor3 = findViewById(R.id.belarussian_tutor_3);

        chemistryTutor1 = findViewById(R.id.chemistry_tutor_1);
        chemistryTutor2 = findViewById(R.id.chemistry_tutor_2);
        chemistryTutor3 = findViewById(R.id.chemistry_tutor_3);

        geographyTutor1 = findViewById(R.id.geografy_tutor_1);
        geographyTutor2 = findViewById(R.id.geografy_tutor_2);
        geographyTutor3 = findViewById(R.id.geografy_tutor_3);

        biologyTutor1 = findViewById(R.id.biology_tutor_1);
        biologyTutor2 = findViewById(R.id.biology_tutor_2);
        biologyTutor3 = findViewById(R.id.biology_tutor_3);

        historyTutor1 = findViewById(R.id.history_tutor_1);
        historyTutor2 = findViewById(R.id.history_tutor_2);
        historyTutor3 = findViewById(R.id.history_tutor_3);

        mathBtn.setOnClickListener(onClickListener);
        physicsBtn.setOnClickListener(onClickListener);
        russianBtn.setOnClickListener(onClickListener);
        englishBtn.setOnClickListener(onClickListener);
        belarussianBtn.setOnClickListener(onClickListener);
        chemistryBtn.setOnClickListener(onClickListener);
        geografyBtn.setOnClickListener(onClickListener);
        biologyBtn.setOnClickListener(onClickListener);
        historyBtn.setOnClickListener(onClickListener);

        mathTutor1.setOnClickListener(onClickListener1);
        mathTutor2.setOnClickListener(onClickListener1);
        mathTutor3.setOnClickListener(onClickListener1);
        physicsTutor1.setOnClickListener(onClickListener2);
        physicsTutor2.setOnClickListener(onClickListener2);
        physicsTutor3.setOnClickListener(onClickListener2);
        russianTutor1.setOnClickListener(onClickListener3);
        russianTutor2.setOnClickListener(onClickListener3);
        russianTutor3.setOnClickListener(onClickListener3);
        englishTutor1.setOnClickListener(onClickListener4);
        englishTutor2.setOnClickListener(onClickListener4);
        englishTutor3.setOnClickListener(onClickListener4);
        belarussianTutor1.setOnClickListener(onClickListener5);
        belarussianTutor2.setOnClickListener(onClickListener5);
        belarussianTutor3.setOnClickListener(onClickListener5);
        chemistryTutor1.setOnClickListener(onClickListener6);
        chemistryTutor2.setOnClickListener(onClickListener6);
        chemistryTutor3.setOnClickListener(onClickListener6);
        geographyTutor1.setOnClickListener(onClickListener7);
        geographyTutor2.setOnClickListener(onClickListener7);
        geographyTutor3.setOnClickListener(onClickListener7);
        biologyTutor1.setOnClickListener(onClickListener8);
        biologyTutor2.setOnClickListener(onClickListener8);
        biologyTutor3.setOnClickListener(onClickListener8);
        historyTutor1.setOnClickListener(onClickListener9);
        historyTutor2.setOnClickListener(onClickListener9);
        historyTutor3.setOnClickListener(onClickListener9);
    }


    private final View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.math_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_math.setVisibility(View.VISIBLE);
                    break;
                case R.id.physics_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_physics.setVisibility(View.VISIBLE);
                    break;
                case R.id.russian_lg_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_russian.setVisibility(View.VISIBLE);
                    break;
                case R.id.english_lg_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_english.setVisibility(View.VISIBLE);
                    break;
                case R.id.belarussian_lg_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_belarussian.setVisibility(View.VISIBLE);
                    break;
                case R.id.chemistry_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_chemistry.setVisibility(View.VISIBLE);
                    break;
                case R.id.geography_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_geografy.setVisibility(View.VISIBLE);
                    break;
                case R.id.biology_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_biology.setVisibility(View.VISIBLE);
                    break;
                case R.id.history_btn:
                    linearLayout.setVisibility(View.GONE);
                    linearLayout_history.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };


    private final View.OnClickListener onClickListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.math_tutor_1:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", mathTutor1.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.math_tutor_2:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", mathTutor2.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.math_tutor_3:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", mathTutor3.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
    private final View.OnClickListener onClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.physics_tutor_1:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", physicsTutor1.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.physics_tutor_2:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", physicsTutor2.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.physics_tutor_3:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", physicsTutor3.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
    private final View.OnClickListener onClickListener3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.russian_tutor_1:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", russianTutor1.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.russian_tutor_2:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", russianTutor2.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.russian_tutor_3:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", russianTutor3.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
    private final View.OnClickListener onClickListener4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.english_tutor_1:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", englishTutor1.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.english_tutor_2:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", englishTutor2.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.english_tutor_3:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", englishTutor3.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
    private final View.OnClickListener onClickListener5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.belarussian_tutor_1:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", belarussianTutor1.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.belarussian_tutor_2:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", belarussianTutor2.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.belarussian_tutor_3:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", belarussianTutor3.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
    private final View.OnClickListener onClickListener6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.chemistry_tutor_1:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", chemistryTutor1.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.chemistry_tutor_2:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", chemistryTutor2.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.chemistry_tutor_3:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", chemistryTutor3.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
    private final View.OnClickListener onClickListener7 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.geografy_tutor_1:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", geographyTutor1.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.geografy_tutor_2:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", geographyTutor2.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.geografy_tutor_3:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", geographyTutor3.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
    private final View.OnClickListener onClickListener8 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.biology_tutor_1:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", biologyTutor1.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.biology_tutor_2:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", biologyTutor2.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.biology_tutor_3:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", biologyTutor3.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
    private final View.OnClickListener onClickListener9 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.history_tutor_1:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", historyTutor1.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.history_tutor_2:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", historyTutor2.getText().toString());
                    startActivity(intent);
                    break;
                case R.id.history_tutor_3:
                    intent = new Intent(tutors_list_activity.this, feedback_activity.class);
                    intent.putExtra("имя", historyTutor3.getText().toString());
                    startActivity(intent);
                    break;
            }
        }
    };
}

