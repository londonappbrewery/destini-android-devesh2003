package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button button_1;
    Button button_2;
    TextView story;
    int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        button_1 = (Button)findViewById(R.id.buttonTop);
        button_2 = (Button)findViewById(R.id.buttonBottom);
        story = (TextView) findViewById(R.id.storyTextView);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mStoryIndex = 3;
            setStory();
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             mStoryIndex = 2;
             setStory();
            }
        });
    }

    public void setStory(){
        if(mStoryIndex == 3){
            story.setText(R.string.T3_Story);
            button_1.setText(R.string.T3_Ans1);
            button_2.setText(R.string.T3_Ans2);
        }
        if(mStoryIndex == 2){
            story.setText(R.string.T2_Story);
            button_1.setText(R.string.T2_Ans1);
            button_2.setText(R.string.T2_Ans2);
        }
        if(mStoryIndex == 4){
            story.setText(R.string.T4_End);
            button_1.setVisibility(View.GONE);
            button_2.setVisibility(View.GONE);
        }
        if(mStoryIndex == 5){
            story.setText(R.string.T5_End);
            button_1.setVisibility(View.GONE);
            button_2.setVisibility(View.GONE);
        }
        if(mStoryIndex == 6){
            story.setText(R.string.T6_End);
            button_1.setVisibility(View.GONE);
            button_2.setVisibility(View.GONE);
        }

        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(mStoryIndex == 3){
                mStoryIndex = 6;
            }
                if(mStoryIndex == 2){
                    mStoryIndex = 3;
                }
                setStory();
            }

        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 3){
                    mStoryIndex = 5;
                }
                if(mStoryIndex == 2){
                    mStoryIndex = 4;
                }
                if(mStoryIndex == 2){
                    mStoryIndex = 3;
                }
                setStory();
            }
        });
    }
}
