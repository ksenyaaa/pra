package com.example.practice2

import android.app.TaskStackBuilder
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.practice2.databinding.ActivityFragmentBinding

class MainFragmentActivity : AppCompatActivity() {

    private var controller: NavController? = null
    private var binding: ActivityFragmentBinding? = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = ActivityFragmentBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }

        controller = (supportFragmentManager.findFragmentById(R.id.container) as
        NavHostFragment).navController

    }


    override fun onBackPressed() {
        super.onBackPressed()
        controller?.navigateUp()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}