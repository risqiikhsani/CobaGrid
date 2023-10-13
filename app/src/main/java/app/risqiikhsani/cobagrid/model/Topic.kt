package app.risqiikhsani.cobagrid.model


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val name: Int,
    val age: Int,
    @DrawableRes val imageRes: Int
)
