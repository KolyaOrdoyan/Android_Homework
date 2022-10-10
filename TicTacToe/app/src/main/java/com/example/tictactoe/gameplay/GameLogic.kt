package com.example.tictactoe.gameplay

import android.content.Context
import android.renderscript.ScriptGroup.Binding
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.tictactoe.R

class GameLogic(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttr: Int,
    defStyleRes: Int
) : ConstraintLayout(context, attrs, defStyleAttr, defStyleRes) {


    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : this(
        context,
        attrs,
        defStyleAttr,
        0
    )

    constructor(context: Context, attrs: AttributeSet?) : this(context, attrs, 0)
    constructor(context: Context) : this(context, null)


    init {
        val inflater:LayoutInflater = LayoutInflater.from(context)
        inflater.inflate(R.layout.playing_field,this,true)

    }
}
