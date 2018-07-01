package com.bukunmi.journalapp;


import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.bukunmi.journalapp.account.SignInActivity;
import com.bukunmi.journalapp.main.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class SignInTest {


    @Rule
    public ActivityTestRule<SignInActivity> mActivityRule =
            new ActivityTestRule(SignInActivity.class);


    @Test
    public void CheckAllViews(){


    }



}
