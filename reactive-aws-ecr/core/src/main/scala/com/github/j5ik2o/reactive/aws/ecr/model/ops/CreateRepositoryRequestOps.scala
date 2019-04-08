// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class CreateRepositoryRequestBuilderOps(val self: CreateRepositoryRequest.Builder) extends AnyVal {

  final def repositoryNameAsScala(value: Option[String]): CreateRepositoryRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): CreateRepositoryRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class CreateRepositoryRequestOps(val self: CreateRepositoryRequest) extends AnyVal {

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateRepositoryRequestOps {

  implicit def toCreateRepositoryRequestBuilderOps(
      v: CreateRepositoryRequest.Builder
  ): CreateRepositoryRequestBuilderOps = new CreateRepositoryRequestBuilderOps(v)

  implicit def toCreateRepositoryRequestOps(v: CreateRepositoryRequest): CreateRepositoryRequestOps =
    new CreateRepositoryRequestOps(v)

}
