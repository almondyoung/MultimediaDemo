package com.hugo.audiodemo;

import com.adajqd.audiodemo.base.MvpPresenter;
import com.adajqd.audiodemo.base.MvpView;



public class MainPresenter<V extends MvpView> implements MvpPresenter<V> {

    private V mMvpView;

    @Override public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }


    @Override public void startRecord() {

    }


    @Override public void stopRecord() {

    }


    @Override public void playRecord() {

    }

}
