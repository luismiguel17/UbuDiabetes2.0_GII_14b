package com.example.mario.gii_14b.tests;
import android.app.Activity;

import android.support.test.rule.ActivityTestRule;

import com.example.mario.gii_14b.R;
import com.tfg_gii14b.mario.interfaz.Perfil;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


import org.junit.Assert;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(JUnit4.class)

public class PerfilTest {


    @Rule
    public ActivityTestRule<Perfil> mActivityRule = new ActivityTestRule<Perfil>(
            Perfil.class);

    @Test
    public void clickBotonGuardar(){

    }

}
