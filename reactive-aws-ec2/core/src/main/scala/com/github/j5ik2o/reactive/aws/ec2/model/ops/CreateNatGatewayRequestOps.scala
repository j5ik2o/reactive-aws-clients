// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateNatGatewayRequestBuilderOps(val self: CreateNatGatewayRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationIdAsScala(value: Option[String]): CreateNatGatewayRequest.Builder = {
    value.fold(self) { v => self.allocationId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateNatGatewayRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): CreateNatGatewayRequest.Builder = {
    value.fold(self) { v => self.subnetId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateNatGatewayRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateNatGatewayRequestOps(val self: CreateNatGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allocationIdAsScala: Option[String] = Option(self.allocationId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateNatGatewayRequestOps {

  implicit def toCreateNatGatewayRequestBuilderOps(
      v: CreateNatGatewayRequest.Builder
  ): CreateNatGatewayRequestBuilderOps = new CreateNatGatewayRequestBuilderOps(v)

  implicit def toCreateNatGatewayRequestOps(v: CreateNatGatewayRequest): CreateNatGatewayRequestOps =
    new CreateNatGatewayRequestOps(v)

}
