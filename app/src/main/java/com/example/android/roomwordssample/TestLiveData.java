package com.example.android.roomwordssample;

import androidx.lifecycle.MutableLiveData;

public class TestLiveData {
    private static final TestLiveData ourInstance = new TestLiveData();
    private MutableLiveData<Integer> numero;

    public static TestLiveData getInstance() {
        //numero = new MutableLiveData<Integer>();
        return ourInstance;
    }

    private TestLiveData() {
    }

    public void setNumero(MutableLiveData<Integer> numero) {
        this.numero = numero;
    }


    public MutableLiveData<Integer> getNumero() {
        return numero;
    }
}
