package com.techloyce.sdk;

import android.content.Context;
import android.widget.Toast;

public class Toasty {
    public static void SimpleToast(Context C, String S){
        Toast.makeText(C, S, Toast.LENGTH_SHORT).show();

    }
}
