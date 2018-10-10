package com.example.wolverine.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void result(View view) {
        score = 0;
        score += Question_one();
        score += Question_two();
        score += Question_three();
        score += Question_four();
        score += Question_five();
        score += Question_six();

        Toast.makeText(this,"your score = "+score+"/6",Toast.LENGTH_LONG).show();

    }



    // 1st Question
    public int Question_one() {
        RadioButton Radio_yes = (RadioButton)findViewById(R.id.yes_radio_button);
        boolean yes = Radio_yes.isChecked();

        RadioButton Radio_no = (RadioButton)findViewById(R.id.no_radio_button);
        boolean no = Radio_no.isChecked();

        if(no)
            return 1;
        else
            return 0;
    }

    // 2nd Question
    public int Question_two() {
        RadioButton pique = (RadioButton)findViewById(R.id.pique_1);
        boolean piqueChecked = pique.isChecked();

        RadioButton ramos = (RadioButton)findViewById(R.id.ramos_2);
        boolean ramosChecked = ramos.isChecked();

        RadioButton messi = (RadioButton)findViewById(R.id.messi_3);
        boolean messiChecked = messi.isChecked();

        RadioButton ronaldo = (RadioButton)findViewById(R.id.ronaldo_4);
        boolean ronaldoChecked = ronaldo.isChecked();

        if(ramosChecked)
            return 1;
        else
            return 0;

    }

    // 3rd Question
    public int Question_three() {
        EditText quest_3 = (EditText)findViewById(R.id.ans_3_txt);
        String ans3 = quest_3.getText().toString();
        if(ans3.equalsIgnoreCase(""))
            return 0;
        if(Integer.parseInt(ans3) == 11)
            return 1;
        else
            return 0;
    }

    // 4th Question
    public int Question_four() {
        EditText quest_4 = (EditText)findViewById(R.id.ans_4_txt);
        String ans4 = quest_4.getText().toString();
        if(ans4.equalsIgnoreCase("mo salah") || ans4.equalsIgnoreCase("mohamed salah") || ans4.equalsIgnoreCase("salah"))
            return 1;
        else
            return 0;
    }

    // 5th Question
    public int Question_five(){
        CheckBox mahmoud = (CheckBox)findViewById(R.id.checkbox_5_1);
        boolean mahmoudChecked = mahmoud.isChecked();

        CheckBox mansour = (CheckBox)findViewById(R.id.checkbox_5_2);
        boolean mansourChecked = mansour.isChecked();

        CheckBox mahfouz = (CheckBox)findViewById(R.id.checkbox_5_3);
        boolean mahfouzChecked = mahfouz.isChecked();

        CheckBox zewail = (CheckBox)findViewById(R.id.checkbox_5_4);
        boolean zewailChecked = zewail.isChecked();

        if(zewailChecked && mahfouzChecked && !mansourChecked && !mahmoudChecked)
            return 1;
        else
            return 0;
    }

    // 6th Question
    private int Question_six() {
        CheckBox lighthouse = (CheckBox)findViewById(R.id.checkbox_6_1);
        boolean lighthouseChecked = lighthouse.isChecked();

        CheckBox colossus = (CheckBox)findViewById(R.id.checkbox_6_2);
        boolean colossusChecked = colossus.isChecked();

        CheckBox zeus = (CheckBox)findViewById(R.id.checkbox_6_3);
        boolean zeusChecked = zeus.isChecked();

        CheckBox pyramid = (CheckBox)findViewById(R.id.checkbox_6_4);
        boolean pyramidChecked = pyramid.isChecked();

        if(lighthouseChecked && pyramidChecked && !zeusChecked && !colossusChecked)
            return 1;
        else
            return 0;
    }
}
