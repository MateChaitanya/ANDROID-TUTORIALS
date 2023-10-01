package com.example.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String CHANNEL_ID = "MY_CHANNEL";

    private static final int NOTIFICATION_ID = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a Bitmap object for the large icon (you need to provide a valid image)
        Bitmap largerIcon = null; // Set the largerIcon to a valid Bitmap

        // Get a reference to the NotificationManager
        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // Create a notification channel for Android Oreo and above
            NotificationChannel channel = new NotificationChannel(
                    CHANNEL_ID,
                    "New Channel",
                    NotificationManager.IMPORTANCE_HIGH
            );
            nm.createNotificationChannel(channel);
        }

        // Build the notification
        Notification notification = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notification = new Notification.Builder(this, CHANNEL_ID)
                    .setLargeIcon(largerIcon)
                    .setSmallIcon(R.drawable.baseline_notifications_24)
                    .setContentTitle("New Message")
                    .setContentText("New Message From raman")
                    .setSubText("This is the subtext")
                    .build();
        }

        // Notify using the NotificationManager
        nm.notify(NOTIFICATION_ID, notification);
    }
}
