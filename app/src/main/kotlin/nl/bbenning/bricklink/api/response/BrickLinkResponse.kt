package nl.bbenning.bricklink.api.response

interface BrickLinkResponse<T> {
    val meta: Meta
    val data: T
}