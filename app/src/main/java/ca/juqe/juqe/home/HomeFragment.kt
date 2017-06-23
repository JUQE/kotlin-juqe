package ca.juqe.juqe.home

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ca.juqe.juqe.R

/**
 * Created by jferris on 22/06/17.
 *
 */
class HomeFragment: Fragment(), HomeContract.View {
    var mPresenter: HomeContract.Presenter? = null

    override fun setPresenter(presenter: HomeContract.Presenter) {
        mPresenter = presenter
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater!!.inflate(R.layout.fragment_home, container, false)

        return root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {

    }
}