package com.example.teamaltf4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InformationTab extends AppCompatActivity {

    private EditText chemNameEdt, appDateEdt, areaSprayedEdt, regNumEdt;
    private Button addFormBtn, readFormBtn;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_tab);

        chemNameEdt = findViewById(R.id.idEnterChemName);
        appDateEdt = findViewById(R.id.idEnterDate);
        areaSprayedEdt = findViewById(R.id.idEnterAreaSprayed);
        regNumEdt = findViewById(R.id.idEnterRegisterNum);
        addFormBtn = findViewById(R.id.idBtnAddForm);
        readFormBtn = findViewById(R.id.idBtnReadForm);

        dbHandler = new DBHandler(InformationTab.this);

        addFormBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String chemName = chemNameEdt.getText().toString();
                String appDate = appDateEdt.getText().toString();
                String areaSprayed = areaSprayedEdt.getText().toString();
                String regNum = regNumEdt.getText().toString();

                if (chemName.isEmpty() && appDate.isEmpty() && areaSprayed.isEmpty() && regNum.isEmpty()) {
                    Toast.makeText(InformationTab.this, "Please enter all data..", Toast.LENGTH_SHORT).show();
                    return;
                }

                dbHandler.addNewForm(chemName, appDate, areaSprayed, regNum);

                Toast.makeText(InformationTab.this, "Form has been added", Toast.LENGTH_SHORT).show();
            }
        });

        readFormBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(InformationTab.this, ViewForm.class);
                startActivity(i);
            }
        });
    }
}
