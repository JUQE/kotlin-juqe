package ca.juqe.juqe.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ca.juqe.juqe.R
import io.freshworks.miscreen.utils.ActivityUtils

/**
 * Created by jferris on 22/06/17.
 *
 */
class HomeActivity: AppCompatActivity() {
    var mPresenter: HomePresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic)

        var fragment: HomeFragment? = supportFragmentManager.findFragmentById(R.id.main_layout)
                as? HomeFragment
        if(fragment == null) {
            fragment = HomeFragment()
            ActivityUtils.addFragmentToActivity(
                    supportFragmentManager, fragment, R.id.main_layout)
        }

        mPresenter = HomePresenter(fragment)
    }
}