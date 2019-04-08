// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TransitGatewayRouteTableBuilderOps(val self: TransitGatewayRouteTable.Builder) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala(value: Option[String]): TransitGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.transitGatewayRouteTableId(v)
    }
  }

  final def transitGatewayIdAsScala(value: Option[String]): TransitGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  final def stateAsScala(value: Option[TransitGatewayRouteTableState]): TransitGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def defaultAssociationRouteTableAsScala(value: Option[Boolean]): TransitGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.defaultAssociationRouteTable(v)
    }
  }

  final def defaultPropagationRouteTableAsScala(value: Option[Boolean]): TransitGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.defaultPropagationRouteTable(v)
    }
  }

  final def creationTimeAsScala(value: Option[java.time.Instant]): TransitGatewayRouteTable.Builder = {
    value.fold(self) { v =>
      self.creationTime(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): TransitGatewayRouteTable.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class TransitGatewayRouteTableOps(val self: TransitGatewayRouteTable) extends AnyVal {

  final def transitGatewayRouteTableIdAsScala: Option[String] = Option(self.transitGatewayRouteTableId)

  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  final def stateAsScala: Option[TransitGatewayRouteTableState] = Option(self.state)

  final def defaultAssociationRouteTableAsScala: Option[Boolean] = Option(self.defaultAssociationRouteTable)

  final def defaultPropagationRouteTableAsScala: Option[Boolean] = Option(self.defaultPropagationRouteTable)

  final def creationTimeAsScala: Option[java.time.Instant] = Option(self.creationTime)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTransitGatewayRouteTableOps {

  implicit def toTransitGatewayRouteTableBuilderOps(
      v: TransitGatewayRouteTable.Builder
  ): TransitGatewayRouteTableBuilderOps = new TransitGatewayRouteTableBuilderOps(v)

  implicit def toTransitGatewayRouteTableOps(v: TransitGatewayRouteTable): TransitGatewayRouteTableOps =
    new TransitGatewayRouteTableOps(v)

}
