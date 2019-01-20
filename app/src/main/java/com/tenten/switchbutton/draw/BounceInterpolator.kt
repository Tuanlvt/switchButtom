package com.tenten.switchbutton.draw

import android.view.animation.Interpolator

/**
 * Created by Tuanlvt on 1/20/19.
 */

class BounceInterpolator(private val amplitude: Double, private val frequency: Double) : Interpolator {
    override fun getInterpolation(time: Float): Float {
        return (-1 * Math.pow(Math.E, -time / amplitude) * Math.cos(frequency * time) + 1).toFloat()
    }
}
