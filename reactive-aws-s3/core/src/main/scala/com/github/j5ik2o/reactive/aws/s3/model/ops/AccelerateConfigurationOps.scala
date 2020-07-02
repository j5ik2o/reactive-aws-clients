// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AccelerateConfigurationBuilderOps(val self: AccelerateConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[BucketAccelerateStatus]): AccelerateConfiguration.Builder = {
    value.fold(self) { v => self.status(v) }
  }

}

final class AccelerateConfigurationOps(val self: AccelerateConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[BucketAccelerateStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccelerateConfigurationOps {

  implicit def toAccelerateConfigurationBuilderOps(
      v: AccelerateConfiguration.Builder
  ): AccelerateConfigurationBuilderOps = new AccelerateConfigurationBuilderOps(v)

  implicit def toAccelerateConfigurationOps(v: AccelerateConfiguration): AccelerateConfigurationOps =
    new AccelerateConfigurationOps(v)

}
