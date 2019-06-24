// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class RepositoryBuilderOps(val self: Repository.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryArnAsScala(value: Option[String]): Repository.Builder = {
    value.fold(self) { v =>
      self.repositoryArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): Repository.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): Repository.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryUriAsScala(value: Option[String]): Repository.Builder = {
    value.fold(self) { v =>
      self.repositoryUri(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[java.time.Instant]): Repository.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

}

final class RepositoryOps(val self: Repository) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryArnAsScala: Option[String] = Option(self.repositoryArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryUriAsScala: Option[String] = Option(self.repositoryUri)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRepositoryOps {

  implicit def toRepositoryBuilderOps(v: Repository.Builder): RepositoryBuilderOps = new RepositoryBuilderOps(v)

  implicit def toRepositoryOps(v: Repository): RepositoryOps = new RepositoryOps(v)

}
