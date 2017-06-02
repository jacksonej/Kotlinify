package `in`.jackz.kotlinify.adapters

import `in`.jackz.kotlinify.Cheeses
import `in`.jackz.kotlinify.R
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import java.util.*

/**
 * Created by jackson on 2/6/17.
 */
class Myadpter(var mDatas: ArrayList<String>, val listener : ()->Unit): RecyclerView.Adapter<Myadpter.ViewHolder>()
{

    class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        var mBoundString: String? = null
        val mImageView: ImageView
        val mTextView: TextView

        init {
            mImageView = mView.findViewById(R.id.avatar) as ImageView
            mTextView = mView.findViewById(android.R.id.text1) as TextView
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
      return mDatas.size
    }



    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.mBoundString = mDatas.get(position)
        holder?.mTextView?.text = mDatas.get(position)

        holder?.mView?.setOnClickListener { v ->
            listener()
        }

        Glide.with(holder?.mImageView?.context)
                .load(Cheeses.getRandomCheeseDrawable())
                .fitCenter()
                .into(holder?.mImageView)
    }

}