// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import com.github.j5ik2o.reactive.aws.s3.model.{ LoggingEnabled => ScalaLoggingEnabled, _ }
import software.amazon.awssdk.services.s3.model.{ LoggingEnabled => JavaLoggingEnabled }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object LoggingEnabledOps {

  implicit class ScalaLoggingEnabledOps(val self: ScalaLoggingEnabled) extends AnyVal {

    def toJava: JavaLoggingEnabled = {
      val result = JavaLoggingEnabled.builder()
      self.targetBucket.filter(_.nonEmpty).foreach(v => result.targetBucket(v)) // String
      self.targetGrants.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, TargetGrantOps._; result.targetGrants(v.map(_.toJava).asJava)
      } // Seq[TargetGrant]
      self.targetPrefix.filter(_.nonEmpty).foreach(v => result.targetPrefix(v)) // String

      result.build()
    }

  }

  implicit class JavaLoggingEnabledOps(val self: JavaLoggingEnabled) extends AnyVal {

    def toScala: ScalaLoggingEnabled = {
      ScalaLoggingEnabled()
        .withTargetBucket(Option(self.targetBucket)) // String
        .withTargetGrants(Option(self.targetGrants).map { v =>
          import scala.collection.JavaConverters._, TargetGrantOps._; v.asScala.map(_.toScala)
        }) // Seq[TargetGrant]
        .withTargetPrefix(Option(self.targetPrefix)) // String
    }

  }

}
