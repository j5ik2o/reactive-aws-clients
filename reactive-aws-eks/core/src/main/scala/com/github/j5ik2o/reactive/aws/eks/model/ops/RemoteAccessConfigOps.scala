// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class RemoteAccessConfigBuilderOps(val self: RemoteAccessConfig.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ec2SshKeyAsScala(value: Option[String]): RemoteAccessConfig.Builder = {
    value.fold(self) { v => self.ec2SshKey(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceSecurityGroupsAsScala(value: Option[Seq[String]]): RemoteAccessConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.sourceSecurityGroups(v.asJava)
    }
  }

}

final class RemoteAccessConfigOps(val self: RemoteAccessConfig) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ec2SshKeyAsScala: Option[String] = Option(self.ec2SshKey)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sourceSecurityGroupsAsScala: Option[Seq[String]] =
    Option(self.sourceSecurityGroups).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRemoteAccessConfigOps {

  implicit def toRemoteAccessConfigBuilderOps(v: RemoteAccessConfig.Builder): RemoteAccessConfigBuilderOps =
    new RemoteAccessConfigBuilderOps(v)

  implicit def toRemoteAccessConfigOps(v: RemoteAccessConfig): RemoteAccessConfigOps = new RemoteAccessConfigOps(v)

}
