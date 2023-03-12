package nl.bbenning.bricklink.acl.api.request

import nl.bbenning.bricklink.acl.api.response.ColorsResponse

class ColorsRequest : BrickLinkRequest<ColorsResponse> {
    override val method: BrickLinkRequest.Method = BrickLinkRequest.Method.GET
    override val path: String = "colors"
    override val response: ColorsResponse
        get() = TODO("Not yet implemented")
}