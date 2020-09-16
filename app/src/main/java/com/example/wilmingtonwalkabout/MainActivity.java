package com.example.wilmingtonwalkabout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
//    private LandmarkExpert expert = new LandmarkExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//    public void onClickLandmarks(View view) {
//
//        TextView landmarks = findViewById(R.id.info);
//        Spinner landmark = findViewById(R.id.landmark);
//        String landmarkOption = String.valueOf(landmark.getSelectedItem());
//
//        List<String> landmarkList = expert.getLandmarks(landmarkOption);
//        String my_list = "";
//        for(String info : landmarkList) {
//            my_list += info + '\n';
//        }
//
//        landmarks.setText(my_list);
//    }
//    public void MainActivity(View view){
//        Intent selection = new Intent(this,MainActivity.class);
//        startActivity(selection);
//    }
    public void DetailActivity(View view){
        Intent infoPage = new Intent(this,DetailActivity.class);
        startActivity(infoPage);
    }
}