// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StaleSecurityGroupBuilderOps(val self: StaleSecurityGroup.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): StaleSecurityGroup.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def groupIdAsScala(value: Option[String]): StaleSecurityGroup.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): StaleSecurityGroup.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def staleIpPermissionsAsScala(value: Option[Seq[StaleIpPermission]]): StaleSecurityGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.staleIpPermissions(v.asJava)
    }
  }

  final def staleIpPermissionsEgressAsScala(value: Option[Seq[StaleIpPermission]]): StaleSecurityGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.staleIpPermissionsEgress(v.asJava)
    }
  }

  final def vpcIdAsScala(value: Option[String]): StaleSecurityGroup.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class StaleSecurityGroupOps(val self: StaleSecurityGroup) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def staleIpPermissionsAsScala: Option[Seq[StaleIpPermission]] = Option(self.staleIpPermissions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def staleIpPermissionsEgressAsScala: Option[Seq[StaleIpPermission]] =
    Option(self.staleIpPermissionsEgress).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStaleSecurityGroupOps {

  implicit def toStaleSecurityGroupBuilderOps(v: StaleSecurityGroup.Builder): StaleSecurityGroupBuilderOps =
    new StaleSecurityGroupBuilderOps(v)

  implicit def toStaleSecurityGroupOps(v: StaleSecurityGroup): StaleSecurityGroupOps = new StaleSecurityGroupOps(v)

}
