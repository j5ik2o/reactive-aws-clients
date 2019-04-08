// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class RevokeSecurityGroupEgressRequestBuilderOps(val self: RevokeSecurityGroupEgressRequest.Builder)
    extends AnyVal {

  final def groupIdAsScala(value: Option[String]): RevokeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def ipPermissionsAsScala(value: Option[Seq[IpPermission]]): RevokeSecurityGroupEgressRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipPermissions(v.asJava)
    }
  }

  final def cidrIpAsScala(value: Option[String]): RevokeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.cidrIp(v)
    }
  }

  final def fromPortAsScala(value: Option[Int]): RevokeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.fromPort(v)
    }
  }

  final def ipProtocolAsScala(value: Option[String]): RevokeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.ipProtocol(v)
    }
  }

  final def toPortAsScala(value: Option[Int]): RevokeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.toPort(v)
    }
  }

  final def sourceSecurityGroupNameAsScala(value: Option[String]): RevokeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.sourceSecurityGroupName(v)
    }
  }

  final def sourceSecurityGroupOwnerIdAsScala(value: Option[String]): RevokeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.sourceSecurityGroupOwnerId(v)
    }
  }

}

final class RevokeSecurityGroupEgressRequestOps(val self: RevokeSecurityGroupEgressRequest) extends AnyVal {

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def ipPermissionsAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def cidrIpAsScala: Option[String] = Option(self.cidrIp)

  final def fromPortAsScala: Option[Int] = Option(self.fromPort)

  final def ipProtocolAsScala: Option[String] = Option(self.ipProtocol)

  final def toPortAsScala: Option[Int] = Option(self.toPort)

  final def sourceSecurityGroupNameAsScala: Option[String] = Option(self.sourceSecurityGroupName)

  final def sourceSecurityGroupOwnerIdAsScala: Option[String] = Option(self.sourceSecurityGroupOwnerId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRevokeSecurityGroupEgressRequestOps {

  implicit def toRevokeSecurityGroupEgressRequestBuilderOps(
      v: RevokeSecurityGroupEgressRequest.Builder
  ): RevokeSecurityGroupEgressRequestBuilderOps = new RevokeSecurityGroupEgressRequestBuilderOps(v)

  implicit def toRevokeSecurityGroupEgressRequestOps(
      v: RevokeSecurityGroupEgressRequest
  ): RevokeSecurityGroupEgressRequestOps = new RevokeSecurityGroupEgressRequestOps(v)

}
