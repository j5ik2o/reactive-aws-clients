// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SecurityGroupBuilderOps(val self: SecurityGroup.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): SecurityGroup.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): SecurityGroup.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def ipPermissionsAsScala(value: Option[Seq[IpPermission]]): SecurityGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipPermissions(v.asJava)
    }
  }

  final def ownerIdAsScala(value: Option[String]): SecurityGroup.Builder = {
    value.fold(self) { v =>
      self.ownerId(v)
    }
  }

  final def groupIdAsScala(value: Option[String]): SecurityGroup.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def ipPermissionsEgressAsScala(value: Option[Seq[IpPermission]]): SecurityGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipPermissionsEgress(v.asJava)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): SecurityGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

  final def vpcIdAsScala(value: Option[String]): SecurityGroup.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class SecurityGroupOps(val self: SecurityGroup) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def ipPermissionsAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ownerIdAsScala: Option[String] = Option(self.ownerId)

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def ipPermissionsEgressAsScala: Option[Seq[IpPermission]] = Option(self.ipPermissionsEgress).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSecurityGroupOps {

  implicit def toSecurityGroupBuilderOps(v: SecurityGroup.Builder): SecurityGroupBuilderOps =
    new SecurityGroupBuilderOps(v)

  implicit def toSecurityGroupOps(v: SecurityGroup): SecurityGroupOps = new SecurityGroupOps(v)

}
