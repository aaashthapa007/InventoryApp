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
public class Register extends Fragment {

        // Required empty public constructor
        EditText EditTextUsername, EditTextEmail, EditTextPassword, EditTextAge, EditTextAddress;
        Button buttonRegister;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_register, container, false);
        EditTextUsername = v.findViewById(R.id.registerEtUname);
        EditTextEmail = v.findViewById(R.id.registerEtEmail);
        EditTextPassword = v.findViewById(R.id.registerEtPassword);
        EditTextAge = v.findViewById(R.id.registerEtAge);
        EditTextAddress = v.findViewById(R.id.registerEtAddress);

        buttonRegister = v.findViewById(R.id.registerBtnRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Username = EditTextUsername.getText().toString();
                String Email = EditTextEmail.getText().toString();
                String Password = EditTextPassword.getText().toString();
                String Age = EditTextAge.getText().toString();
                String Address = EditTextAddress.getText().toString();

                User user = new User(Username,Email,Password,Age,Address);
                UserApi userApi = Url.getInstance().create(UserApi.class);
                Call<Response> responseCall = userApi.register(user);
                responseCall.enqueue(new Callback<Response>() {
                    @Override
                    public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                        Toast.makeText(getContext(), "Registered", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(Call<Response> call, Throwable t) {
                        Toast.makeText(getContext(), "Error"+t, Toast.LENGTH_SHORT).show();

                    }
                });

            }
        });
        
        
        return v;
        
    }

}
