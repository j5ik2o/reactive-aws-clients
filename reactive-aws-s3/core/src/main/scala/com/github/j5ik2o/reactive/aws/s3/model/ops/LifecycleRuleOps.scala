// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class LifecycleRuleBuilderOps(val self: LifecycleRule.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationAsScala(value: Option[LifecycleExpiration]): LifecycleRule.Builder = {
    value.fold(self) { v => self.expiration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala(value: Option[String]): LifecycleRule.Builder = {
    value.fold(self) { v => self.id(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala(value: Option[String]): LifecycleRule.Builder = {
    value.fold(self) { v => self.prefix(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala(value: Option[LifecycleRuleFilter]): LifecycleRule.Builder = {
    value.fold(self) { v => self.filter(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[ExpirationStatus]): LifecycleRule.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitionsAsScala(value: Option[Seq[Transition]]): LifecycleRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.transitions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noncurrentVersionTransitionsAsScala(
      value: Option[Seq[NoncurrentVersionTransition]]
  ): LifecycleRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.noncurrentVersionTransitions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noncurrentVersionExpirationAsScala(value: Option[NoncurrentVersionExpiration]): LifecycleRule.Builder = {
    value.fold(self) { v => self.noncurrentVersionExpiration(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortIncompleteMultipartUploadAsScala(
      value: Option[AbortIncompleteMultipartUpload]
  ): LifecycleRule.Builder = {
    value.fold(self) { v => self.abortIncompleteMultipartUpload(v) }
  }

}

final class LifecycleRuleOps(val self: LifecycleRule) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def expirationAsScala: Option[LifecycleExpiration] = Option(self.expiration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def idAsScala: Option[String] = Option(self.id)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def prefixAsScala: Option[String] = Option(self.prefix)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def filterAsScala: Option[LifecycleRuleFilter] = Option(self.filter)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[ExpirationStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitionsAsScala: Option[Seq[Transition]] =
    Option(self.transitions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noncurrentVersionTransitionsAsScala: Option[Seq[NoncurrentVersionTransition]] =
    Option(self.noncurrentVersionTransitions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def noncurrentVersionExpirationAsScala: Option[NoncurrentVersionExpiration] =
    Option(self.noncurrentVersionExpiration)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def abortIncompleteMultipartUploadAsScala: Option[AbortIncompleteMultipartUpload] =
    Option(self.abortIncompleteMultipartUpload)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLifecycleRuleOps {

  implicit def toLifecycleRuleBuilderOps(v: LifecycleRule.Builder): LifecycleRuleBuilderOps =
    new LifecycleRuleBuilderOps(v)

  implicit def toLifecycleRuleOps(v: LifecycleRule): LifecycleRuleOps = new LifecycleRuleOps(v)

}
