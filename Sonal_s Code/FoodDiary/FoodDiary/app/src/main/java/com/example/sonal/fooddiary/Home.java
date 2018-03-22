package com.example.sonal.fooddiary;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void OpenDiary(View view)
    {
        Intent intent = new Intent(this, Diary.class);
        intent.putExtra("Main", "no");
        startActivityForResult(intent, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        switch (requestCode) {
            case 1:
                if(resultCode == Activity.RESULT_CANCELED)
                {

                }


        }
    }
}
