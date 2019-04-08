// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class CreateRepositoryResponseBuilderOps(val self: CreateRepositoryResponse.Builder) extends AnyVal {

  final def repositoryAsScala(value: Option[Repository]): CreateRepositoryResponse.Builder = {
    value.fold(self) { v =>
      self.repository(v)
    }
  }

}

final class CreateRepositoryResponseOps(val self: CreateRepositoryResponse) extends AnyVal {

  final def repositoryAsScala: Option[Repository] = Option(self.repository)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateRepositoryResponseOps {

  implicit def toCreateRepositoryResponseBuilderOps(
      v: CreateRepositoryResponse.Builder
  ): CreateRepositoryResponseBuilderOps = new CreateRepositoryResponseBuilderOps(v)

  implicit def toCreateRepositoryResponseOps(v: CreateRepositoryResponse): CreateRepositoryResponseOps =
    new CreateRepositoryResponseOps(v)

}
