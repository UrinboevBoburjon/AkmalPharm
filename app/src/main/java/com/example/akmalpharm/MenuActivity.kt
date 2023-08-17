package com.example.akmalpharm

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
class MenuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val homeFragment = HomeFragment()
        val notificationFragment = NotificationFragment()
        val shopFragment = ShopFragment()
        val profileFragment = ProfileFragment()
        val mapsFragment = MapsFragment()

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        replaceFragment(homeFragment)

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.homeFragment->replaceFragment(homeFragment)
                R.id.notificationFragment->replaceFragment(notificationFragment)
                R.id.shopFragment->replaceFragment(shopFragment)
                R.id.profileFragment->replaceFragment(profileFragment)
                R.id.mapsFragment->replaceFragment(mapsFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainerView,fragment)
        transaction.commit()
    }
}