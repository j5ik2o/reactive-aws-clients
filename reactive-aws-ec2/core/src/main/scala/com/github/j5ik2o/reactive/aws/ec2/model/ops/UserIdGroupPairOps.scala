// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UserIdGroupPairBuilderOps(val self: UserIdGroupPair.Builder) extends AnyVal {

  final def descriptionAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def groupIdAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v =>
      self.groupId(v)
    }
  }

  final def groupNameAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  final def peeringStatusAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v =>
      self.peeringStatus(v)
    }
  }

  final def userIdAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v =>
      self.userId(v)
    }
  }

  final def vpcIdAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v =>
      self.vpcId(v)
    }
  }

  final def vpcPeeringConnectionIdAsScala(value: Option[String]): UserIdGroupPair.Builder = {
    value.fold(self) { v =>
      self.vpcPeeringConnectionId(v)
    }
  }

}

final class UserIdGroupPairOps(val self: UserIdGroupPair) extends AnyVal {

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def groupIdAsScala: Option[String] = Option(self.groupId)

  final def groupNameAsScala: Option[String] = Option(self.groupName)

  final def peeringStatusAsScala: Option[String] = Option(self.peeringStatus)

  final def userIdAsScala: Option[String] = Option(self.userId)

  final def vpcIdAsScala: Option[String] = Option(self.vpcId)

  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUserIdGroupPairOps {

  implicit def toUserIdGroupPairBuilderOps(v: UserIdGroupPair.Builder): UserIdGroupPairBuilderOps =
    new UserIdGroupPairBuilderOps(v)

  implicit def toUserIdGroupPairOps(v: UserIdGroupPair): UserIdGroupPairOps = new UserIdGroupPairOps(v)

}
