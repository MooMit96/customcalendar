package kr.co.mit.customcalendar;

import android.content.Context;
import android.widget.Toast;

public class TestClass {
    Context context;

    public void TestClass(Context context){
        this.context = context;
    }

    public void hi(){
        Toast.makeText(context,"hihi",Toast.LENGTH_SHORT).show();
    }
}
