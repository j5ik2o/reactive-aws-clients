// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class StaleSecurityGroupBuilderOps(val self: StaleSecurityGroup.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): StaleSecurityGroup.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala(value: Option[String]): StaleSecurityGroup.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): StaleSecurityGroup.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def staleIpPermissionsAsScala(value: Option[Seq[StaleIpPermission]]): StaleSecurityGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.staleIpPermissions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def staleIpPermissionsEgressAsScala(value: Option[Seq[StaleIpPermission]]): StaleSecurityGroup.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.staleIpPermissionsEgress(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): StaleSecurityGroup.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

}

final class StaleSecurityGroupOps(val self: StaleSecurityGroup) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala: Option[String] = Option(self.groupId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def staleIpPermissionsAsScala: Option[Seq[StaleIpPermission]] = Option(self.staleIpPermissions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def staleIpPermissionsEgressAsScala: Option[Seq[StaleIpPermission]] =
    Option(self.staleIpPermissionsEgress).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStaleSecurityGroupOps {

  implicit def toStaleSecurityGroupBuilderOps(v: StaleSecurityGroup.Builder): StaleSecurityGroupBuilderOps =
    new StaleSecurityGroupBuilderOps(v)

  implicit def toStaleSecurityGroupOps(v: StaleSecurityGroup): StaleSecurityGroupOps = new StaleSecurityGroupOps(v)

}
