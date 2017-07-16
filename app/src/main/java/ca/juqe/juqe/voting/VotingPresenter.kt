package ca.juqe.juqe.voting

/**
 * Created by jferris on 16/07/17.
 *
 */
class VotingPresenter(mView: VotingContract.View): VotingContract.Presenter {
    init {
        checkNotNull(mView)
        mView.setPresenter(this)
    }
}