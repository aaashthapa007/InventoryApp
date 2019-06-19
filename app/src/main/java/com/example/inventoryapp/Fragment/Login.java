package com.example.inventoryapp.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.inventoryapp.R;
import com.example.inventoryapp.models.Response;
import com.example.inventoryapp.models.User;

import Api.Url;
import Api.UserApi;
import retrofit2.Call;
import retrofit2.Callback;

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

                String email = editTextLoginEmail.getText().toString();
                String password = editTextLoginPassowrd.getText().toString();


                UserApi userApi = Url.getInstance().create(UserApi.class);
                Call<Response> responseCall = userApi.login(email,password);
                responseCall.enqueue(new Callback<Response>() {
                    @Override
                    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                        Toast.makeText(getContext(), "login Successful", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Response> call, Throwable t) {
                        Toast.makeText(getContext(), "Invalid"+t, Toast.LENGTH_SHORT).show();
                    }
                });


            }
        });

        return v;
    }

}
