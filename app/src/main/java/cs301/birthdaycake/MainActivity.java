package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView fib = findViewById(R.id.cakeview);
        CakeController remote = new CakeController(fib);

        Button blowOut = findViewById(R.id.blowoutbutton);
        //setOnClickListener takes a CakeController parameter
        blowOut.setOnClickListener(remote);

        CompoundButton switchie = findViewById(R.id.candels);
        switchie.setOnCheckedChangeListener(remote);

        SeekBar candleBar = findViewById(R.id.howManyCandles);
        candleBar.setOnSeekBarChangeListener(remote);
    }

    public void goodbye(View button)
    {
        Log.i("button", "Goodbye");
        finishAffinity();
    }

}
