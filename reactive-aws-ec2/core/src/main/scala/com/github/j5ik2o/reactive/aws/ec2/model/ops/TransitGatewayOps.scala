// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayBuilderOps(val self: TransitGateway.Builder) extends AnyVal {

  final def transitGatewayIdAsScala(value: Option[String]): TransitGateway.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def transitGatewayArnAsScala(value: Option[String]): TransitGateway.Builder = {
    value.fold(self) { v =>
      self.transitGatewayArn(v)
    }
  }

  final def stateAsScala(value: Option[TransitGatewayState]): TransitGateway.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def ownerIdAsScala(value: Option[String]): TransitGateway.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): TransitGateway.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def creationTimeAsScala(value: Option[java.time.Instant]): TransitGateway.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def optionsAsScala(value: Option[TransitGatewayOptions]): TransitGateway.Builder = {
    value.fold(self) { v =>
      self.options(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): TransitGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class TransitGatewayOps(val self: TransitGateway) extends AnyVal {

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def transitGatewayArnAsScala: Option[String] = Option(self.transitGatewayArn)

  final def stateAsScala: Option[TransitGatewayState] = Option(self.state)

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  final def optionsAsScala: Option[TransitGatewayOptions] = Option(self.options)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayOps {

  implicit def toTransitGatewayBuilderOps(v: TransitGateway.Builder): TransitGatewayBuilderOps =
    new TransitGatewayBuilderOps(v)

  implicit def toTransitGatewayOps(v: TransitGateway): TransitGatewayOps = new TransitGatewayOps(v)

}
