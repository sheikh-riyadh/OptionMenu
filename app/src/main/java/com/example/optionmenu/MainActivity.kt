package com.example.optionmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        menuInflater.inflate(R.menu.option_menu,menu)  // inflate our menu from menu directory
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId.equals(R.id.about_ID)){ // Check condition from our menu item id
            Toast.makeText(this,"About Clicked",Toast.LENGTH_SHORT).show()
            return true
        }
        else if (item.itemId.equals(R.id.contact_ID)){ // Check condition from our menu item id
            Toast.makeText(this,"Contact Clicked",Toast.LENGTH_SHORT).show()
            return true
        }

        else{
            Toast.makeText(this,"Share Clicked",Toast.LENGTH_SHORT).show()
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
