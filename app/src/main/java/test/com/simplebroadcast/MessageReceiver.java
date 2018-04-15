package test.com.simplebroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
//        Toast.makeText(context, "Обнаружено сообщение: " +
//                        intent.getStringExtra("ru.alexanderklimov.broadcast.Message"),
//                Toast.LENGTH_LONG).show();
        if (intent.getAction().equalsIgnoreCase("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            String message = "Обнаружено сообщение "
                    + intent.getAction();

            Toast.makeText(context, message,
                    Toast.LENGTH_LONG).show();
        }

        if (intent.getAction().equalsIgnoreCase("android.intent.action.ACTION_POWER_CONNECTED")) {
            String message = "Обнаружено сообщение "
                    + intent.getAction();

            Toast.makeText(context, message,
                    Toast.LENGTH_LONG).show();
        }

        if (intent.getAction().equalsIgnoreCase("ru.alexanderklimov.action.CAT")) {
            Toast.makeText(context, "Обнаружено сообщение: " +
                            intent.getStringExtra("ru.alexanderklimov.broadcast.Message"),
                    Toast.LENGTH_LONG).show();
        }
    }
}
