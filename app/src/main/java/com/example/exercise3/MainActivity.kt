package com.example.exercise3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnReset: Button = findViewById(R.id.buttonReset)
        btnReset.setOnClickListener { reset() }
        val btnCal:Button = findViewById(R.id.buttonCalculate)
        btnCal.setOnClickListener { calculate() }
        radioGroupGender.check(radioButtonMale.id)
    }

    private fun calculate(){
        val age: Spinner = findViewById(R.id.spinnerAge)
        val groupGender: RadioGroup = findViewById(R.id.radioGroupGender)
        val gender: RadioButton = findViewById(groupGender.checkedRadioButtonId)
        val smoker: CheckBox = findViewById(R.id.checkBoxSmoker)
        val result: TextView = findViewById(R.id.textViewPremium)

        when{
            age.selectedItemPosition == 0 -> result.text = "Life Insurance Premium: RM60"
            age.selectedItemPosition == 1 && gender == radioButtonFemale
                    && !smoker.isChecked -> result.text = "Life Insurance Premium: RM70"
            age.selectedItemPosition == 1 && gender == radioButtonMale
                    && !smoker.isChecked-> result.text = "Life Insurance Premium: RM120"
            age.selectedItemPosition == 1 && gender == radioButtonFemale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM170"
            age.selectedItemPosition == 1 && gender == radioButtonMale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM220"
            age.selectedItemPosition == 2 && gender == radioButtonFemale
                    && !smoker.isChecked -> result.text = "Life Insurance Premium: RM90"
            age.selectedItemPosition == 2 && gender == radioButtonMale
                    && !smoker.isChecked -> result.text = "Life Insurance Premium: RM190"
            age.selectedItemPosition == 2 && gender == radioButtonFemale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM240"
            age.selectedItemPosition == 2 && gender == radioButtonMale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM340"
            age.selectedItemPosition == 3 && gender == radioButtonFemale
                    && !smoker.isChecked -> result.text = "Life Insurance Premium: RM120"
            age.selectedItemPosition == 3 && gender == radioButtonMale
                    && !smoker.isChecked -> result.text = "Life Insurance Premium: RM270"
            age.selectedItemPosition == 3 && gender == radioButtonFemale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM320"
            age.selectedItemPosition == 3 && gender == radioButtonMale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM470"
            age.selectedItemPosition == 4 && gender == radioButtonFemale
                    && !smoker.isChecked -> result.text = "Life Insurance Premium: RM150"
            age.selectedItemPosition == 4 && gender == radioButtonMale
                    && !smoker.isChecked -> result.text = "Life Insurance Premium: RM350"
            age.selectedItemPosition == 4 && gender == radioButtonFemale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM400"
            age.selectedItemPosition == 4 && gender == radioButtonMale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM600"
            age.selectedItemPosition == 5 && gender == radioButtonFemale
                    && !smoker.isChecked -> result.text = "Life Insurance Premium: RM150"
            age.selectedItemPosition == 5 && gender == radioButtonMale
                    && !smoker.isChecked -> result.text = "Life Insurance Premium: RM350"
            age.selectedItemPosition == 5 && gender == radioButtonFemale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM450"
            age.selectedItemPosition == 5 && gender == radioButtonMale
                    && smoker.isChecked -> result.text = "Life Insurance Premium: RM650"
            else -> Toast.makeText(this, "Please complete the selections above", Toast.LENGTH_SHORT).show()
        }
    }

    private fun reset(){
        val age: Spinner = findViewById(R.id.spinnerAge)
        val groupGender: RadioGroup = findViewById(R.id.radioGroupGender)
        val gender: RadioButton = findViewById(groupGender.checkedRadioButtonId)
        val smoker: CheckBox = findViewById(R.id.checkBoxSmoker)
        val result: TextView = findViewById(R.id.textViewPremium)

        age.setSelection(-1)
        groupGender.clearCheck()
        smoker.setChecked(false)
        result.text = "Life Insurance Premium: -"
    }
}
