package com.cml.cmltalent;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

import com.cml.cmltalent.base.BaseFragment;
import com.cml.cmltalent.fragments.LoginFragment;
import com.cml.cmltalent.fragments.SplashFragment;
import com.cml.cmltalent.utils.DeviceUtil;
import com.cml.cmltalent.utils.LogUtil;

public class MainActivity extends AppCompatActivity implements SplashFragment.SplashThingFinish{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        replaceLayout(SplashFragment.newInstance());

    }

    private void replaceLayout(BaseFragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frameLayout_main, fragment);
        transaction.commit();
    }

    @Override
    public void splashThingFinish() {
        replaceLayout(LoginFragment.newInstance());
    }
}
