package ca.juqe.juqe.voting

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ca.juqe.juqe.R
import io.freshworks.miscreen.utils.ActivityUtils

/**
 * Created by jferris on 16/07/17.
 *
 */
class VotingActivity : AppCompatActivity() {
    var mPresenter: VotingContract.Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generic)

        var fragment = supportFragmentManager.findFragmentById(R.id.main_layout)
                as VotingFragment?
        if(fragment == null) {
            fragment = VotingFragment()
            ActivityUtils.addFragmentToActivity(
                    supportFragmentManager, fragment, R.id.main_layout)
        }

        mPresenter = VotingPresenter(fragment)
    }


}