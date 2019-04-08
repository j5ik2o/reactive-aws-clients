// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateTransitGatewayRequestBuilderOps(val self: CreateTransitGatewayRequest.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): CreateTransitGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def optionsAsScala(value: Option[TransitGatewayRequestOptions]): CreateTransitGatewayRequest.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateTransitGatewayRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateTransitGatewayRequestOps(val self: CreateTransitGatewayRequest) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def optionsAsScala: Option[TransitGatewayRequestOptions] = Option(self.options)

  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateTransitGatewayRequestOps {

  implicit def toCreateTransitGatewayRequestBuilderOps(
      v: CreateTransitGatewayRequest.Builder
  ): CreateTransitGatewayRequestBuilderOps = new CreateTransitGatewayRequestBuilderOps(v)

  implicit def toCreateTransitGatewayRequestOps(v: CreateTransitGatewayRequest): CreateTransitGatewayRequestOps =
    new CreateTransitGatewayRequestOps(v)

}
