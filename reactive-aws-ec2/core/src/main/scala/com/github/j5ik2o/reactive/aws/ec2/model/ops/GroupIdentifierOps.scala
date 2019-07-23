// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GroupIdentifierBuilderOps(val self: GroupIdentifier.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): GroupIdentifier.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala(value: Option[String]): GroupIdentifier.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

}

final class GroupIdentifierOps(val self: GroupIdentifier) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala: Option[String] = Option(self.groupId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGroupIdentifierOps {

  implicit def toGroupIdentifierBuilderOps(v: GroupIdentifier.Builder): GroupIdentifierBuilderOps =
    new GroupIdentifierBuilderOps(v)

  implicit def toGroupIdentifierOps(v: GroupIdentifier): GroupIdentifierOps = new GroupIdentifierOps(v)

}
