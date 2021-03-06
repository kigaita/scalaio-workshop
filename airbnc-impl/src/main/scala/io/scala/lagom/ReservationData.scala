package io.scala.lagom

import java.time.LocalDate

import play.api.libs.json._

/**
  * hello-lagom
  */
case class ReservationData(accommodation: String,
                           guest: String,
                           host: String,
                           startingDate: LocalDate,
                           duration: Int)

object ReservationData {
  implicit val format: Format[ReservationData] = Json.format
}
