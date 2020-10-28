/*
* Full Name: Geerthan Kanthasamy
* Student ID: 301033918
* Section Number: 002
*/

package geerthan.kanthasamy.s301033918.ui.second;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import geerthan.kanthasamy.s301033918.R;

public class KanthasamyFragment extends Fragment {

    private KanthasamyViewModel kanthasamyViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        kanthasamyViewModel =
                ViewModelProviders.of(this).get(KanthasamyViewModel.class);
        View root = inflater.inflate(R.layout.fragment_second, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        kanthasamyViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}