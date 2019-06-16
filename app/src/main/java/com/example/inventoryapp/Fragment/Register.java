package com.example.inventoryapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.inventoryapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Register extends Fragment {

        // Required empty public constructor
        EditText EditTextFirstname, EditTextLastname, EditTextCompany, EditTextEmail, EditTextPassword;
        Button buttonRegister;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_register, container, false);
        EditTextFirstname = v.findViewById(R.id.registerEtFname);
        EditTextLastname = v.findViewById(R.id.registerEtLname);
        EditTextCompany = v.findViewById(R.id.registerEtComaanyName);
        EditTextEmail = v.findViewById(R.id.registerEtEmail);
        EditTextPassword = v.findViewById(R.id.registerEtPassword);
        buttonRegister = v.findViewById(R.id.registerBtnRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Firstname = EditTextFirstname.getText().toString();
                String Lastname = EditTextLastname.getText().toString();
                String CompanyName = EditTextCompany.getText().toString();
                String Email = EditTextEmail.getText().toString();
                String Password = EditTextPassword.getText().toString();

            }
        });
        
        
        return v;
        
    }

}
