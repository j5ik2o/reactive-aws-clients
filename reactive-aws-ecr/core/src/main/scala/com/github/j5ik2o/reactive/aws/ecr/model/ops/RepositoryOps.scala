// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class RepositoryBuilderOps(val self: Repository.Builder) extends AnyVal {

  final def repositoryArnAsScala(value: Option[String]): Repository.Builder = {
    value.fold(self) { v =>
      self.repositoryArn(v)
    }
  }

  final def registryIdAsScala(value: Option[String]): Repository.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): Repository.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def repositoryUriAsScala(value: Option[String]): Repository.Builder = {
    value.fold(self) { v =>
      self.repositoryUri(v)
    }
  }

  final def createdAtAsScala(value: Option[java.time.Instant]): Repository.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

}

final class RepositoryOps(val self: Repository) extends AnyVal {

  final def repositoryArnAsScala: Option[String] = Option(self.repositoryArn)

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def repositoryUriAsScala: Option[String] = Option(self.repositoryUri)

  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRepositoryOps {

  implicit def toRepositoryBuilderOps(v: Repository.Builder): RepositoryBuilderOps = new RepositoryBuilderOps(v)

  implicit def toRepositoryOps(v: Repository): RepositoryOps = new RepositoryOps(v)

}
