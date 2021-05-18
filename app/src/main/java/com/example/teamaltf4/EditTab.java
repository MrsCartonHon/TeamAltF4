package com.example.teamaltf4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class EditTab extends AppCompatActivity {

    EditText editText;
    DBHandler myDB;
    Button btnAdd,btnView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tab);

        editText=(EditText)findViewById(R.id.editTextChem);
        btnAdd = (Button)findViewById(R.id.addChem);
        btnView = (Button)findViewById(R.id.viewChemList);
        myDB = new DBHandler(this);





        ImageButton HomeButton = (ImageButton) findViewById(R.id.homeIcon);
        HomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditTab.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }



    private void toastMessage(String message){
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }




}