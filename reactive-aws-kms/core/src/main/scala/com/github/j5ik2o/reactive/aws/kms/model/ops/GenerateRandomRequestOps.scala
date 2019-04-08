// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GenerateRandomRequestBuilderOps(val self: GenerateRandomRequest.Builder) extends AnyVal {

  final def numberOfBytesAsScala(value: Option[Int]): GenerateRandomRequest.Builder = {
    value.fold(self) { v =>
      self.numberOfBytes(v)
    }
  }

  final def customKeyStoreIdAsScala(value: Option[String]): GenerateRandomRequest.Builder = {
    value.fold(self) { v =>
      self.customKeyStoreId(v)
    }
  }

}

final class GenerateRandomRequestOps(val self: GenerateRandomRequest) extends AnyVal {

  final def numberOfBytesAsScala: Option[Int] = Option(self.numberOfBytes)

  final def customKeyStoreIdAsScala: Option[String] = Option(self.customKeyStoreId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGenerateRandomRequestOps {

  implicit def toGenerateRandomRequestBuilderOps(v: GenerateRandomRequest.Builder): GenerateRandomRequestBuilderOps =
    new GenerateRandomRequestBuilderOps(v)

  implicit def toGenerateRandomRequestOps(v: GenerateRandomRequest): GenerateRandomRequestOps =
    new GenerateRandomRequestOps(v)

}
