package com.inhatc.android_final;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private Button btnJoin, btnLogin;
    private EditText edtEmail, edtPassword;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnJoin = findViewById(R.id.btnJoin);
        btnLogin = findViewById(R.id.btnLogin);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);

        firebaseAuth = firebaseAuth.getInstance();

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String email = edtEmail.getText().toString().trim();
                String pwd = edtPassword.getText().toString().trim();

                firebaseAuth.signInWithEmailAndPassword(edtEmail.getText().toString(), edtPassword.getText().toString())
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful()){
                                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                                    startActivity(intent);
                                } else {
                                    Toast.makeText(MainActivity.this, "이메일 또는 비밀번호를 확인해주세요.", Toast.LENGTH_LONG).show();
                                }
                            }
                        });
            }
        });

        btnJoin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String email = edtEmail.getText().toString().trim();
                String pwd = edtPassword.getText().toString().trim();

                firebaseAuth.createUserWithEmailAndPassword(edtEmail.getText().toString(), edtPassword.getText().toString())
                        .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if(task.isSuccessful())
                                    Toast.makeText(MainActivity.this, "회원가입이 성공적으로 이루어졌습니다.", Toast.LENGTH_LONG).show();
                                else
                                    Toast.makeText(MainActivity.this, "이메일 또는 비밀번호를 확인해주세요.", Toast.LENGTH_LONG).show();
                            }
                        });
            }
        });
    }
}