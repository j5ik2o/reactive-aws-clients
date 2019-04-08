// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AuthorizeSecurityGroupEgressRequestBuilderOps(val self: AuthorizeSecurityGroupEgressRequest.Builder)
    extends AnyVal {

  final def groupIdAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def ipPermissionsAsScala(value: Option[Seq[IpPermission]]): AuthorizeSecurityGroupEgressRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipPermissions(v.asJava)
    }
  }

  final def cidrIpAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.cidrIp(v)
    }
  }

  final def fromPortAsScala(value: Option[Int]): AuthorizeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.fromPort(v)
    }
  }

  final def ipProtocolAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.ipProtocol(v)
    }
  }

  final def toPortAsScala(value: Option[Int]): AuthorizeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.toPort(v)
    }
  }

  final def sourceSecurityGroupNameAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.sourceSecurityGroupName(v)
    }
  }

  final def sourceSecurityGroupOwnerIdAsScala(value: Option[String]): AuthorizeSecurityGroupEgressRequest.Builder = {
    value.fold(self) { v =>
      self.sourceSecurityGroupOwnerId(v)
    }
  }

}

final class AuthorizeSecurityGroupEgressRequestOps(val self: AuthorizeSecurityGroupEgressRequest) extends AnyVal {

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
trait ToAuthorizeSecurityGroupEgressRequestOps {

  implicit def toAuthorizeSecurityGroupEgressRequestBuilderOps(
      v: AuthorizeSecurityGroupEgressRequest.Builder
  ): AuthorizeSecurityGroupEgressRequestBuilderOps = new AuthorizeSecurityGroupEgressRequestBuilderOps(v)

  implicit def toAuthorizeSecurityGroupEgressRequestOps(
      v: AuthorizeSecurityGroupEgressRequest
  ): AuthorizeSecurityGroupEgressRequestOps = new AuthorizeSecurityGroupEgressRequestOps(v)

}
