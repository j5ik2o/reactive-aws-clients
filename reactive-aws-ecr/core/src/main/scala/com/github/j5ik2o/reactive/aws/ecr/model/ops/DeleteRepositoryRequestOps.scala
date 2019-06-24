// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DeleteRepositoryRequestBuilderOps(val self: DeleteRepositoryRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): DeleteRepositoryRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): DeleteRepositoryRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala(value: Option[Boolean]): DeleteRepositoryRequest.Builder = {
    value.fold(self) { v =>
      self.force(v)
    }
  }

}

final class DeleteRepositoryRequestOps(val self: DeleteRepositoryRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def forceAsScala: Option[Boolean] = Option(self.force)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteRepositoryRequestOps {

  implicit def toDeleteRepositoryRequestBuilderOps(
      v: DeleteRepositoryRequest.Builder
  ): DeleteRepositoryRequestBuilderOps = new DeleteRepositoryRequestBuilderOps(v)

  implicit def toDeleteRepositoryRequestOps(v: DeleteRepositoryRequest): DeleteRepositoryRequestOps =
    new DeleteRepositoryRequestOps(v)

}
