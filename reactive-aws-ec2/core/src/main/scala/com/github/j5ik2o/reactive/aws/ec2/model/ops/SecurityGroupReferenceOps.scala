// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SecurityGroupReferenceBuilderOps(val self: SecurityGroupReference.Builder) extends AnyVal {

  final def groupIdAsScala(value: Option[String]): SecurityGroupReference.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def referencingVpcIdAsScala(value: Option[String]): SecurityGroupReference.Builder = {
    value.fold(self) { v =>
      self.referencingVpcId(v)
    }
  }

  final def vpcPeeringConnectionIdAsScala(value: Option[String]): SecurityGroupReference.Builder = {
    value.fold(self) { v =>
      self.vpcPeeringConnectionId(v)
    }
  }

}

final class SecurityGroupReferenceOps(val self: SecurityGroupReference) extends AnyVal {

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def referencingVpcIdAsScala: Option[String] = Option(self.referencingVpcId)

  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSecurityGroupReferenceOps {

  implicit def toSecurityGroupReferenceBuilderOps(v: SecurityGroupReference.Builder): SecurityGroupReferenceBuilderOps =
    new SecurityGroupReferenceBuilderOps(v)

  implicit def toSecurityGroupReferenceOps(v: SecurityGroupReference): SecurityGroupReferenceOps =
    new SecurityGroupReferenceOps(v)

}
