package com.fuad7161.hello_world;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRegisterClick(View view){
        TextView txtFirstName = findViewById(R.id.textView);
        TextView txtEmail = findViewById(R.id.textView3);
        EditText edtTxtFirstName = findViewById(R.id.txtFirstName);
        EditText edtTxtlastName = findViewById(R.id.txtLastName);
        EditText edtTxtEmail = findViewById(R.id.txtEmail);

        txtFirstName.setText(edtTxtFirstName.getText().toString()+" "+edtTxtlastName.getText().toString());
        txtEmail.setText(edtTxtEmail.getText().toString());
    }
}
