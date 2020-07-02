// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticsearch.model.ops

import software.amazon.awssdk.services.elasticsearch.model._

final class MasterUserOptionsBuilderOps(val self: MasterUserOptions.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterUserARNAsScala(value: Option[String]): MasterUserOptions.Builder = {
    value.fold(self) { v => self.masterUserARN(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterUserNameAsScala(value: Option[String]): MasterUserOptions.Builder = {
    value.fold(self) { v => self.masterUserName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterUserPasswordAsScala(value: Option[String]): MasterUserOptions.Builder = {
    value.fold(self) { v => self.masterUserPassword(v) }
  }

}

final class MasterUserOptionsOps(val self: MasterUserOptions) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterUserARNAsScala: Option[String] = Option(self.masterUserARN)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterUserNameAsScala: Option[String] = Option(self.masterUserName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def masterUserPasswordAsScala: Option[String] = Option(self.masterUserPassword)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToMasterUserOptionsOps {

  implicit def toMasterUserOptionsBuilderOps(v: MasterUserOptions.Builder): MasterUserOptionsBuilderOps =
    new MasterUserOptionsBuilderOps(v)

  implicit def toMasterUserOptionsOps(v: MasterUserOptions): MasterUserOptionsOps = new MasterUserOptionsOps(v)

}
