package com.example.gentingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.etebarian.meowbottomnavigation.MeowBottomNavigation

class MainActivity : AppCompatActivity() {

    private lateinit var meowBottomNavigation: MeowBottomNavigation;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meowBottomNavigation = findViewById<MeowBottomNavigation>(R.id.bottom_nav)

        //add item menu
        meowBottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.home));
        meowBottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.receipt));
        meowBottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.user));


        fun loadFragment(fragment: Fragment?) {
            if (fragment != null) {
                supportFragmentManager.beginTransaction().replace(R.id.frame_fragment, fragment).commit()
            }

        }
        meowBottomNavigation.setOnShowListener(MeowBottomNavigation.ShowListener (){
            fun onShowItem(item: MeowBottomNavigation.Model ) {
                var fragment: Fragment? = null

                when (item.id) {
                    2 -> fragment = ReceiptFragment()
                    3 -> fragment = ProfilFragment()

                }

            loadFragment (fragment)





                }

        })


    }
}