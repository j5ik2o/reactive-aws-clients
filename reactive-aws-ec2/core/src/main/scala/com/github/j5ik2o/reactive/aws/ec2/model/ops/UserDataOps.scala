// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UserDataBuilderOps(val self: UserData.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAsScala(value: Option[String]): UserData.Builder = {
    value.fold(self) { v =>
      self.data(v)
    }
  }

}

final class UserDataOps(val self: UserData) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dataAsScala: Option[String] = Option(self.data)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUserDataOps {

  implicit def toUserDataBuilderOps(v: UserData.Builder): UserDataBuilderOps = new UserDataBuilderOps(v)

  implicit def toUserDataOps(v: UserData): UserDataOps = new UserDataOps(v)

}
