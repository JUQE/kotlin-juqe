package ca.juqe.juqe.voting

import android.support.v4.app.Fragment

/**
 * Created by jferris on 16/07/17.
 *
 */
class VotingFragment: Fragment(), VotingContract.View {
    var mPresenter: VotingContract.Presenter? = null

    override fun setPresenter(presenter: VotingContract.Presenter) {
        mPresenter = presenter
    }
}