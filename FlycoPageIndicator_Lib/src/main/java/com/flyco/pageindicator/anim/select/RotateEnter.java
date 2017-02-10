package com.flyco.pageindicator.anim.select;

import android.animation.ObjectAnimator;
import android.view.View;

import com.flyco.pageindicator.anim.base.IndicatorBaseAnimator;


public class RotateEnter extends IndicatorBaseAnimator {
    public RotateEnter() {
        this.duration = 250;
    }

    public void setAnimation(View view) {
        this.animatorSet.playTogether(ObjectAnimator.ofFloat(view, "rotation", 0, 180));
    }
}
