package ru.malinoil.application;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText idText;
    private EditText contactText;
    private EditText phoneText;
    private EditText emailText;
    private EditText usernameText;
    private EditText passwordText;
    private Button btnSubmit;
    private TextView btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_main);

        initViews();
        btnSubmit.setOnClickListener(v -> {
            Toast.makeText(this, "Пользователь " + usernameText.getText() + " успешно добавлен", Toast.LENGTH_LONG).show();
        });

        btnClear.setOnClickListener(v -> {
            clearFields();
        });

    }

    private void initViews() {
        idText = (EditText) findViewById(R.id.field_id);
        contactText = (EditText) findViewById(R.id.field_contact);
        phoneText = (EditText) findViewById(R.id.field_phone);
        emailText = (EditText) findViewById(R.id.field_email);
        usernameText = (EditText) findViewById(R.id.field_username);
        passwordText = (EditText) findViewById(R.id.field_password);

        btnSubmit = (Button) findViewById(R.id.btn_submit);
        btnClear = (TextView) findViewById(R.id.btn_clear);
    }

    private void clearFields() {
        idText.setText("");
        contactText.setText("");
        phoneText.setText("");
        emailText.setText("");
        usernameText.setText("");
        passwordText.setText("");
    }
}