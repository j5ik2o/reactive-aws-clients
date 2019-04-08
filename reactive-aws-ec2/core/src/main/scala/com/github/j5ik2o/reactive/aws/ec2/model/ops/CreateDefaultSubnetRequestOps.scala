// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateDefaultSubnetRequestBuilderOps(val self: CreateDefaultSubnetRequest.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): CreateDefaultSubnetRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

}

final class CreateDefaultSubnetRequestOps(val self: CreateDefaultSubnetRequest) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateDefaultSubnetRequestOps {

  implicit def toCreateDefaultSubnetRequestBuilderOps(
      v: CreateDefaultSubnetRequest.Builder
  ): CreateDefaultSubnetRequestBuilderOps = new CreateDefaultSubnetRequestBuilderOps(v)

  implicit def toCreateDefaultSubnetRequestOps(v: CreateDefaultSubnetRequest): CreateDefaultSubnetRequestOps =
    new CreateDefaultSubnetRequestOps(v)

}
