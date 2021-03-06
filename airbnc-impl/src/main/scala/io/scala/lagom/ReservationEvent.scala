package io.scala.lagom

import com.lightbend.lagom.scaladsl.persistence.{AggregateEvent, AggregateEventTag}
import play.api.libs.json.{Format, Json}

/**
  * hello-lagom
  */
sealed trait ReservationEvent extends AggregateEvent[ReservationEvent] {
  override val aggregateTag = ReservationEvent.Tag
}

object ReservationEvent {
  val Tag: AggregateEventTag[ReservationEvent] =
    AggregateEventTag[ReservationEvent]
}

case class ReservationRequested(reservationData: ReservationData)
  extends ReservationEvent

object ReservationRequested {
  implicit val format: Format[ReservationRequested] = Json.format
}

case class ReservationRejected(reservationData: ReservationData)
  extends ReservationEvent

object ReservationRejected {
  implicit val format: Format[ReservationRejected] = Json.format
}

case class ReservationConfirmed(reservationData: ReservationData)
  extends ReservationEvent

object ReservationConfirmed {
  implicit val format: Format[ReservationConfirmed] = Json.format
}

case class ReservationCancelled(reservationData: ReservationData)
  extends ReservationEvent

object ReservationCancelled {
  implicit val format: Format[ReservationCancelled] = Json.format
}
