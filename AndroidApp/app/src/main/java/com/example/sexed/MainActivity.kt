package com.example.sexed

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.SearchView
import androidx.navigation.fragment.findNavController
import com.example.sexed.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding
    private lateinit var searchView: SearchView
    private lateinit var buttonClamidia: Button
    private lateinit var buttonGonorrea: Button
    private lateinit var buttonVPH: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        // Link layout elements
        /*searchView = findViewById(R.id.searchView)
        buttonClamidia = findViewById(R.id.buttonClamidia)
        buttonGonorrea = findViewById(R.id.buttonGonorrea)
        buttonVPH = findViewById(R.id.buttonVPH)*/

        // Set up listeners and other operations as needed
        //setupListeners()

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    /*private fun setupListeners() {
        // Set up a listener for the SearchView
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Logic when the search query is submitted
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // Logic when the search query text changes
                return true
            }
        })

        // Set up listeners for the buttons
        buttonClamidia.setOnClickListener {
            // Logic when the clamidia button is clicked
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }

        buttonGonorrea.setOnClickListener {
            // Logic when the gonorrea button is clicked
        }

        buttonVPH.setOnClickListener {
            // Logic when the VPH button is clicked
        }
    }*/

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}