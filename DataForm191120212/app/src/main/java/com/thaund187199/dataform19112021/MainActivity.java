package com.thaund187199.dataform19112021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText editFullName;
    private EditText editNumber;
    private EditText editDOB;
    private EditText editGender;
    private EditText editAddress;
    private EditText editPhoneNumber;
    private EditText editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editFullName = findViewById(R.id.editFullName);
        editNumber = findViewById(R.id.editNumber);
        editDOB = findViewById(R.id.editDOB);
        editGender = findViewById(R.id.editGender);
        editPhoneNumber = findViewById(R.id.editPhoneNumber);
        editAddress = findViewById(R.id.editAddress);
        editEmail = findViewById(R.id.editEmail);
    }

    public void submit(View view) {
        boolean error = false;

        // Get Data
        String fullName = editFullName.getText().toString().trim();
        String number = editNumber.getText().toString().trim();
        String dob = editDOB.getText().toString().trim();
        String gender = editGender.getText().toString().trim();
        String phoneNumber = editPhoneNumber.getText().toString().trim();
        String address = editAddress.getText().toString().trim();
        String email = editEmail.getText().toString().trim();

        // FullName Empty
        if (TextUtils.isEmpty(fullName)) {
            editFullName.requestFocus();
            editFullName.setError(this.getResources().getString(R.string.error_field_required));
            error = true;
        }

        // User Number Empty
        if (TextUtils.isEmpty(number)) {
            editNumber.requestFocus();
            editNumber.setError(this.getResources().getString(R.string.error_field_required));
            error = true;
        }

        // User Dob Empty
        if (TextUtils.isEmpty(dob)) {
            editDOB.requestFocus();
            editDOB.setError(this.getResources().getString(R.string.error_field_required));
            error = true;
        }

        // Phone Number Empty
        if (TextUtils.isEmpty(phoneNumber)) {
            editPhoneNumber.requestFocus();
            editPhoneNumber.setError(this.getResources().getString(R.string.error_field_required));
            error = true;
        }

        // Email Empty
        if (TextUtils.isEmpty(email)) {
            editEmail.requestFocus();
            editEmail.setError(this.getResources().getString(R.string.error_field_required));
            error = true;
        }

        if (!error) {
            Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show();
        }
    }
}