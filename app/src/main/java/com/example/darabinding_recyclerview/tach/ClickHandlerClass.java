package com.example.darabinding_recyclerview.tach;

import android.util.Log;

import com.example.darabinding_recyclerview.data.Clone;
import com.example.darabinding_recyclerview.tach.ClickHalderClassInterfase;
import com.example.darabinding_recyclerview.tach.ClickHandler;

public class ClickHandlerClass implements ClickHalderClassInterfase {

    public ClickHandlerClass() {

    }

    @Override
    public void onClickBatton(Clone clone) {

        if (clone != null) {
            Log.e(this.getClass().getSimpleName(), " " + new Throwable().getStackTrace()[0].getMethodName() + "  " + Thread.currentThread().getName() + " " + System.currentTimeMillis());
            Log.e("", clone.toString());
        }
    }


}
