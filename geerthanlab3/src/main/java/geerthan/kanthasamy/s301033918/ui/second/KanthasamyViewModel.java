/*
 * Full Name: Geerthan Kanthasamy
 * Student ID: 301033918
 * Section Number: 002
 */

package geerthan.kanthasamy.s301033918.ui.second;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KanthasamyViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KanthasamyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}