package com.intoverflown.friendlychat;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

public class MyButtonObserver implements TextWatcher {

    private final Button mButton;

    public MyButtonObserver(Button button) {
        this.mButton = button;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        mButton.setEnabled(charSequence.toString().trim().length() > 0);
    }

    @Override
    public void afterTextChanged(Editable editable) {
    }

}
