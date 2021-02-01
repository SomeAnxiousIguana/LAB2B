package com.example.lab2b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView)findViewById(R.id.fact);
        mButton = (Button)findViewById(R.id.but);

        showRandomOption();

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showRandomOption();
            }
        });
    }
    public void showRandomOption(){
        shuffleFacts();
        mTextView.setText(optionArray[0].getmOptions());
    }

    Options f01 = new Options("you get knocked out");
    Options f02 = new Options("you go somewhere else");
    Options f03 = new Options("you find a dead man");
    Options f04 = new Options("you meet a buxom blonde");
    Options f05 = new Options("someone has searched the place");
    Options f06 = new Options("a crooked cop warns you");
    Options f07 = new Options("you are arrested");
    Options f08 = new Options("you find a frayed rope");
    Options f09 = new Options("a bullet whizzes past your ear!");
    Options f10 = new Options("you are almost run over!");
    Options f11 = new Options("you are being followed");
    Options f12 = new Options("you smell familiar perfume");
    Options f13 = new Options("the telephone rings");
    Options f14 = new Options("there is a knock at the door");
    Options f15 = new Options("you hear footsteps behind you ...");
    Options f16 = new Options("you hear a scream!");
    Options f17 = new Options("you sense you are not alone ...");
    Options f18 = new Options("... forget this story, it stinks!");

    Options [] optionArray = new Options[]{
            f01, f02, f03, f04, f05, f06, f07, f08, f09, f10, f11, f12, f13, f14, f15, f16, f17, f18
    };
    public void shuffleFacts(){
        Collections.shuffle(Arrays.asList(optionArray));
    }
}