package cowan.brendan.malsearcher.Model.REST

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

/**
 * Created by user on 11/19/2017.
 */
@Root(name = "user", strict = false)
class MalAuthorizationResponse {
    @Element(name="id")
    val id : Int = 0

    @Element(name="username")
    val username : String = ""
}