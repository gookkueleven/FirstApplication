package astronautapp.firstapplication.fragment;

/**
 * Created by ratchsit.amo on 11/14/2016 AD.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import astronautapp.firstapplication.R;

public class OneFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_one, container, false);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.cashcard_50);
        return rootView;
    }
}
