package com.jsquad.android.myclass.Authentication;

public class LoginPresenter implements LoginContract.Presenter {

    /**
     * This should send the user's credentials to the server and receive a JSON response which
     * should be parceable into a ServerResponse object.
     *
     * It should check the login type (Username or email). If the login info is not valid, it
     * should call the appropriate error display method in the View.
     */
    @Override
    public void login(String email, String username) {

    }
}
