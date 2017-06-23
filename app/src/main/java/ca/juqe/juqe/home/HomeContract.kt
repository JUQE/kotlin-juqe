package ca.juqe.juqe.home

import ca.juqe.juqe.BasePresenter
import ca.juqe.juqe.BaseView

/**
 * Created by jferris on 22/06/17.
 *
 */
interface HomeContract {

    interface Presenter: BasePresenter {

    }

    interface View: BaseView<Presenter> {

    }
}