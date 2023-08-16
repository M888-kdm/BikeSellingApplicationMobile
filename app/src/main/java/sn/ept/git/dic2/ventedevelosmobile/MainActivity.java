package sn.ept.git.dic2.ventedevelosmobile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;

import java.io.File;

import sn.ept.git.dic2.ventedevelosmobile.database.AppDatabase;

public class MainActivity extends AppCompatActivity {
    public static AppDatabase appDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}