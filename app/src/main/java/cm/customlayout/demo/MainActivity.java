package cm.customlayout.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import me.hhhaiai.customlayout.CRelativeLayout;

public class MainActivity extends Activity {
    private static final String TAG = "MainActivity";
    private CRelativeLayout mLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mLayout = new CRelativeLayout(this, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case 1:
                        Log.i(TAG, "click one");
                        break;
                    default:
                        break;
                }
            }
        }, 4, 30);
        setContentView(mLayout);
    }
}