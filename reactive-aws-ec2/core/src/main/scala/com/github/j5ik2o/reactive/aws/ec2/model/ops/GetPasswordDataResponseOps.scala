// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class GetPasswordDataResponseBuilderOps(val self: GetPasswordDataResponse.Builder) extends AnyVal {

  final def instanceIdAsScala(value: Option[String]): GetPasswordDataResponse.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  final def passwordDataAsScala(value: Option[String]): GetPasswordDataResponse.Builder = {
    value.fold(self) { v =>
      self.passwordData(v)
    }
  }

  final def timestampAsScala(value: Option[java.time.Instant]): GetPasswordDataResponse.Builder = {
    value.fold(self) { v =>
      self.timestamp(v)
    }
  }

}

final class GetPasswordDataResponseOps(val self: GetPasswordDataResponse) extends AnyVal {

  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  final def passwordDataAsScala: Option[String] = Option(self.passwordData)

  final def timestampAsScala: Option[java.time.Instant] = Option(self.timestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetPasswordDataResponseOps {

  implicit def toGetPasswordDataResponseBuilderOps(
      v: GetPasswordDataResponse.Builder
  ): GetPasswordDataResponseBuilderOps = new GetPasswordDataResponseBuilderOps(v)

  implicit def toGetPasswordDataResponseOps(v: GetPasswordDataResponse): GetPasswordDataResponseOps =
    new GetPasswordDataResponseOps(v)

}
