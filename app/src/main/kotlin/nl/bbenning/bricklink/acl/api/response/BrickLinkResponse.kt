package nl.bbenning.bricklink.acl.api.response
abstract class BrickLinkResponse<T>(val statusCode: Int, val message: String? = null) {
}