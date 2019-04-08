// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InternetGatewayBuilderOps(val self: InternetGateway.Builder) extends AnyVal {

  final def attachmentsAsScala(value: Option[Seq[InternetGatewayAttachment]]): InternetGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attachments(v.asJava)
    }
  }

  final def internetGatewayIdAsScala(value: Option[String]): InternetGateway.Builder = {
    value.fold(self) { v =>
      self.internetGatewayId(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): InternetGateway.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): InternetGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class InternetGatewayOps(val self: InternetGateway) extends AnyVal {

  final def attachmentsAsScala: Option[Seq[InternetGatewayAttachment]] = Option(self.attachments).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def internetGatewayIdAsScala: Option[String] = Option(self.internetGatewayId)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInternetGatewayOps {

  implicit def toInternetGatewayBuilderOps(v: InternetGateway.Builder): InternetGatewayBuilderOps =
    new InternetGatewayBuilderOps(v)

  implicit def toInternetGatewayOps(v: InternetGateway): InternetGatewayOps = new InternetGatewayOps(v)

}
