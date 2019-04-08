// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class BatchDeleteImageRequestBuilderOps(val self: BatchDeleteImageRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): BatchDeleteImageRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): BatchDeleteImageRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def imageIdsAsScala(value: Option[Seq[ImageIdentifier]]): BatchDeleteImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.imageIds(v.asJava)
    }
  }

}

final class BatchDeleteImageRequestOps(val self: BatchDeleteImageRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def imageIdsAsScala: Option[Seq[ImageIdentifier]] = Option(self.imageIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchDeleteImageRequestOps {

  implicit def toBatchDeleteImageRequestBuilderOps(
      v: BatchDeleteImageRequest.Builder
  ): BatchDeleteImageRequestBuilderOps = new BatchDeleteImageRequestBuilderOps(v)

  implicit def toBatchDeleteImageRequestOps(v: BatchDeleteImageRequest): BatchDeleteImageRequestOps =
    new BatchDeleteImageRequestOps(v)

}
