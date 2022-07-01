package com.example.a10119263_tugas2;

//IDENTITAS PENGERJAAN TUGAS :
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public enum ModelViewPage {
    RED(R.string.red, R.layout.onboardnya1),
    BLUE(R.string.blue, R.layout.onboardnya2),
    GREEN(R.string.green, R.layout.onboardnya3);

    private int mTitleResId;
    private int mLayoutResId;

    ModelViewPage(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }
}
