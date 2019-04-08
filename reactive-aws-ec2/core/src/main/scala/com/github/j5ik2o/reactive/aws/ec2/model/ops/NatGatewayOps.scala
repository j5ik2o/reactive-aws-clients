// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NatGatewayBuilderOps(val self: NatGateway.Builder) extends AnyVal {

  final def createTimeAsScala(value: Option[java.time.Instant]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  final def deleteTimeAsScala(value: Option[java.time.Instant]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.deleteTime(v)
    }
  }

  final def failureCodeAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.failureCode(v)
    }
  }

  final def failureMessageAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.failureMessage(v)
    }
  }

  final def natGatewayAddressesAsScala(value: Option[Seq[NatGatewayAddress]]): NatGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.natGatewayAddresses(v.asJava)
    }
  }

  final def natGatewayIdAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.natGatewayId(v)
    }
  }

  final def provisionedBandwidthAsScala(value: Option[ProvisionedBandwidth]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.provisionedBandwidth(v)
    }
  }

  final def stateAsScala(value: Option[NatGatewayState]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): NatGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class NatGatewayOps(val self: NatGateway) extends AnyVal {

  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  final def deleteTimeAsScala: Option[java.time.Instant] = Option(self.deleteTime)

  final def failureCodeAsScala: Option[String] = Option(self.failureCode)

  final def failureMessageAsScala: Option[String] = Option(self.failureMessage)

  final def natGatewayAddressesAsScala: Option[Seq[NatGatewayAddress]] = Option(self.natGatewayAddresses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def natGatewayIdAsScala: Option[String] = Option(self.natGatewayId)

  final def provisionedBandwidthAsScala: Option[ProvisionedBandwidth] = Option(self.provisionedBandwidth)

  final def stateAsScala: Option[NatGatewayState] = Option(self.state)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNatGatewayOps {

  implicit def toNatGatewayBuilderOps(v: NatGateway.Builder): NatGatewayBuilderOps = new NatGatewayBuilderOps(v)

  implicit def toNatGatewayOps(v: NatGateway): NatGatewayOps = new NatGatewayOps(v)

}
