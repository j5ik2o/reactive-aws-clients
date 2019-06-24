// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateKeyPairRequestBuilderOps(val self: CreateKeyPairRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala(value: Option[String]): CreateKeyPairRequest.Builder = {
    value.fold(self) { v =>
      self.keyName(v)
    }
  }

}

final class CreateKeyPairRequestOps(val self: CreateKeyPairRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala: Option[String] = Option(self.keyName)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateKeyPairRequestOps {

  implicit def toCreateKeyPairRequestBuilderOps(v: CreateKeyPairRequest.Builder): CreateKeyPairRequestBuilderOps =
    new CreateKeyPairRequestBuilderOps(v)

  implicit def toCreateKeyPairRequestOps(v: CreateKeyPairRequest): CreateKeyPairRequestOps =
    new CreateKeyPairRequestOps(v)

}
