// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DirectoryServiceAuthenticationRequestBuilderOps(val self: DirectoryServiceAuthenticationRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def directoryIdAsScala(value: Option[String]): DirectoryServiceAuthenticationRequest.Builder = {
    value.fold(self) { v => self.directoryId(v) }
  }

}

final class DirectoryServiceAuthenticationRequestOps(val self: DirectoryServiceAuthenticationRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def directoryIdAsScala: Option[String] = Option(self.directoryId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDirectoryServiceAuthenticationRequestOps {

  implicit def toDirectoryServiceAuthenticationRequestBuilderOps(
      v: DirectoryServiceAuthenticationRequest.Builder
  ): DirectoryServiceAuthenticationRequestBuilderOps = new DirectoryServiceAuthenticationRequestBuilderOps(v)

  implicit def toDirectoryServiceAuthenticationRequestOps(
      v: DirectoryServiceAuthenticationRequest
  ): DirectoryServiceAuthenticationRequestOps = new DirectoryServiceAuthenticationRequestOps(v)

}
