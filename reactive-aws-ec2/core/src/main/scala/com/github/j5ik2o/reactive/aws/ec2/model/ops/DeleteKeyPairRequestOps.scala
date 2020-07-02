// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteKeyPairRequestBuilderOps(val self: DeleteKeyPairRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala(value: Option[String]): DeleteKeyPairRequest.Builder = {
    value.fold(self) { v => self.keyName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairIdAsScala(value: Option[String]): DeleteKeyPairRequest.Builder = {
    value.fold(self) { v => self.keyPairId(v) }
  }

}

final class DeleteKeyPairRequestOps(val self: DeleteKeyPairRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyNameAsScala: Option[String] = Option(self.keyName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyPairIdAsScala: Option[String] = Option(self.keyPairId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteKeyPairRequestOps {

  implicit def toDeleteKeyPairRequestBuilderOps(v: DeleteKeyPairRequest.Builder): DeleteKeyPairRequestBuilderOps =
    new DeleteKeyPairRequestBuilderOps(v)

  implicit def toDeleteKeyPairRequestOps(v: DeleteKeyPairRequest): DeleteKeyPairRequestOps =
    new DeleteKeyPairRequestOps(v)

}
