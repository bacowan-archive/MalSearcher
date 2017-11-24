package cowan.brendan.malsearcher.Model

import java.net.URL

/**
 * Created by user on 11/5/2017.
 */
class DefaultUrlReader : UrlReader {
    override fun read(url: String): String {
        return URL(url).readText()
    }
}