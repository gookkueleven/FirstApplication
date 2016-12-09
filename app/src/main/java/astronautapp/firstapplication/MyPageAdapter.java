package astronautapp.firstapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import astronautapp.firstapplication.fragment.OneFragment;
import astronautapp.firstapplication.fragment.ThreeFragment;
import astronautapp.firstapplication.fragment.TwoFragment;

/**
 * Created by ratchsit.amo on 11/14/2016 AD.
 */

public class MyPageAdapter extends FragmentPagerAdapter {

    private final int PAGE_NUMBER = 3;

    public MyPageAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return PAGE_NUMBER;
    }

    public Fragment getItem(int position) {
        if (position == 0){
            return new OneFragment();
        }else if(position == 1){
            return new TwoFragment();
        }else if(position == 2){
            return new ThreeFragment();
        }
        return null;
    }

}
