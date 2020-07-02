// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UserIdGroupPairBuilderOps(val self: UserIdGroupPair.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v => self.description(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v => self.groupId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v => self.groupName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def peeringStatusAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v => self.peeringStatus(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v => self.userId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v => self.vpcId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v => self.vpcPeeringConnectionId(v) }
  }

}

final class UserIdGroupPairOps(val self: UserIdGroupPair) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupIdAsScala: Option[String] = Option(self.groupId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def peeringStatusAsScala: Option[String] = Option(self.peeringStatus)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def userIdAsScala: Option[String] = Option(self.userId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUserIdGroupPairOps {

  implicit def toUserIdGroupPairBuilderOps(v: UserIdGroupPair.Builder): UserIdGroupPairBuilderOps =
    new UserIdGroupPairBuilderOps(v)

  implicit def toUserIdGroupPairOps(v: UserIdGroupPair): UserIdGroupPairOps = new UserIdGroupPairOps(v)

}
