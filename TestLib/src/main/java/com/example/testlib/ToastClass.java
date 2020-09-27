package com.example.testlib;

import android.content.Context;
import android.widget.Toast;

public class ToastClass {
    public void showMyToast(Context context, String message) {

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
