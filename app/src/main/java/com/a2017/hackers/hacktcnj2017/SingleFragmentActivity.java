package com.a2017.hackers.hacktcnj2017;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by user on 2/25/2017.
 */
public abstract class SingleFragmentActivity extends AppCompatActivity {


    public abstract Fragment createFragment();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_layout_generic);
        FragmentManager fg = getSupportFragmentManager();
        Fragment fragment = fg.findFragmentById(R.id.fragment_layout_generic);


        if(fragment == null){

            fragment = createFragment();
            fg.beginTransaction().add(R.id.fragment_layout_generic, fragment)
                    .commit();
        }


    }
}
