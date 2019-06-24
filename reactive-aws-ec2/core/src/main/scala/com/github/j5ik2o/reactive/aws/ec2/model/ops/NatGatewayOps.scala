// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class NatGatewayBuilderOps(val self: NatGateway.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala(value: Option[java.time.Instant]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.createTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteTimeAsScala(value: Option[java.time.Instant]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.deleteTime(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureCodeAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.failureCode(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureMessageAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.failureMessage(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayAddressesAsScala(value: Option[Seq[NatGatewayAddress]]): NatGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.natGatewayAddresses(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayIdAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.natGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedBandwidthAsScala(value: Option[ProvisionedBandwidth]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.provisionedBandwidth(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala(value: Option[NatGatewayState]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.state(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): NatGateway.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): NatGateway.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class NatGatewayOps(val self: NatGateway) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createTimeAsScala: Option[java.time.Instant] = Option(self.createTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deleteTimeAsScala: Option[java.time.Instant] = Option(self.deleteTime)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureCodeAsScala: Option[String] = Option(self.failureCode)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def failureMessageAsScala: Option[String] = Option(self.failureMessage)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayAddressesAsScala: Option[Seq[NatGatewayAddress]] = Option(self.natGatewayAddresses).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayIdAsScala: Option[String] = Option(self.natGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def provisionedBandwidthAsScala: Option[ProvisionedBandwidth] = Option(self.provisionedBandwidth)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def stateAsScala: Option[NatGatewayState] = Option(self.state)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToNatGatewayOps {

  implicit def toNatGatewayBuilderOps(v: NatGateway.Builder): NatGatewayBuilderOps = new NatGatewayBuilderOps(v)

  implicit def toNatGatewayOps(v: NatGateway): NatGatewayOps = new NatGatewayOps(v)

}
