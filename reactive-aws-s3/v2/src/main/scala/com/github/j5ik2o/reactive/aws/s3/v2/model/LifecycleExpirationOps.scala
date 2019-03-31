// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ LifecycleExpiration => ScalaLifecycleExpiration, _ }
import software.amazon.awssdk.services.s3.model.{ LifecycleExpiration => JavaLifecycleExpiration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LifecycleExpirationOps {

  implicit class ScalaLifecycleExpirationOps(val self: ScalaLifecycleExpiration) extends AnyVal {

    def toJava: JavaLifecycleExpiration = {
      val result = JavaLifecycleExpiration.builder()
      self.date.foreach(v => result.date(v))                                                               // Instant
      self.days.map(_.intValue).foreach(v => result.days(v))                                               // Int
      self.expiredObjectDeleteMarker.map(_.booleanValue).foreach(v => result.expiredObjectDeleteMarker(v)) // Boolean

      result.build()
    }

  }

  implicit class JavaLifecycleExpirationOps(val self: JavaLifecycleExpiration) extends AnyVal {

    def toScala: ScalaLifecycleExpiration = {
      ScalaLifecycleExpiration()
        .withDate(Option(self.date)) // Instant
        .withDays(Option(self.days).map(_.intValue)) // Int
        .withExpiredObjectDeleteMarker(Option(self.expiredObjectDeleteMarker).map(_.booleanValue)) // Boolean
    }

  }

}
