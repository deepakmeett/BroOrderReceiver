package com.example.broorderreceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
public class OrderReceiver2 extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int resultCode = getResultCode();
        String resultData = getResultData();
        Bundle resultExtra = getResultExtras( true);
        String stringExtra = resultExtra.getString( "stringExtra" );

        resultCode++;
        stringExtra += "->OR2";

        String toastText = "OR2\n"+
                           "resultCode: " + resultCode + "\n" +
                           "resultData: " + resultData + "\n" +
                           "stringExtra: " + stringExtra;

        Toast.makeText( context, toastText, Toast.LENGTH_SHORT ).show();

        resultData = "OR2";
        resultExtra.putString( "stringExtra", stringExtra );

        setResult( resultCode, resultData, resultExtra );    }
}
