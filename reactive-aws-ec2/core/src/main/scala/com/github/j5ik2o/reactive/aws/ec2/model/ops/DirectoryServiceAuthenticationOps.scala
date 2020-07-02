// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DirectoryServiceAuthenticationBuilderOps(val self: DirectoryServiceAuthentication.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def directoryIdAsScala(value: Option[String]): DirectoryServiceAuthentication.Builder = {
    value.fold(self) { v => self.directoryId(v) }
  }

}

final class DirectoryServiceAuthenticationOps(val self: DirectoryServiceAuthentication) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def directoryIdAsScala: Option[String] = Option(self.directoryId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDirectoryServiceAuthenticationOps {

  implicit def toDirectoryServiceAuthenticationBuilderOps(
      v: DirectoryServiceAuthentication.Builder
  ): DirectoryServiceAuthenticationBuilderOps = new DirectoryServiceAuthenticationBuilderOps(v)

  implicit def toDirectoryServiceAuthenticationOps(
      v: DirectoryServiceAuthentication
  ): DirectoryServiceAuthenticationOps = new DirectoryServiceAuthenticationOps(v)

}
