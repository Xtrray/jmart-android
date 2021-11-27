package com.ferdyJmartDR.jmart_android;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import com.ferdyJmartDR.jmart_android.request.RegisterRequest;
import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView nameRegister = findViewById(R.id.nameRegister);
        TextView emailRegister = findViewById(R.id.emailRegister);
        TextView passwordText = findViewById(R.id.passwordText);
        Button registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(v -> {
            Response.Listener<String> listener = response -> {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    if(jsonObject != null) {
                        Toast.makeText(RegisterActivity.this, "Register successful", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                    }
                } catch (JSONException err){
                    Toast.makeText(RegisterActivity.this, err.getMessage(), Toast.LENGTH_SHORT).show();
                }
            };
            Response.ErrorListener errorListener = response -> {
                Toast.makeText(RegisterActivity.this, response.getMessage(), Toast.LENGTH_SHORT).show();
            };
            String name = nameRegister.getText().toString();
            String email = emailRegister.getText().toString();
            String password = passwordText.getText().toString();
            RegisterRequest registerRequest = new RegisterRequest(name, email, password, listener, errorListener);
            RequestQueue requestQueue = Volley.newRequestQueue(RegisterActivity.this);
            requestQueue.add(registerRequest);

        });
    }
}