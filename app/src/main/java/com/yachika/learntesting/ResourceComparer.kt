package com.yachika.learntesting

import android.content.Context

class ResourceComparer {

    fun isEmpty(context: Context, res: Int, string: String): Boolean {
        return context.getString(res) == string
    }
}