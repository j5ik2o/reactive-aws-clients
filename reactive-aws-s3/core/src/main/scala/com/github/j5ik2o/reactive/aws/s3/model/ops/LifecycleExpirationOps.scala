// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LifecycleExpirationBuilderOps(val self: LifecycleExpiration.Builder) extends AnyVal {

  final def withDateAsScala(value: Option[java.time.Instant]): LifecycleExpiration.Builder = {
    value.fold(self) { v =>
      self.date(v)
    }
  } // Instant

  final def withDaysAsScala(value: Option[Int]): LifecycleExpiration.Builder = {
    value.fold(self) { v =>
      self.days(v)
    }
  } // Int

  final def withExpiredObjectDeleteMarkerAsScala(value: Option[Boolean]): LifecycleExpiration.Builder = {
    value.fold(self) { v =>
      self.expiredObjectDeleteMarker(v)
    }
  } // Boolean

}

final class LifecycleExpirationOps(val self: LifecycleExpiration) extends AnyVal {

  final def dateAsScala: Option[java.time.Instant] = Option(self.date) // Instant

  final def daysAsScala: Option[Int] = Option(self.days) // Int

  final def expiredObjectDeleteMarkerAsScala: Option[Boolean] = Option(self.expiredObjectDeleteMarker) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecycleExpirationOps {

  implicit def toLifecycleExpirationBuilderOps(v: LifecycleExpiration.Builder): LifecycleExpirationBuilderOps =
    new LifecycleExpirationBuilderOps(v)

  implicit def toLifecycleExpirationOps(v: LifecycleExpiration): LifecycleExpirationOps = new LifecycleExpirationOps(v)

}
