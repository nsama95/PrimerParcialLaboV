package com.example.primerparciallabov;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class UserController  implements View.OnClickListener {
    private Activity activity;
    private UserModel model;
    private UserView view;

    public UserController(Activity activity, UserModel model) {
        this.activity = activity;
        this.model = model;
    }

    public void setView(UserView view) {
        this.view = view;


    }

    @Override
    public void onClick(View v) {

    }
}
