// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LifecycleRuleBuilderOps(val self: LifecycleRule.Builder) extends AnyVal {

  final def expirationAsScala(value: Option[LifecycleExpiration]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  } // LifecycleExpiration

  final def idAsScala(value: Option[String]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def prefixAsScala(value: Option[String]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  } // String

  final def filterAsScala(value: Option[LifecycleRuleFilter]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  } // LifecycleRuleFilter

  final def statusAsScala(value: Option[ExpirationStatus]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  } // ExpirationStatus

  final def transitionsAsScala(value: Option[Seq[Transition]]): LifecycleRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.transitions(v.asJava)
    } // Seq[Transition]
  }

  final def noncurrentVersionTransitionsAsScala(
      value: Option[Seq[NoncurrentVersionTransition]]
  ): LifecycleRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.noncurrentVersionTransitions(v.asJava)
    } // Seq[NoncurrentVersionTransition]
  }

  final def noncurrentVersionExpirationAsScala(value: Option[NoncurrentVersionExpiration]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.noncurrentVersionExpiration(v)
    }
  } // NoncurrentVersionExpiration

  final def abortIncompleteMultipartUploadAsScala(
      value: Option[AbortIncompleteMultipartUpload]
  ): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.abortIncompleteMultipartUpload(v)
    }
  } // AbortIncompleteMultipartUpload

}

final class LifecycleRuleOps(val self: LifecycleRule) extends AnyVal {

  final def expirationAsScala: Option[LifecycleExpiration] = Option(self.expiration) // LifecycleExpiration

  final def idAsScala: Option[String] = Option(self.id) // String

  final def prefixAsScala: Option[String] = Option(self.prefix) // String

  final def filterAsScala: Option[LifecycleRuleFilter] = Option(self.filter) // LifecycleRuleFilter

  final def statusAsScala: Option[ExpirationStatus] = Option(self.status) // ExpirationStatus

  final def transitionsAsScala: Option[Seq[Transition]] = Option(self.transitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Transition]

  final def noncurrentVersionTransitionsAsScala: Option[Seq[NoncurrentVersionTransition]] =
    Option(self.noncurrentVersionTransitions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    } // Seq[NoncurrentVersionTransition]

  final def noncurrentVersionExpirationAsScala: Option[NoncurrentVersionExpiration] =
    Option(self.noncurrentVersionExpiration) // NoncurrentVersionExpiration

  final def abortIncompleteMultipartUploadAsScala: Option[AbortIncompleteMultipartUpload] =
    Option(self.abortIncompleteMultipartUpload) // AbortIncompleteMultipartUpload

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecycleRuleOps {

  implicit def toLifecycleRuleBuilderOps(v: LifecycleRule.Builder): LifecycleRuleBuilderOps =
    new LifecycleRuleBuilderOps(v)

  implicit def toLifecycleRuleOps(v: LifecycleRule): LifecycleRuleOps = new LifecycleRuleOps(v)

}
