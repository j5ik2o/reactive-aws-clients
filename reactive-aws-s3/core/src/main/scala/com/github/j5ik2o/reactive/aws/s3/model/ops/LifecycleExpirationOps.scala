// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LifecycleExpirationBuilderOps(val self: LifecycleExpiration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateAsScala(value: Option[java.time.Instant]): LifecycleExpiration.Builder = {
    value.fold(self) { v => self.date(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def daysAsScala(value: Option[Int]): LifecycleExpiration.Builder = {
    value.fold(self) { v => self.days(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiredObjectDeleteMarkerAsScala(value: Option[Boolean]): LifecycleExpiration.Builder = {
    value.fold(self) { v => self.expiredObjectDeleteMarker(v) }
  }

}

final class LifecycleExpirationOps(val self: LifecycleExpiration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dateAsScala: Option[java.time.Instant] = Option(self.date)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def daysAsScala: Option[Int] = Option(self.days)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expiredObjectDeleteMarkerAsScala: Option[Boolean] = Option(self.expiredObjectDeleteMarker)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecycleExpirationOps {

  implicit def toLifecycleExpirationBuilderOps(v: LifecycleExpiration.Builder): LifecycleExpirationBuilderOps =
    new LifecycleExpirationBuilderOps(v)

  implicit def toLifecycleExpirationOps(v: LifecycleExpiration): LifecycleExpirationOps = new LifecycleExpirationOps(v)

}
