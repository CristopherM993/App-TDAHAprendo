package com.example.tdahaprendo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class Bienvenida extends AppCompatActivity {

    private ImageButton mBottonCerrarSesion, mProfesionales, mGuiaPaterna, mJuegoss , mRelajate, mImgVCursos;
    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    private TextView mBienvendax;
    private Button mEmpiezaAventura;
    private ImageView mInfo;
    private ImageView mProfileImagen;
    public Uri imageUri;
    private FirebaseStorage storage;
    private StorageReference storageReference;
    private GoogleSignInClient mGoogleSignInClient;
    private GoogleSignInOptions gso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        storage = FirebaseStorage.getInstance();
        storageReference = storage.getReference();

        mBienvendax = findViewById(R.id.txtBienvenida);
        mBottonCerrarSesion = findViewById(R.id.btnCerrarSesion);
        mEmpiezaAventura = findViewById(R.id.btnEmpiezaAventura);
        mInfo = findViewById(R.id.ImgVInfo);
        mProfileImagen = findViewById(R.id.profile_image);
        mProfesionales = findViewById(R.id.btnProfesionales);
        mGuiaPaterna = findViewById(R.id.imgBtn_GuiaPaterna);
        mJuegoss = findViewById(R.id.imgBtn_juegos);
        mRelajate = findViewById(R.id.imgBtn_Relajate);
        mImgVCursos = findViewById(R.id.ImgVCursos);

        ObtenerUsuario();
        MuestraImagen();

        mImgVCursos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bienvenida.this, AprenderCursos.class));
            }
        });

        mJuegoss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bienvenida.this, JuegoDeMemoria.class));
            }
        });

        mRelajate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bienvenida.this, ActividadesDash.class));
            }
        });


        mGuiaPaterna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bienvenida.this, GuiaPaterna.class));
            }
        });

        mProfileImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChoosePicture();
            }
        });

        mProfesionales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bienvenida.this, ProfesionalesTdah.class));
            }
        });

        mBottonCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
//                startActivity(new Intent(Bienvenida.this, IniciarSesion.class));
//                finish();
                mGoogleSignInClient.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if(task.isSuccessful()){
                            Intent i = new Intent(getApplicationContext(), IniciarSesion.class);
                            startActivity(i);
                            Bienvenida.this.finish();
                        }else{
                            Toast.makeText(getApplicationContext(), "No se pudo cerrar sesión con google", Toast.LENGTH_LONG).show();
                        }
                    }

                });
            }
        });

        mEmpiezaAventura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bienvenida.this, DashboardMain.class));
            }
        });

        mInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Bienvenida.this, InfoPanel.class));
            }
        });

        //Configurar las gso para google signIn con el fin de luego desloguear de google
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail() .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
    }

    private void ChoosePicture() {
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(intent,1);
    }

    private void MuestraImagen(){
        String id = mAuth.getCurrentUser().getUid();
        StorageReference imageref = storageReference.child("images/"+id.toString());

        long MAXBYTES = 1024*1024;
        imageref.getBytes(MAXBYTES).addOnSuccessListener(new OnSuccessListener<byte[]>() {
            @Override
            public void onSuccess(byte[] bytes) {
                Bitmap bitmap = BitmapFactory.decodeByteArray(bytes,0,bytes.length);
                mProfileImagen.setImageBitmap(bitmap);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "Selecciona una imagen de perfil.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1 && resultCode==RESULT_OK && data!= null && data.getData()!=null){
            imageUri = data.getData();
            mProfileImagen.setImageURI(imageUri);
            uploadPicture();
        }
    }
    private void uploadPicture() {
        final ProgressDialog pd = new ProgressDialog(this);
        pd.setTitle("Actualizando imagen...");
        pd.show();

        // final String randonKey = UUID.randomUUID().toString();
        String id = mAuth.getCurrentUser().getUid();
        StorageReference riversRef = storageReference.child("images/"+id.toString());

        riversRef.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                pd.dismiss();
                Snackbar.make(findViewById(android.R.id.content), "Imagen actualizada", Snackbar.LENGTH_LONG).show();

            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                pd.dismiss();
                Toast.makeText(getApplicationContext(), "Error al subir la imagen.", Toast.LENGTH_SHORT).show();
            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot taskSnapshot) {
                double progressPercent = (100.00 * taskSnapshot.getBytesTransferred() / taskSnapshot.getTotalByteCount());
                pd.setMessage("Progreso:" + (int) progressPercent+"%");
            }
        });
    }

    private void ObtenerUsuario(){
        // obtener el id del usuario que inicia la sesion

        String id = mAuth.getCurrentUser().getUid();
        mDatabase.child("Usuarios").child(id).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    String mame = snapshot.child("name").getValue().toString();
                    mBienvendax.setText("¡Bienvenid@ " + mame + "!");
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });
    }

}