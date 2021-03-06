package com.akolov.curri.service.user.domain

import com.fasterxml.jackson.core.`type`.TypeReference

object Codes extends Enumeration {
  type IdentityProvider = Value
  val FACEBOOK = Value("FACEBOOK")
  val GOOGLE = Value("GOOGLE")
}

class IdentityCodesType extends TypeReference[Codes.type]