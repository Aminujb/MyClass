package com.jsquad.android.myclass.Authentication;

interface LoginContract {

    interface View {

        void grantAccess();

        void displayEmailError(String errorMessage);

        void displayPasswordError(String errorMessage);

    }

    interface Presenter {

        void login(String email, String username);
    }
}
