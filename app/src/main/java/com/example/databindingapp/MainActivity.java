package com.example.databindingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.example.databindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity  implements MainActivityContract.View{

    private Object StudentData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 1 = Adding Dependency

        // Step 2 = Creating Layout With Data Binding Configuration

        // Step 3 = Assigning Variables to widgets

        // Step 4 = Creating the model class which is named as : StudendData

        // Step 5 = Creating Main Activity Presenter activity in order to present data

        // Step 6 = Creating Main Activity Contract Interfaces

        // Step 7 = Adding the code in main activity and display the correct widgets

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        MainActivityPresenter mainActivityPresenter = new MainActivityPresenter(this,getApplicationContext());
        StudentData studentData = new StudentData("Student Grade","10");
        binding.setGrader(studentData);
        binding.setPresenter(mainActivityPresenter);
    }

    @Override
    public void ShowData(StudentData studentData) {
        String grade= studentData.getGrade();
        Toast.makeText(this, grade , Toast.LENGTH_SHORT).show();
    }
}