package nl.bbenning.bricklink.api.response

import kotlinx.serialization.Serializable
import nl.bbenning.bricklink.api.model.Color

@Serializable
data class ColorsResponse(override val meta: Meta, override val data: List<Color>) : BrickLinkResponse<List<Color>>
