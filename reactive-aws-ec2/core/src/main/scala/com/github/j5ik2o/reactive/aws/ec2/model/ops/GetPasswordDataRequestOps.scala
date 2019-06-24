// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetPasswordDataRequestBuilderOps(val self: GetPasswordDataRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): GetPasswordDataRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

}

final class GetPasswordDataRequestOps(val self: GetPasswordDataRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPasswordDataRequestOps {

  implicit def toGetPasswordDataRequestBuilderOps(v: GetPasswordDataRequest.Builder): GetPasswordDataRequestBuilderOps =
    new GetPasswordDataRequestBuilderOps(v)

  implicit def toGetPasswordDataRequestOps(v: GetPasswordDataRequest): GetPasswordDataRequestOps =
    new GetPasswordDataRequestOps(v)

}
