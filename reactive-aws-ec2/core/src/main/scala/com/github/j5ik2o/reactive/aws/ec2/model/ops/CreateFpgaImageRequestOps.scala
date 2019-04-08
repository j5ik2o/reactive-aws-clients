// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFpgaImageRequestBuilderOps(val self: CreateFpgaImageRequest.Builder) extends AnyVal {

  final def inputStorageLocationAsScala(value: Option[StorageLocation]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.inputStorageLocation(v)
    }
  }

  final def logsStorageLocationAsScala(value: Option[StorageLocation]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.logsStorageLocation(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def nameAsScala(value: Option[String]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def clientTokenAsScala(value: Option[String]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

}

final class CreateFpgaImageRequestOps(val self: CreateFpgaImageRequest) extends AnyVal {

  final def inputStorageLocationAsScala: Option[StorageLocation] = Option(self.inputStorageLocation)

  final def logsStorageLocationAsScala: Option[StorageLocation] = Option(self.logsStorageLocation)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def nameAsScala: Option[String] = Option(self.name)

  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFpgaImageRequestOps {

  implicit def toCreateFpgaImageRequestBuilderOps(v: CreateFpgaImageRequest.Builder): CreateFpgaImageRequestBuilderOps =
    new CreateFpgaImageRequestBuilderOps(v)

  implicit def toCreateFpgaImageRequestOps(v: CreateFpgaImageRequest): CreateFpgaImageRequestOps =
    new CreateFpgaImageRequestOps(v)

}
