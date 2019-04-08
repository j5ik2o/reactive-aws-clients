// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateSubnetRequestBuilderOps(val self: CreateSubnetRequest.Builder) extends AnyVal {

  final def availabilityZoneAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZone(v)
    }
  }

  final def availabilityZoneIdAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v =>
      self.availabilityZoneId(v)
    }
  }

  final def cidrBlockAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v =>
      self.cidrBlock(v)
    }
  }

  final def ipv6CidrBlockAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v =>
      self.ipv6CidrBlock(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): CreateSubnetRequest.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class CreateSubnetRequestOps(val self: CreateSubnetRequest) extends AnyVal {

  final def availabilityZoneAsScala: Option[String] = Option(self.availabilityZone)

  final def availabilityZoneIdAsScala: Option[String] = Option(self.availabilityZoneId)

  final def cidrBlockAsScala: Option[String] = Option(self.cidrBlock)

  final def ipv6CidrBlockAsScala: Option[String] = Option(self.ipv6CidrBlock)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateSubnetRequestOps {

  implicit def toCreateSubnetRequestBuilderOps(v: CreateSubnetRequest.Builder): CreateSubnetRequestBuilderOps =
    new CreateSubnetRequestBuilderOps(v)

  implicit def toCreateSubnetRequestOps(v: CreateSubnetRequest): CreateSubnetRequestOps = new CreateSubnetRequestOps(v)

}
