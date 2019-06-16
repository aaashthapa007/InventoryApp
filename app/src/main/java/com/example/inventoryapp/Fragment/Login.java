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
public class Login extends Fragment {
    EditText editTextLoginEmail, editTextLoginPassowrd;
    Button buttonLogin;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_login, container, false);

        editTextLoginEmail = v.findViewById(R.id.loginEtEmail);
        editTextLoginPassowrd = v.findViewById(R.id.loginEtPassword);
        buttonLogin = v.findViewById(R.id.loginBtnLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Lemail = editTextLoginEmail.getText().toString();
                String Lpassword = editTextLoginPassowrd.getText().toString();

            }
        });

        return v;
    }

}
