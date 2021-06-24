package com.example.bottomnavbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.widget.PopupMenu;

import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavController navController = Navigation.findNavController(this, R.id.navHostFragment);
        NavigationUI.setupActionBarWithNavController(this, navController,
                new AppBarConfiguration.Builder(
                        R.id.homeFragment, R.id.contestFragment, R.id.profileFragment
                ).build()
        );

        SmoothBottomBar bottomBar = findViewById(R.id.bottomBar);
        PopupMenu popupMenu = new PopupMenu(this, null);
        popupMenu.inflate(R.menu.menu_bottom);
        bottomBar.setupWithNavController(popupMenu.getMenu(), navController);


    }

}