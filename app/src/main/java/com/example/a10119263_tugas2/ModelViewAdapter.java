package com.example.a10119263_tugas2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.viewpager.widget.PagerAdapter;

//IDENTITAS PENGERJAAN TUGAS :
//Nim     : 10119263
//Nama    : Ridwan Ramadhan
//Kelas   : IF-7

public class ModelViewAdapter extends PagerAdapter {
    private Context mContext;

    public ModelViewAdapter(Context context) {
        mContext = context;
    }

    @Override
    public Object instantiateItem(ViewGroup collection, int position) {
        com.example.a10119263_tugas2.ModelViewPage modelObject = com.example.a10119263_tugas2.ModelViewPage.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelObject.getLayoutResId(), collection, false);
        collection.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(ViewGroup collection, int position, Object view) {
        collection.removeView((View) view);
    }

    @Override
    public int getCount() {
        return com.example.a10119263_tugas2.ModelViewPage.values().length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        com.example.a10119263_tugas2.ModelViewPage customPagerEnum = com.example.a10119263_tugas2.ModelViewPage.values()[position];
        return mContext.getString(customPagerEnum.getTitleResId());
    }
}
