/*
 * Full Name: Geerthan Kanthasamy
 * Student ID: 301033918
 * Section Number: 002
 */

package geerthan.kanthasamy.s301033918.ui.first;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import geerthan.kanthasamy.s301033918.CanvasView;
import geerthan.kanthasamy.s301033918.R;

public class GeerthanFragment extends Fragment {

    private GeerthanViewModel geerthanViewModel;
    private CanvasView customCanvas;
    private String paintColour;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        geerthanViewModel =
                ViewModelProviders.of(this).get(GeerthanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_first, container, false);

        Button clearCanvas = (Button)root.findViewById(R.id.geerthanClearBtn);
        customCanvas = root.findViewById(R.id.geerthanCanvas);

        clearCanvas.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                customCanvas.clearPath();
            }
        });

        Button updatePaint = (Button)root.findViewById(R.id.geerthanUpdateBtn);
        updatePaint.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

            }
        });

        return root;
    }

    public void clearCanvas(View view) //View view is required for android buttons etc.
    {
        customCanvas.clearPath();
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.geerthanBlackRB:
                if (checked)
                    paintColour = "BLACK";
                    break;
            case R.id.geerthanRedRB:
                if (checked)
                    paintColour = "RED";
                    break;
            case R.id.geerthanBlueRB:
                if (checked)
                    paintColour = "BLUE";
                break;
        }
    }
}