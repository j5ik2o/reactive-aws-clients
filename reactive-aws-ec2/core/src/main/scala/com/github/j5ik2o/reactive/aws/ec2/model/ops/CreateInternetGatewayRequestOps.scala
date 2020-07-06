// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateInternetGatewayRequestBuilderOps(val self: CreateInternetGatewayRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateInternetGatewayRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateInternetGatewayRequestOps(val self: CreateInternetGatewayRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] =
    Option(self.tagSpecifications).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateInternetGatewayRequestOps {

  implicit def toCreateInternetGatewayRequestBuilderOps(
      v: CreateInternetGatewayRequest.Builder
  ): CreateInternetGatewayRequestBuilderOps = new CreateInternetGatewayRequestBuilderOps(v)

  implicit def toCreateInternetGatewayRequestOps(v: CreateInternetGatewayRequest): CreateInternetGatewayRequestOps =
    new CreateInternetGatewayRequestOps(v)

}
