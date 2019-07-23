// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DeleteRepositoryResponseBuilderOps(val self: DeleteRepositoryResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryAsScala(value: Option[Repository]): DeleteRepositoryResponse.Builder = {
    value.fold(self) { v =>
      self.repository(v)
    }
  }

}

final class DeleteRepositoryResponseOps(val self: DeleteRepositoryResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryAsScala: Option[Repository] = Option(self.repository)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteRepositoryResponseOps {

  implicit def toDeleteRepositoryResponseBuilderOps(
      v: DeleteRepositoryResponse.Builder
  ): DeleteRepositoryResponseBuilderOps = new DeleteRepositoryResponseBuilderOps(v)

  implicit def toDeleteRepositoryResponseOps(v: DeleteRepositoryResponse): DeleteRepositoryResponseOps =
    new DeleteRepositoryResponseOps(v)

}
