// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class RequestEnvironmentInfoRequestBuilderOps(val self: RequestEnvironmentInfoRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala(value: Option[String]): RequestEnvironmentInfoRequest.Builder = {
    value.fold(self) { v => self.environmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): RequestEnvironmentInfoRequest.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def infoTypeAsScala(value: Option[EnvironmentInfoType]): RequestEnvironmentInfoRequest.Builder = {
    value.fold(self) { v => self.infoType(v) }
  }

}

final class RequestEnvironmentInfoRequestOps(val self: RequestEnvironmentInfoRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def infoTypeAsScala: Option[EnvironmentInfoType] = Option(self.infoType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRequestEnvironmentInfoRequestOps {

  implicit def toRequestEnvironmentInfoRequestBuilderOps(
      v: RequestEnvironmentInfoRequest.Builder
  ): RequestEnvironmentInfoRequestBuilderOps = new RequestEnvironmentInfoRequestBuilderOps(v)

  implicit def toRequestEnvironmentInfoRequestOps(v: RequestEnvironmentInfoRequest): RequestEnvironmentInfoRequestOps =
    new RequestEnvironmentInfoRequestOps(v)

}
