package ca.juqe.juqe.voting

import ca.juqe.juqe.BasePresenter
import ca.juqe.juqe.BaseView

/**
 * Created by jferris on 16/07/17.
 *
 */
interface VotingContract {

    interface Presenter: BasePresenter {

    }

    interface View: BaseView<Presenter> {

    }
}