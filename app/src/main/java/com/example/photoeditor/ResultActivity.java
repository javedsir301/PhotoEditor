package com.example.photoeditor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.photoeditor.databinding.ActivityResultBinding;

import java.util.Objects;

public class ResultActivity extends AppCompatActivity {
    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Objects.requireNonNull(getSupportActionBar()).hide();

        binding.imgResult.setImageURI(getIntent().getData());


    }
}