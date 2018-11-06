package cl.nygma.keyproject.model

import java.io.Serializable

/**
 * Created by Camilo Jorquera on 29-10-18
 */
data class Users(var id: String? = null,
                 var email: String? = null,
                 var password: String? = null,
                 var name: String? = null) : Serializable