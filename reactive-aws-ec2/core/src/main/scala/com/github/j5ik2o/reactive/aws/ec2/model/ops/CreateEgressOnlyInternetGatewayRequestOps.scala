// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateEgressOnlyInternetGatewayRequestBuilderOps(val self: CreateEgressOnlyInternetGatewayRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateEgressOnlyInternetGatewayRequest.Builder = {
    value.fold(self) { v => self.clientToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): CreateEgressOnlyInternetGatewayRequest.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(
      value: Option[Seq[TagSpecification]]
  ): CreateEgressOnlyInternetGatewayRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateEgressOnlyInternetGatewayRequestOps(val self: CreateEgressOnlyInternetGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateEgressOnlyInternetGatewayRequestOps {

  implicit def toCreateEgressOnlyInternetGatewayRequestBuilderOps(
      v: CreateEgressOnlyInternetGatewayRequest.Builder
  ): CreateEgressOnlyInternetGatewayRequestBuilderOps = new CreateEgressOnlyInternetGatewayRequestBuilderOps(v)

  implicit def toCreateEgressOnlyInternetGatewayRequestOps(
      v: CreateEgressOnlyInternetGatewayRequest
  ): CreateEgressOnlyInternetGatewayRequestOps = new CreateEgressOnlyInternetGatewayRequestOps(v)

}
