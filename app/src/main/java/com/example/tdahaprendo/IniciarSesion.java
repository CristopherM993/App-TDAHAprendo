package com.example.tdahaprendo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class IniciarSesion extends AppCompatActivity {

    // Referencias de las vistas
    private EditText mEditTextEmail;
    private EditText mEditTextPassword;
    private Button mBotonIniciarSesion;
    private Button mBotonRegistrarseLogin;

    // Variables para iniciar sesion
    private String email ="";
    private String password="";
    private FirebaseAuth mAtuh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        mAtuh = FirebaseAuth.getInstance();

        // Instanciar las vistas
        mEditTextEmail = (EditText) findViewById(R.id.idCorreoLogin);
        mEditTextPassword = (EditText) findViewById(R.id.idPasswordLogin);
        mBotonIniciarSesion = (Button) findViewById(R.id.btnIniciaSesionLogin);
        mBotonRegistrarseLogin = (Button) findViewById(R.id.btnRegistrarLogin);

        mBotonIniciarSesion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Los datos son iguales a los que ingresa el usuario
                email = mEditTextEmail.getText().toString();
                password = mEditTextPassword.getText().toString();

                if(!email.isEmpty()&&!password.isEmpty()){
                    LoginUser();
                }else {
                    Toast.makeText(IniciarSesion.this, "Ingresa tu correo o contraseña", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mBotonRegistrarseLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IniciarSesion.this, RegistrarUsuario.class);
                startActivity(intent);
            }
        });
    }
    private void LoginUser(){
        mAtuh.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    startActivity(new Intent(IniciarSesion.this, Bienvenida.class ));
                    finish();
                }else {
                    Toast.makeText(IniciarSesion.this, "No se pudo iniciar sesión, comprueba los datos.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}