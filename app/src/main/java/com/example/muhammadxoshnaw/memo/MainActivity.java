package com.example.muhammadxoshnaw.memo;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.muhammadxoshnaw.memo.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    MemoAdapter memoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        memoAdapter = new MemoAdapter(new ArrayList<Memo>());
        binding.contentMain.memoRv.setAdapter(memoAdapter);
        binding.contentMain.memoRv.setLayoutManager(new LinearLayoutManager(this));
        binding.contentMain.memoRv.setHasFixedSize(true);
        setupUI();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddMemoActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setupUI() {
    }
}
