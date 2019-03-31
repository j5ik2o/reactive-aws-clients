// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ NoncurrentVersionExpiration => ScalaNoncurrentVersionExpiration, _ }
import software.amazon.awssdk.services.s3.model.{ NoncurrentVersionExpiration => JavaNoncurrentVersionExpiration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object NoncurrentVersionExpirationOps {

  implicit class ScalaNoncurrentVersionExpirationOps(val self: ScalaNoncurrentVersionExpiration) extends AnyVal {

    def toJava: JavaNoncurrentVersionExpiration = {
      val result = JavaNoncurrentVersionExpiration.builder()
      self.noncurrentDays.map(_.intValue).foreach(v => result.noncurrentDays(v)) // Int

      result.build()
    }

  }

  implicit class JavaNoncurrentVersionExpirationOps(val self: JavaNoncurrentVersionExpiration) extends AnyVal {

    def toScala: ScalaNoncurrentVersionExpiration = {
      ScalaNoncurrentVersionExpiration()
        .withNoncurrentDays(Option(self.noncurrentDays).map(_.intValue)) // Int
    }

  }

}
