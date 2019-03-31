// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ AccelerateConfiguration => ScalaAccelerateConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ AccelerateConfiguration => JavaAccelerateConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object AccelerateConfigurationOps {

  implicit class ScalaAccelerateConfigurationOps(val self: ScalaAccelerateConfiguration) extends AnyVal {

    def toJava: JavaAccelerateConfiguration = {
      val result = JavaAccelerateConfiguration.builder()
      self.status.foreach { v =>
        import BucketAccelerateStatusOps._; result.status(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaAccelerateConfigurationOps(val self: JavaAccelerateConfiguration) extends AnyVal {

    def toScala: ScalaAccelerateConfiguration = {
      ScalaAccelerateConfiguration()
        .withStatus(Option(self.status).map { v =>
          import BucketAccelerateStatusOps._; v.toScala
        }) // String
    }

  }

}
