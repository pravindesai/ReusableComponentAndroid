package com.example.reusablecomponebt;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Itemlayout extends LinearLayout implements View.OnClickListener{
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);

        return true;
    }

    private static final String TAG = "*itemLayout";
    private TextView textView;
    private Button button;
    private int count;
    public Itemlayout(Context context) {
        super(context);
        init(context);
    }

    public Itemlayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
//        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        inflater.inflate(R.layout.item_layout, this);

        LayoutInflater.from(context).inflate(R.layout.item_layout,this);


        textView = findViewById(R.id.textView);
        button =   findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    void displayText(String str){
        this.textView.setText(str);
    }

    @Override
    public void onClick(View v) {
        count++;
        textView.setText(""+count);
        Log.e(TAG, "onClick: " );
    }
}
