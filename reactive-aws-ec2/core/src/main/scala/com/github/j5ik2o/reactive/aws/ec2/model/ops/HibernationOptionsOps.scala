// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class HibernationOptionsBuilderOps(val self: HibernationOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configuredAsScala(value: Option[Boolean]): HibernationOptions.Builder = {
    value.fold(self) { v => self.configured(v) }
  }

}

final class HibernationOptionsOps(val self: HibernationOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def configuredAsScala: Option[Boolean] = Option(self.configured)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHibernationOptionsOps {

  implicit def toHibernationOptionsBuilderOps(v: HibernationOptions.Builder): HibernationOptionsBuilderOps =
    new HibernationOptionsBuilderOps(v)

  implicit def toHibernationOptionsOps(v: HibernationOptions): HibernationOptionsOps = new HibernationOptionsOps(v)

}
