// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HibernationOptionsRequestBuilderOps(val self: HibernationOptionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configuredAsScala(value: Option[Boolean]): HibernationOptionsRequest.Builder = {
    value.fold(self) { v => self.configured(v) }
  }

}

final class HibernationOptionsRequestOps(val self: HibernationOptionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configuredAsScala: Option[Boolean] = Option(self.configured)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHibernationOptionsRequestOps {

  implicit def toHibernationOptionsRequestBuilderOps(
      v: HibernationOptionsRequest.Builder
  ): HibernationOptionsRequestBuilderOps = new HibernationOptionsRequestBuilderOps(v)

  implicit def toHibernationOptionsRequestOps(v: HibernationOptionsRequest): HibernationOptionsRequestOps =
    new HibernationOptionsRequestOps(v)

}
