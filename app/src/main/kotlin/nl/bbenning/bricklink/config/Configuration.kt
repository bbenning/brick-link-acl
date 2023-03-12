package nl.bbenning.bricklink.config

import org.apache.commons.configuration2.builder.fluent.Configurations
import java.io.File

object Configuration {
    private val configurations = Configurations()
    private val config = configurations.properties(File("application.properties"))

    val brickLinkOauthConsumerKey = config.getString("bricklink.oauth.consumer.key")
    val brickLinkOauthConsumerSecret = config.getString("bricklink.oauth.consumer.secret")
    val brickLinkOauthAccessTokenValue = config.getString("bricklink.oauth.access.tokenvalue")
    val brickLinkOauthAccessTokenSecret = config.getString("bricklink.oauth.access.tokensecret")
}