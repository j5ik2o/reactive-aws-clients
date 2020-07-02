// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PolicyStatusBuilderOps(val self: PolicyStatus.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isPublicAsScala(value: Option[Boolean]): PolicyStatus.Builder = {
    value.fold(self) { v => self.isPublic(v) }
  }

}

final class PolicyStatusOps(val self: PolicyStatus) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def isPublicAsScala: Option[Boolean] = Option(self.isPublic)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPolicyStatusOps {

  implicit def toPolicyStatusBuilderOps(v: PolicyStatus.Builder): PolicyStatusBuilderOps = new PolicyStatusBuilderOps(v)

  implicit def toPolicyStatusOps(v: PolicyStatus): PolicyStatusOps = new PolicyStatusOps(v)

}
