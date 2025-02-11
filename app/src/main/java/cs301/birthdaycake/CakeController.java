package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements CompoundButton.OnCheckedChangeListener, View.OnClickListener, SeekBar.OnSeekBarChangeListener
{
    private CakeView _cakeView;
    private CakeModel _cakeModel;

    public CakeController(CakeView cakeView)
    {
        _cakeView = cakeView;
        _cakeModel = _cakeView.getModel();
    }

    public void onClick(View view)
    {
        Log.d("cake", "click!");
        _cakeModel.candlesLit = false;
        _cakeView.invalidate();

    }

    //compoundbutton is the switch, b is whether or not it is true or false
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        _cakeModel.hasCandles = b;
        _cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        _cakeModel.numCandles = i;
        _cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
