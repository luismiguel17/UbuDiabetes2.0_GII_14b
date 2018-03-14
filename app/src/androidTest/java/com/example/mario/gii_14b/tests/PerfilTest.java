package com.example.mario.gii_14b.tests;
import android.app.Activity;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.example.mario.gii_14b.R;
import com.tfg_gii14b.mario.interfaz.Perfil;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.doubleClick;
import static junit.framework.Assert.assertEquals;

import org.junit.Assert;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
@RunWith(AndroidJUnit4.class)
public class PerfilTest {
    //segura que la actividad especificada se crea antes de ejecutar cualquier prueba
    //definida en la clase.
    @Rule
    public ActivityTestRule<Perfil> mActivityRule = new ActivityTestRule<Perfil>(
            Perfil.class);

    @Test
    public void tv_PerfilDeUsuario(){
        String tvPerfilUssuario = "Perfil de Usuario";

        //onView(withId(R.id.et_id_nombre)).perform(typeText(""));
        //onView(withText(tvPerfilUssuario)).check(ViewAssertions.matches(isDisplayed()));
        Context appContext = InstrumentationRegistry.getTargetContext();

        System.out.println(appContext.getApplicationContext().toString());
        assertEquals("com.example.mario.gii_14b.tests", appContext.getPackageName());
    }

}
