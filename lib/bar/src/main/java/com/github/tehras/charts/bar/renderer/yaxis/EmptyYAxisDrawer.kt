package com.github.tehras.charts.bar.renderer.yaxis

import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.drawscope.DrawScope

class EmptyYAxisDrawer :YAxisDrawer {

    override fun drawAxisLine(drawScope: DrawScope, canvas: Canvas, drawableArea: Rect) {

    }

    override fun drawAxisLabels(
        drawScope: DrawScope,
        canvas: Canvas,
        drawableArea: Rect,
        minValue: Float,
        maxValue: Float) {

    }
}