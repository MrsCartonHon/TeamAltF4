    package com.example.teamaltf4;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

    public class ViewForm extends AppCompatActivity {

    private ArrayList<FormModel> formModelArrayList;
    private DBHandler dbHandler;
    private FormRVAdapter formRVAdapter;
    private RecyclerView formRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_form);

        formModelArrayList = new ArrayList<>();
        dbHandler = new DBHandler(ViewForm.this);

        formModelArrayList = dbHandler.readForm();

        formRVAdapter = new FormRVAdapter(formModelArrayList, ViewForm.this);
        formRV = findViewById(R.id.idRVCourses);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ViewForm.this, RecyclerView.VERTICAL, false);
        formRV.setLayoutManager(linearLayoutManager);

        formRV.setAdapter(formRVAdapter);
    }
}