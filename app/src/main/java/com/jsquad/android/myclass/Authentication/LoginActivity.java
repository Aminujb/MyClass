package com.jsquad.android.myclass.Authentication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.jsquad.android.myclass.R;
import com.jsquad.android.myclass.Util.ActivityUtils;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActivityUtils.hostFragment(getSupportFragmentManager(), R.id.content_frame, new LoginFragment(), null);
    }
}
