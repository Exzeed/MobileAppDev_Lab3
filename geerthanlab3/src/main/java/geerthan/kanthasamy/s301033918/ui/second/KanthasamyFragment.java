/*
* Full Name: Geerthan Kanthasamy
* Student ID: 301033918
* Section Number: 002
*/

package geerthan.kanthasamy.s301033918.ui.second;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import geerthan.kanthasamy.s301033918.R;

public class KanthasamyFragment extends Fragment {

    private KanthasamyViewModel kanthasamyViewModel;
    AnimationDrawable animation = null;
    int duration = 250;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        kanthasamyViewModel =
                ViewModelProviders.of(this).get(KanthasamyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_second, container, false);

        final Button startButton = (Button) root.findViewById(R.id.geerthanStartBtn);
        startButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startAnimation();
            }
        });

        // Handle Stop Button
        final Button stopButton = (Button) root.findViewById(R.id.geerthanStopBtn);
        stopButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                stopAnimation();
            }
        });

        RadioButton slow = (RadioButton) root.findViewById(R.id.geerthanSlowRB);
        RadioButton normal = (RadioButton) root.findViewById(R.id.geerthanNormalRB);
        RadioButton fast = (RadioButton) root.findViewById(R.id.geerthanFastRB);
        RadioButton turbo = (RadioButton) root.findViewById(R.id.geerthanTurboRB);

        slow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                duration = 500;
            }
        });

        normal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                duration = 250;
            }
        });

        fast.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                duration = 100;
            }
        });

        turbo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                duration = 50;
            }
        });

        //RadioGroup radio = (RadioGroup) root.findViewById(R.id.geerthanSpeedRG);
        //if(radio.getCheckedRadioButtonId() == 0){duration = 500;}
        //if(radio.getCheckedRadioButtonId() == 1){duration = 250;}
        //else if(radio.getCheckedRadioButtonId() == 0){duration = 500;}

        return root;
    }

    private void startAnimation()
    {
        ImageView img = (ImageView) getActivity().findViewById(R.id.geerthanAnimIV);

        BitmapDrawable frame1 = (BitmapDrawable)getResources().getDrawable(R.drawable.run1);
        BitmapDrawable frame2 = (BitmapDrawable)getResources().getDrawable(R.drawable.run2);
        BitmapDrawable frame3 = (BitmapDrawable)getResources().getDrawable(R.drawable.run3);
        BitmapDrawable frame4 = (BitmapDrawable)getResources().getDrawable(R.drawable.run4);
        BitmapDrawable frame5 = (BitmapDrawable)getResources().getDrawable(R.drawable.run5);
        BitmapDrawable frame6 = (BitmapDrawable)getResources().getDrawable(R.drawable.run6);
        BitmapDrawable frame7 = (BitmapDrawable)getResources().getDrawable(R.drawable.run7);
        BitmapDrawable frame8 = (BitmapDrawable)getResources().getDrawable(R.drawable.run8);

        animation = new AnimationDrawable();
        animation.setOneShot(false);	// loop continuously
        animation.addFrame(frame1, duration);
        animation.addFrame(frame2, duration);
        animation.addFrame(frame3, duration);
        animation.addFrame(frame4, duration);
        animation.addFrame(frame5, duration);
        animation.addFrame(frame6, duration);
        animation.addFrame(frame6, duration);
        animation.addFrame(frame6, duration);

        img.setBackground(animation);

        animation.setVisible(true,true);
        animation.start();
    }

    private void stopAnimation()
    {
        animation.stop();
        animation.setVisible(false,false);
    }
}
