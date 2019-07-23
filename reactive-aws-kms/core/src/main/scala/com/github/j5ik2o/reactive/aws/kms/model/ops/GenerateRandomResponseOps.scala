// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateRandomResponseBuilderOps(val self: GenerateRandomResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def plaintextAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): GenerateRandomResponse.Builder = {
    value.fold(self) { v =>
      self.plaintext(v)
    }
  }

}

final class GenerateRandomResponseOps(val self: GenerateRandomResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def plaintextAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.plaintext)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenerateRandomResponseOps {

  implicit def toGenerateRandomResponseBuilderOps(v: GenerateRandomResponse.Builder): GenerateRandomResponseBuilderOps =
    new GenerateRandomResponseBuilderOps(v)

  implicit def toGenerateRandomResponseOps(v: GenerateRandomResponse): GenerateRandomResponseOps =
    new GenerateRandomResponseOps(v)

}
