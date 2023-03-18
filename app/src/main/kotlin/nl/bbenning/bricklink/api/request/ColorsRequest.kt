package nl.bbenning.bricklink.api.request

import nl.bbenning.bricklink.api.response.ColorsResponse

class ColorsRequest : BrickLinkRequest<ColorsResponse> {
    override val method: BrickLinkRequest.Method = BrickLinkRequest.Method.GET
    override val path: String = "colors"
    override val response: ColorsResponse
        get() = TODO("Not yet implemented")
}