package ca.juqe.juqe.home

/**
 * Created by jferris on 22/06/17.
 *
 */
class HomePresenter(val mView: HomeContract.View): HomeContract.Presenter {

    init {
        checkNotNull(mView)
        mView.setPresenter(this)
    }

}