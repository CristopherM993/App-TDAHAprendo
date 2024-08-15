package com.example.tdahaprendo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class RegistrarUsuario extends AppCompatActivity {

    private EditText mEdittextNombre, mEdittextApellido, mEdittextCorreo, mEdittextPassword, mEdittextConfirmarPassword;
    private Button mBottonRegistrar;
    private TextView mRegresarLogin;
    private String name = "";
    private String apellido = "";
    private String email = "";
    private String password = "";
    private String conpassword = "";
    private ImageView mBtnGoogleAuth;
    FirebaseAuth mAuth;
    DatabaseReference mDatabase;
    private GoogleSignInClient mGoogleSignInClient;
    int RC_SIGN_IN = 1;
    String TAG = "GoogleSignInLoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mEdittextNombre = (EditText) findViewById(R.id.idNombreSignUp);
        mEdittextApellido = (EditText) findViewById(R.id.idApellidoSignUp);
        mEdittextCorreo = (EditText) findViewById(R.id.idCorreoSignUp);
        mEdittextPassword = (EditText) findViewById(R.id.idPasswordSignUp);
        mEdittextConfirmarPassword = (EditText) findViewById(R.id.idConPasswordSignUp);
        mBottonRegistrar = (Button) findViewById(R.id.btnRegistrarSignUp);
        mRegresarLogin = (TextView) findViewById(R.id.txtRegresarLogin);

        // Credenciaales para google
        mBtnGoogleAuth = (ImageView) findViewById(R.id.imgbtnGoogleSignUp);

        mBottonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = mEdittextNombre.getText().toString();
                apellido = mEdittextApellido.getText().toString();
                email = mEdittextCorreo.getText().toString();
                password = mEdittextPassword.getText().toString();
                conpassword = mEdittextConfirmarPassword.getText().toString();

                if(name.isEmpty() || apellido.isEmpty() || email.isEmpty() || password.isEmpty()|| conpassword.isEmpty()){
                    Toast.makeText(RegistrarUsuario.this, "Por favor completa todos los datos", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(conpassword)) {
                    Toast.makeText(RegistrarUsuario.this, "Las contraseñas no coinciden.", Toast.LENGTH_SHORT).show();
                }
                else{
                    RegistraNuevoUsuario();
                }
            }
        });

        mRegresarLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegistrarUsuario.this, IniciarSesion.class));
            }
        });

        mBtnGoogleAuth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignIn();
            }
        });

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this,gso);

    }
    private void SignIn(){
        Intent signIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signIntent, RC_SIGN_IN);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //Resultado devuelto al iniciar el Intent de GoogleSignInApi.getSignInIntent (...);
        // Result returned from launching the Intent from GoogleSignInApi.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            if (task.isSuccessful()) {
                try {
                    // Google Sign In was successful, authenticate with Firebase
                    GoogleSignInAccount account = task.getResult(ApiException.class);
                    Log.d(TAG, "firebaseAuthWithGoogle:" + account.getId());
                    firebaseAuthWithGoogle(account.getIdToken());
                } catch (ApiException e) {
                    // Google Sign In fallido, actualizar GUI
                    Log.w(TAG, "Google sign in failed", e);
                }
            } else {
                Log.d(TAG, "Error, login no exitoso:" + task.getException().toString());
                Toast.makeText(this, "Ocurrio un error. " + task.getException().toString(),
                        Toast.LENGTH_LONG).show();
            }
        }
    }

    private void firebaseAuthWithGoogle(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithCredential:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            //Iniciar DASHBOARD u otra actividad luego del SigIn Exitoso
                            Intent i = new Intent(RegistrarUsuario.this, Bienvenida.class);
                            startActivity(i);
                            RegistrarUsuario.this.finish();
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithCredential:failure", task.getException());
                        }
                    }
                });
    }

    private void RegistraNuevoUsuario(){

        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        String id = mAuth.getCurrentUser().getUid();
                        Map<String,Object> map = new HashMap<>();
                        map.put("name",name);
                        map.put("apellido", apellido);
                        map.put("email", email);
                        map.put("password", password);
                        map.put("conpassword", conpassword);

                        mDatabase.child("Usuarios").child(id).setValue(map).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task2) {
                                if(task2.isSuccessful()){
                                    startActivity(new Intent(RegistrarUsuario.this, IniciarSesion.class ));
                                    Toast.makeText(RegistrarUsuario.this, "Usuario creado exitosamente.", Toast.LENGTH_SHORT).show();
                                    finish();
                                } else{
                                    Toast.makeText(RegistrarUsuario.this, "No se pudieron crear los datos correctamente.", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }else{
                        Toast.makeText(RegistrarUsuario.this, "No se puede registrar a este usuario.", Toast.LENGTH_SHORT).show();
                    }
            }
        });
    }

    @Override
    protected void onStart() {
        FirebaseUser user = mAuth.getCurrentUser();
        if(user!=null){ //si no es null el usuario ya esta logueado
            //mover al usuario al dashboard
            Intent i = new Intent(RegistrarUsuario.this, Bienvenida.class);
            startActivity(i);
        }
        super.onStart();
    }


}
