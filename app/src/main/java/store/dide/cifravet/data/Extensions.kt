package store.dide.cifravet.data

import androidx.fragment.app.Fragment
import store.dide.cifravet.R
import store.dide.cifravet.ui.views.PinFragment

fun Fragment.openFragment(container: Int, fragment: Fragment) {
    val manager = activity?.supportFragmentManager
    val transaction = manager?.beginTransaction()
    transaction?.replace(container, fragment)
    transaction?.commit()
}