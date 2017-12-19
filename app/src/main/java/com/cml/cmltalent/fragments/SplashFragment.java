package com.cml.cmltalent.fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cml.cmltalent.MainActivity;
import com.cml.cmltalent.R;
import com.cml.cmltalent.base.BaseFragment;

/**
 * Created by chenmingliang on 2017/12/19.
 */

public class SplashFragment extends BaseFragment {


    public static SplashFragment newInstance(){
        return new SplashFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frament_splash,null);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(getActivity() instanceof MainActivity){
                    ((MainActivity) getActivity()).splashThingFinish();
                }
            }
        },2000);
    }



    public interface SplashThingFinish{
        void splashThingFinish();
    }
}
