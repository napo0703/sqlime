package net.nikezono.sqlime;

import android.content.Context;
import net.nikezono.sqlime.softkeyboard.R;


/**
 * Created by nikezono on 2015/02/20.
 */
public class SpecialKeyCode {

    public static int KEYCODE_TOGGLE_LETTERCASE;
    public static int KEYCODE_MOVE_CARET_LEFT;
    public static int KEYCODE_MOVE_CARET_RIGHT;
    public static int KEYCODE_CHANGE_JAPANESE_INPUT_MODE;

    public static void initialize(Context context) {
        KEYCODE_TOGGLE_LETTERCASE = context.getResources().getInteger(R.integer.keycode_toggle_lettercase);
        KEYCODE_MOVE_CARET_LEFT = context.getResources().getInteger(R.integer.keycode_move_caret_left);
        KEYCODE_MOVE_CARET_RIGHT = context.getResources().getInteger(R.integer.keycode_move_caret_right);
        KEYCODE_CHANGE_JAPANESE_INPUT_MODE = context.getResources().getInteger(R.integer.keycode_change_japanese_input_mode);
    }
}
