package com.example.android.firebaselogin;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

public class MainActivity extends AppCompatActivity {

    String userMail,userPassword;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText mail = (EditText) findViewById(R.id.mail);
        EditText password = (EditText) findViewById(R.id.password);
        Button logIn = (Button) findViewById(R.id.login);
        Button signIn = (Button) findViewById(R.id.signin);
        firebaseAuth = FirebaseAuth.getInstance();

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userMail = mail.getText().toString();
                userPassword = mail.getText().toString();
                firebaseAuth.createUserWithEmailAndPassword(userMail,userPassword);
            }
        });
        
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userMail = mail.getText().toString();
                userPassword = mail.getText().toString();
                firebaseAuth.signInWithEmailAndPassword(userMail,userPassword);
            }
        });
    }
}
