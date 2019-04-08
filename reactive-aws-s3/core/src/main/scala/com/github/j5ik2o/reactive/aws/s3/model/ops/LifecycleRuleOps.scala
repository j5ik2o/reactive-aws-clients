// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LifecycleRuleBuilderOps(val self: LifecycleRule.Builder) extends AnyVal {

  final def expirationAsScala(value: Option[LifecycleExpiration]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  }

  final def idAsScala(value: Option[String]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def prefixAsScala(value: Option[String]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.prefix(v)
    }
  }

  final def filterAsScala(value: Option[LifecycleRuleFilter]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

  final def statusAsScala(value: Option[ExpirationStatus]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def transitionsAsScala(value: Option[Seq[Transition]]): LifecycleRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.transitions(v.asJava)
    }
  }

  final def noncurrentVersionTransitionsAsScala(
      value: Option[Seq[NoncurrentVersionTransition]]
  ): LifecycleRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.noncurrentVersionTransitions(v.asJava)
    }
  }

  final def noncurrentVersionExpirationAsScala(value: Option[NoncurrentVersionExpiration]): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.noncurrentVersionExpiration(v)
    }
  }

  final def abortIncompleteMultipartUploadAsScala(
      value: Option[AbortIncompleteMultipartUpload]
  ): LifecycleRule.Builder = {
    value.fold(self) { v =>
      self.abortIncompleteMultipartUpload(v)
    }
  }

}

final class LifecycleRuleOps(val self: LifecycleRule) extends AnyVal {

  final def expirationAsScala: Option[LifecycleExpiration] = Option(self.expiration)

  final def idAsScala: Option[String] = Option(self.id)

  final def prefixAsScala: Option[String] = Option(self.prefix)

  final def filterAsScala: Option[LifecycleRuleFilter] = Option(self.filter)

  final def statusAsScala: Option[ExpirationStatus] = Option(self.status)

  final def transitionsAsScala: Option[Seq[Transition]] = Option(self.transitions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def noncurrentVersionTransitionsAsScala: Option[Seq[NoncurrentVersionTransition]] =
    Option(self.noncurrentVersionTransitions).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def noncurrentVersionExpirationAsScala: Option[NoncurrentVersionExpiration] =
    Option(self.noncurrentVersionExpiration)

  final def abortIncompleteMultipartUploadAsScala: Option[AbortIncompleteMultipartUpload] =
    Option(self.abortIncompleteMultipartUpload)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecycleRuleOps {

  implicit def toLifecycleRuleBuilderOps(v: LifecycleRule.Builder): LifecycleRuleBuilderOps =
    new LifecycleRuleBuilderOps(v)

  implicit def toLifecycleRuleOps(v: LifecycleRule): LifecycleRuleOps = new LifecycleRuleOps(v)

}
