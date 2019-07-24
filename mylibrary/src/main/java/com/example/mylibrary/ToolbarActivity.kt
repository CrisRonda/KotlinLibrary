package com.example.mylibrary

import androidx.appcompat.app.AppCompatActivity
import android.widget.Toolbar

open class ToolbarActivity : AppCompatActivity(), com.example.mylibrary.IToolbar {
    protected var _toolbar: Toolbar? = null
    override fun toolbarToLoad(toolbar: Toolbar?) {
        _toolbar = toolbar
        _toolbar?.let { setActionBar(toolbar) }
    }

    override fun enableHomeDisplay(value: Boolean) {
        actionBar?.setDisplayHomeAsUpEnabled(value)
    }


}

