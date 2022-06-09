package store.dide.cifravet.ui.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.DialogFragment
import com.bumptech.glide.Glide
import store.dide.cifravet.R

class AlertDialogStart : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        getDialog()!!.getWindow()?.setBackgroundDrawableResource(R.drawable.alertcorners);
        val view = inflater.inflate(R.layout.alert_tip, container, false)
        val imageview = view.findViewById<ImageView>(R.id.image_alert_tip)
        val buttonClose = view.findViewById<Button>(R.id.button_alert_tip_close)
        Glide.with(view).load(R.drawable.animation_checknfc).into(imageview)
        buttonClose.setOnClickListener(){
            dialog!!.dismiss()
        }
        return view
    }

    override fun onStart() {
        super.onStart()
//        val width = (resources.displayMetrics.widthPixels * 0.85).toInt()
////        val height = (resources.displayMetrics.heightPixels * 0.40).toInt()
//        val height = (resources.displayMetrics.heightPixels * 0.9).toInt()
//        dialog!!.window?.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
    }
}