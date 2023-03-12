package nl.bbenning.bricklink.acl.api.response

import nl.bbenning.bricklink.acl.api.model.Color

class ColorsResponse(statusCode: Int) : BrickLinkResponse<List<Color>>(statusCode) {
}