package id.co.coconutdev.beemoovee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.DEBUG
import androidx.fragment.app.Fragment
import id.co.coconutdev.beemoovee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val homeFragment=HomeFragment()
        val favoriteFragment=FavoriteFragment()
        val profileFragment=ProfileFragment()

        setCurrentFragment(homeFragment)

        activityMainBinding.bottomNavigation.setOnNavigationItemSelectedListener {
            Log.d("id", it.itemId.toString())
            when(it.itemId){
                R.id.menu_home->setCurrentFragment(homeFragment)
                R.id.menu_favorite->setCurrentFragment(favoriteFragment)
                R.id.menu_profile->setCurrentFragment(profileFragment)
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(activityMainBinding.framelayout.id,fragment)
            commit()
        }
}