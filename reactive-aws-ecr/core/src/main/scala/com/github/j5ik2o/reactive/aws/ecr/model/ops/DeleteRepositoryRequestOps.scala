// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DeleteRepositoryRequestBuilderOps(val self: DeleteRepositoryRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): DeleteRepositoryRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): DeleteRepositoryRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def forceAsScala(value: Option[Boolean]): DeleteRepositoryRequest.Builder = {
    value.fold(self) { v =>
      self.force(v)
    }
  }

}

final class DeleteRepositoryRequestOps(val self: DeleteRepositoryRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

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
