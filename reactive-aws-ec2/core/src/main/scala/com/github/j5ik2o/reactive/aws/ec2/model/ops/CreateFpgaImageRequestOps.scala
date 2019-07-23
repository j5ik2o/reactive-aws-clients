// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateFpgaImageRequestBuilderOps(val self: CreateFpgaImageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputStorageLocationAsScala(value: Option[StorageLocation]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.inputStorageLocation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logsStorageLocationAsScala(value: Option[StorageLocation]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.logsStorageLocation(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateFpgaImageRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

}

final class CreateFpgaImageRequestOps(val self: CreateFpgaImageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def inputStorageLocationAsScala: Option[StorageLocation] = Option(self.inputStorageLocation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logsStorageLocationAsScala: Option[StorageLocation] = Option(self.logsStorageLocation)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateFpgaImageRequestOps {

  implicit def toCreateFpgaImageRequestBuilderOps(v: CreateFpgaImageRequest.Builder): CreateFpgaImageRequestBuilderOps =
    new CreateFpgaImageRequestBuilderOps(v)

  implicit def toCreateFpgaImageRequestOps(v: CreateFpgaImageRequest): CreateFpgaImageRequestOps =
    new CreateFpgaImageRequestOps(v)

}
