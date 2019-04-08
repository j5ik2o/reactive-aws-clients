// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class VpcPeeringConnectionBuilderOps(val self: VpcPeeringConnection.Builder) extends AnyVal {

  final def accepterVpcInfoAsScala(value: Option[VpcPeeringConnectionVpcInfo]): VpcPeeringConnection.Builder = {
    value.fold(self) { v =>
      self.accepterVpcInfo(v)
    }
  }

  final def expirationTimeAsScala(value: Option[java.time.Instant]): VpcPeeringConnection.Builder = {
    value.fold(self) { v =>
      self.expirationTime(v)
    }
  }

  final def requesterVpcInfoAsScala(value: Option[VpcPeeringConnectionVpcInfo]): VpcPeeringConnection.Builder = {
    value.fold(self) { v =>
      self.requesterVpcInfo(v)
    }
  }

  final def statusAsScala(value: Option[VpcPeeringConnectionStateReason]): VpcPeeringConnection.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): VpcPeeringConnection.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def vpcPeeringConnectionIdAsScala(value: Option[String]): VpcPeeringConnection.Builder = {
    value.fold(self) { v =>
      self.vpcPeeringConnectionId(v)
    }
  }

}

final class VpcPeeringConnectionOps(val self: VpcPeeringConnection) extends AnyVal {

  final def accepterVpcInfoAsScala: Option[VpcPeeringConnectionVpcInfo] = Option(self.accepterVpcInfo)

  final def expirationTimeAsScala: Option[java.time.Instant] = Option(self.expirationTime)

  final def requesterVpcInfoAsScala: Option[VpcPeeringConnectionVpcInfo] = Option(self.requesterVpcInfo)

  final def statusAsScala: Option[VpcPeeringConnectionStateReason] = Option(self.status)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToVpcPeeringConnectionOps {

  implicit def toVpcPeeringConnectionBuilderOps(v: VpcPeeringConnection.Builder): VpcPeeringConnectionBuilderOps =
    new VpcPeeringConnectionBuilderOps(v)

  implicit def toVpcPeeringConnectionOps(v: VpcPeeringConnection): VpcPeeringConnectionOps =
    new VpcPeeringConnectionOps(v)

}
