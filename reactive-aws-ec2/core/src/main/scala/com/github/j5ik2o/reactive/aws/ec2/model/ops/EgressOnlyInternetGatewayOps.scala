// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class EgressOnlyInternetGatewayBuilderOps(val self: EgressOnlyInternetGateway.Builder) extends AnyVal {

  final def attachmentsAsScala(value: Option[Seq[InternetGatewayAttachment]]): EgressOnlyInternetGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attachments(v.asJava)
    }
  }

  final def egressOnlyInternetGatewayIdAsScala(value: Option[String]): EgressOnlyInternetGateway.Builder = {
    value.fold(self) { v =>
      self.egressOnlyInternetGatewayId(v)
    }
  }

}

final class EgressOnlyInternetGatewayOps(val self: EgressOnlyInternetGateway) extends AnyVal {

  final def attachmentsAsScala: Option[Seq[InternetGatewayAttachment]] = Option(self.attachments).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def egressOnlyInternetGatewayIdAsScala: Option[String] = Option(self.egressOnlyInternetGatewayId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEgressOnlyInternetGatewayOps {

  implicit def toEgressOnlyInternetGatewayBuilderOps(
      v: EgressOnlyInternetGateway.Builder
  ): EgressOnlyInternetGatewayBuilderOps = new EgressOnlyInternetGatewayBuilderOps(v)

  implicit def toEgressOnlyInternetGatewayOps(v: EgressOnlyInternetGateway): EgressOnlyInternetGatewayOps =
    new EgressOnlyInternetGatewayOps(v)

}
