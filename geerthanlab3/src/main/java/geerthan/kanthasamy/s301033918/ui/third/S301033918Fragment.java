/*
 * Full Name: Geerthan Kanthasamy
 * Student ID: 301033918
 * Section Number: 002
 */

package geerthan.kanthasamy.s301033918.ui.third;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import geerthan.kanthasamy.s301033918.R;

public class S301033918Fragment extends Fragment {

    private S301033918ViewModel s301033918ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        s301033918ViewModel =
                ViewModelProviders.of(this).get(S301033918ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_third, container, false);

        TextView firstName = (TextView) root.findViewById(R.id.geerthanFirstTV);
        Animation anim =  AnimationUtils.loadAnimation(getActivity(), R.anim.spin);
        firstName.startAnimation(anim);


        return root;
    }
}