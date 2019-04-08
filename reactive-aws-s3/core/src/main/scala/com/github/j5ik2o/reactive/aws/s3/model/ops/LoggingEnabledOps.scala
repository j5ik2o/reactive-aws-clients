// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LoggingEnabledBuilderOps(val self: LoggingEnabled.Builder) extends AnyVal {

  final def targetBucketAsScala(value: Option[String]): LoggingEnabled.Builder = {
    value.fold(self) { v =>
      self.targetBucket(v)
    }
  } // String

  final def targetGrantsAsScala(value: Option[Seq[TargetGrant]]): LoggingEnabled.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.targetGrants(v.asJava)
    } // Seq[TargetGrant]
  }

  final def targetPrefixAsScala(value: Option[String]): LoggingEnabled.Builder = {
    value.fold(self) { v =>
      self.targetPrefix(v)
    }
  } // String

}

final class LoggingEnabledOps(val self: LoggingEnabled) extends AnyVal {

  final def targetBucketAsScala: Option[String] = Option(self.targetBucket) // String

  final def targetGrantsAsScala: Option[Seq[TargetGrant]] = Option(self.targetGrants).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[TargetGrant]

  final def targetPrefixAsScala: Option[String] = Option(self.targetPrefix) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLoggingEnabledOps {

  implicit def toLoggingEnabledBuilderOps(v: LoggingEnabled.Builder): LoggingEnabledBuilderOps =
    new LoggingEnabledBuilderOps(v)

  implicit def toLoggingEnabledOps(v: LoggingEnabled): LoggingEnabledOps = new LoggingEnabledOps(v)

}
