package nl.bbenning.bricklink.api.request

import nl.bbenning.bricklink.api.response.BrickLinkResponse

interface BrickLinkRequest<T: BrickLinkResponse<*>>  {
    enum class Method { GET, POST, PUT, DELETE }

    val method: Method
    val path: String
    val response: T
}