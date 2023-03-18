package nl.bbenning.bricklink.api.response

import kotlinx.serialization.Serializable

@Serializable
data class Meta (val code: Int, val description: String?, val message: String?)
