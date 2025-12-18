package com.example.sportactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.sportactivity.databinding.ActivityStepsBinding;

class StepsActivity: AppCompatActivity() {
    lateinitvarbindingClass: ActivityStepsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        bindingClass= ActivityStepsBinding.inflate(layoutInflater);
        setContentView(bindingClass.root);

    }
    fun onClickBrowserActivity(view: View){
        valintent = Intent(this, BrowserActivity::class.java)
        startActivity(intent);
    }
}
