package com.androidapp.buttonwinnerclass;

import android.view.View;

public class MyOnClickListener implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListener(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v){
        mainActivity.mTextView1.setText("You clicked CH's button!");
    }
}
