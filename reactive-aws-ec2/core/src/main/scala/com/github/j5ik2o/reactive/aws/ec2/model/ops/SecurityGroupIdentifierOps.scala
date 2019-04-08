// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SecurityGroupIdentifierBuilderOps(val self: SecurityGroupIdentifier.Builder) extends AnyVal {

  final def groupIdAsScala(value: Option[String]): SecurityGroupIdentifier.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): SecurityGroupIdentifier.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

}

final class SecurityGroupIdentifierOps(val self: SecurityGroupIdentifier) extends AnyVal {

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSecurityGroupIdentifierOps {

  implicit def toSecurityGroupIdentifierBuilderOps(
      v: SecurityGroupIdentifier.Builder
  ): SecurityGroupIdentifierBuilderOps = new SecurityGroupIdentifierBuilderOps(v)

  implicit def toSecurityGroupIdentifierOps(v: SecurityGroupIdentifier): SecurityGroupIdentifierOps =
    new SecurityGroupIdentifierOps(v)

}
