package nl.bbenning.bricklink.api.model

import kotlinx.serialization.Serializable

@Serializable
data class Color(val colorId: Int, val colorName: String, val colorCode: String, val colorType: String)