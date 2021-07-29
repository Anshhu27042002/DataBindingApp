package com.example.databindingapp;

public interface MainActivityContract  {


    public  interface Presenter{
        void onShowData(StudentData studentData);
    }

    public  interface  View{
        void ShowData(StudentData studentData);
    }
}
