package com.piedroid.redblood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.piedroid.redblood.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    String fullName, location, session, age, userName, blood, phone;
    FirebaseDatabase db;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fullName = binding.fullName.getText().toString();
                location = binding.location.getText().toString();
                session = binding.session.getText().toString();
                age = binding.age.getText().toString();
                userName = binding.userName.getText().toString();
                blood = binding.blood.getText().toString();
                phone = binding.phone.getText().toString();

                if (!fullName.isEmpty() && !location.isEmpty() && !session.isEmpty() && !age.isEmpty() && !userName.isEmpty() && !blood.isEmpty() && !phone.isEmpty()){

                    Users users = new Users(fullName,location,session,age,userName,blood,phone);
                    db = FirebaseDatabase.getInstance();
                    reference = db.getReference("Users");
                    reference.child(userName).setValue(users).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {

                            binding.fullName.setText("");
                            binding.location.setText("");
                            binding.session.setText("");
                            binding.age.setText("");
                            binding.userName.setText("");
                            binding.blood.setText("");
                            binding.phone.setText("");
                            Toast.makeText(MainActivity.this,"Successfuly Added to Database",Toast.LENGTH_SHORT).show();

                        }
                    });

                }

            }
        });
    }
}