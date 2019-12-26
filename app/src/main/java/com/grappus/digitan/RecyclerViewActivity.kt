package com.grappus.digitan

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.grappus.digitan.adapter.DemoRecyclerViewAdapter
import kotlinx.android.synthetic.main.layout_recycler.*

/**
 * Created by nimish@grappus.com on 23/12/2019.
 * Description -ø
 */

class RecyclerViewActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_recycler)

        recyclerView.apply {
            adapter = DemoRecyclerViewAdapter(
                myListener = ::cardClicked
            )
        }
    }

    private fun cardClicked(position: Int) {
        Toast.makeText(this, "card clicked at $position", Toast.LENGTH_SHORT).show()
    }

}