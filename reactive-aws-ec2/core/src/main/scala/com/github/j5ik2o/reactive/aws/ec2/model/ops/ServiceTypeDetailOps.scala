// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ServiceTypeDetailBuilderOps(val self: ServiceTypeDetail.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceTypeAsScala(value: Option[ServiceType]): ServiceTypeDetail.Builder = {
    value.fold(self) { v => self.serviceType(v) }
  }

}

final class ServiceTypeDetailOps(val self: ServiceTypeDetail) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serviceTypeAsScala: Option[ServiceType] = Option(self.serviceType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToServiceTypeDetailOps {

  implicit def toServiceTypeDetailBuilderOps(v: ServiceTypeDetail.Builder): ServiceTypeDetailBuilderOps =
    new ServiceTypeDetailBuilderOps(v)

  implicit def toServiceTypeDetailOps(v: ServiceTypeDetail): ServiceTypeDetailOps = new ServiceTypeDetailOps(v)

}
