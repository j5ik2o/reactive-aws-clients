// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.v2.model

import com.github.j5ik2o.reactive.aws.s3.model.{ VersioningConfiguration => ScalaVersioningConfiguration, _ }
import software.amazon.awssdk.services.s3.model.{ VersioningConfiguration => JavaVersioningConfiguration }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object VersioningConfigurationOps {

  implicit class ScalaVersioningConfigurationOps(val self: ScalaVersioningConfiguration) extends AnyVal {

    def toJava: JavaVersioningConfiguration = {
      val result = JavaVersioningConfiguration.builder()
      self.mfaDelete.foreach { v =>
        import MFADeleteOps._; result.mfaDelete(v.toJava)
      } // String
      self.status.foreach { v =>
        import BucketVersioningStatusOps._; result.status(v.toJava)
      } // String

      result.build()
    }

  }

  implicit class JavaVersioningConfigurationOps(val self: JavaVersioningConfiguration) extends AnyVal {

    def toScala: ScalaVersioningConfiguration = {
      ScalaVersioningConfiguration()
        .withMfaDelete(Option(self.mfaDelete).map { v =>
          import MFADeleteOps._; v.toScala
        }) // String
        .withStatus(Option(self.status).map { v =>
          import BucketVersioningStatusOps._; v.toScala
        }) // String
    }

  }

}
