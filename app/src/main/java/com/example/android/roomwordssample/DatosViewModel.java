package com.example.android.roomwordssample;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

public class DatosViewModel extends AndroidViewModel {

    private MutableLiveData<Integer> numero;

    public DatosViewModel(@NonNull Application application) {
        super(application);
        this.numero = TestLiveData.getInstance().getNumero();

    }


    public void setNum(int num) {
        this.numero.postValue(num);
        //this.numero.setValue(num);
    }


    public MutableLiveData<Integer> getNumero() {
        return numero;
    }

    public void setNumero(MutableLiveData<Integer> numero) {
        this.numero = numero;
    }
}
