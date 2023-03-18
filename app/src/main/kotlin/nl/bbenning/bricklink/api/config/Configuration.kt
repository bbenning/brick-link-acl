package nl.bbenning.bricklink.api.config

import org.apache.commons.configuration2.builder.fluent.Configurations
import java.io.File

object Configuration {
    private val configurations = Configurations()
    private val config = configurations.properties(File("application.properties"))

    val brickLinkOauthConsumerKey: String = config.getString("bricklink.oauth.consumer.key")
    val brickLinkOauthConsumerSecret: String = config.getString("bricklink.oauth.consumer.secret")
    val brickLinkOauthAccessTokenValue: String = config.getString("bricklink.oauth.access.tokenvalue")
    val brickLinkOauthAccessTokenSecret: String = config.getString("bricklink.oauth.access.tokensecret")
}