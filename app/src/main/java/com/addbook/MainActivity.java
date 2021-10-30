package com.addbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit_title=findViewById(R.id.edit_title);
        final EditText edit_genre=findViewById(R.id.edit_genre);
        final EditText edit_write=findViewById(R.id.edit_write);
        Button btn = findViewById(R.id.btn_submit);
        DAOEmployee dao =new DAOEmployee();
        btn.setOnClickListener(v->
                {
                 Employee emp = new Employee(edit_title.getText().toString(),edit_genre.getText().toString(),
                         edit_write.getText().toString());
                 dao.add(emp).addOnSuccessListener(suc ->
                 {

                     Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
                }).addOnFailureListener(er ->
                         {
                             Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
                         }
                         );
                }

        );

    }
}