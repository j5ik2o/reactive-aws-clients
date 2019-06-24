// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class BatchGetImageRequestBuilderOps(val self: BatchGetImageRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): BatchGetImageRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): BatchGetImageRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdsAsScala(value: Option[Seq[ImageIdentifier]]): BatchGetImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.imageIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptedMediaTypesAsScala(value: Option[Seq[String]]): BatchGetImageRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.acceptedMediaTypes(v.asJava)
    }
  }

}

final class BatchGetImageRequestOps(val self: BatchGetImageRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def imageIdsAsScala: Option[Seq[ImageIdentifier]] = Option(self.imageIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def acceptedMediaTypesAsScala: Option[Seq[String]] = Option(self.acceptedMediaTypes).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToBatchGetImageRequestOps {

  implicit def toBatchGetImageRequestBuilderOps(v: BatchGetImageRequest.Builder): BatchGetImageRequestBuilderOps =
    new BatchGetImageRequestBuilderOps(v)

  implicit def toBatchGetImageRequestOps(v: BatchGetImageRequest): BatchGetImageRequestOps =
    new BatchGetImageRequestOps(v)

}
