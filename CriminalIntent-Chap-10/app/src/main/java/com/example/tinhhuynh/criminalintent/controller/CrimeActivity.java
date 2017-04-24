package com.example.tinhhuynh.criminalintent.controller;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    private static final String EXTRA_CRIME_ID = "com.example.tinhhuynh.criminalintent,.crime_id";
//    private static final String EXTRA_ITEM_POSTION = "com.example.tinhhuynh.criminalintent.item_position";

    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
//        intent.putExtra(EXTRA_ITEM_POSTION, position);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
//        int itemPosition =  getIntent().getIntExtra(EXTRA_ITEM_POSTION, -1);
        return CrimeFragment.newInstance(crimeId);
    }

}
