package models

import kotlin.js.Date

/**
 * Created by abel on 26/04/18.
 */

class User(val username: String) : Recommendation {
    var name: String? = null
    var pictureLocationUri: String? = null
    var biography: String? = null
    var email: String? = null
    var password: String? = null
    var birthDate: Date? = null
    var verifiedAccount = false
    var twitterAccount: String? = null
    var facebookAccount: String? = null
    var instagramAccount: String? = null
    var country: String? = null
    var admin: Boolean = false

    //TODO: El link devuelto ha de ser el que apunta a la misma playlist desde la interfaz web
    var shareLink: String = "http://155.210.13.105:8006/profile?user=$username"

    constructor(username: String, password: String) : this(username) {
        this.password = password
    }

    constructor(username: String, name: String, pictureLocationUri: String?, verifiedAccount: Boolean) : this(username) {
        this.name = name
        this.verifiedAccount = verifiedAccount
        this.pictureLocationUri = pictureLocationUri
    }

    constructor(username: String, name: String, pictureLocationUri: String?, verifiedAccount: Boolean,
                email: String?, biography: String?, birthDate: Date?) : this(username) {
        this.name = name
        this.email = email
        this.pictureLocationUri = pictureLocationUri
        this.verifiedAccount = verifiedAccount
        this.biography = biography
        this.birthDate = birthDate
    }

    constructor(username: String, name: String, pictureLocationUri: String?,
                email: String?, biography: String?, birthDate: Date?) : this(username) {
        this.name = name
        this.email = email
        this.pictureLocationUri = pictureLocationUri
        this.verifiedAccount = false
        this.biography = biography
        this.birthDate = birthDate
    }

    constructor(username: String, password: String, name: String, pictureLocationUri: String?,
                email: String?, biography: String?, birthDate: Date?) : this(username) {
        this.password = password
        this.name = name
        this.email = email
        this.pictureLocationUri = pictureLocationUri
        this.verifiedAccount = false
        this.biography = biography
        this.birthDate = birthDate
    }

    fun getTwitterAccountURL(): String? {
        return if (twitterAccount != null) "https://twitter.com/$twitterAccount"
        else null
    }

    fun getFacebookAccountURL(): String? {
        return if (facebookAccount != null) "https://www.facebook.com/$facebookAccount"
        else null
    }

    fun getInstagramAccountURL(): String? {
        return if (instagramAccount != null) "https://www.instagram.com/$instagramAccount"
        else null
    }
}