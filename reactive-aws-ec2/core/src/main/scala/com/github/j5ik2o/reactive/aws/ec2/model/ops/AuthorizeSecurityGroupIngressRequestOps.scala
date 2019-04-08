// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AuthorizeSecurityGroupIngressRequestBuilderOps(val self: AuthorizeSecurityGroupIngressRequest.Builder)
    extends AnyVal {

  final def cidrIpAsScala(value: Option[String]): AuthorizeSecurityGroupIngressRequest.Builder = {
    value.fold(self) { v =>
      self.cidrIp(v)
    }
  }

  final def fromPortAsScala(value: Option[Int]): AuthorizeSecurityGroupIngressRequest.Builder = {
    value.fold(self) { v =>
      self.fromPort(v)
    }
  }

  final def groupIdAsScala(value: Option[String]): AuthorizeSecurityGroupIngressRequest.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): AuthorizeSecurityGroupIngressRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def ipPermissionsAsScala(value: Option[Seq[IpPermission]]): AuthorizeSecurityGroupIngressRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipPermissions(v.asJava)
    }
  }

  final def ipProtocolAsScala(value: Option[String]): AuthorizeSecurityGroupIngressRequest.Builder = {
    value.fold(self) { v =>
      self.ipProtocol(v)
    }
  }

  final def sourceSecurityGroupNameAsScala(value: Option[String]): AuthorizeSecurityGroupIngressRequest.Builder = {
    value.fold(self) { v =>
      self.sourceSecurityGroupName(v)
    }
  }

  final def sourceSecurityGroupOwnerIdAsScala(value: Option[String]): AuthorizeSecurityGroupIngressRequest.Builder = {
    value.fold(self) { v =>
      self.sourceSecurityGroupOwnerId(v)
    }
  }

  final def toPortAsScala(value: Option[Int]): AuthorizeSecurityGroupIngressRequest.Builder = {
    value.fold(self) { v =>
      self.toPort(v)
    }
  }

}

final class AuthorizeSecurityGroupIngressRequestOps(val self: AuthorizeSecurityGroupIngressRequest) extends AnyVal {

  final def cidrIpAsScala: Option[String] = Option(self.cidrIp)

  final def fromPortAsScala: Option[Int] = Option(self.fromPort)

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def ipPermissionsAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ipProtocolAsScala: Option[String] = Option(self.ipProtocol)

  final def sourceSecurityGroupNameAsScala: Option[String] = Option(self.sourceSecurityGroupName)

  final def sourceSecurityGroupOwnerIdAsScala: Option[String] = Option(self.sourceSecurityGroupOwnerId)

  final def toPortAsScala: Option[Int] = Option(self.toPort)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAuthorizeSecurityGroupIngressRequestOps {

  implicit def toAuthorizeSecurityGroupIngressRequestBuilderOps(
      v: AuthorizeSecurityGroupIngressRequest.Builder
  ): AuthorizeSecurityGroupIngressRequestBuilderOps = new AuthorizeSecurityGroupIngressRequestBuilderOps(v)

  implicit def toAuthorizeSecurityGroupIngressRequestOps(
      v: AuthorizeSecurityGroupIngressRequest
  ): AuthorizeSecurityGroupIngressRequestOps = new AuthorizeSecurityGroupIngressRequestOps(v)

}
