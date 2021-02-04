package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount =  0;
    private TextView mShowCount;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount != null) {
            if (mCount % 2 == 0)
                view.setBackgroundColor(Color.GREEN);
            else
                view.setBackgroundColor(Color.CYAN);
            if(mCount > 0)
            {
                Button btn = (Button) findViewById(R.id.button_zero);
                btn.setBackgroundColor(Color.MAGENTA);
            }


            mShowCount.setText(Integer.toString(mCount));


        }
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetCount(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));

        if(mCount == 0)
        {
            view.setBackgroundColor(Color.GRAY);
        }





    }
}
