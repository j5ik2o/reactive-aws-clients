// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class CompleteLayerUploadRequestBuilderOps(val self: CompleteLayerUploadRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): CompleteLayerUploadRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): CompleteLayerUploadRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala(value: Option[String]): CompleteLayerUploadRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerDigestsAsScala(value: Option[Seq[String]]): CompleteLayerUploadRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.layerDigests(v.asJava)
    }
  }

}

final class CompleteLayerUploadRequestOps(val self: CompleteLayerUploadRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def layerDigestsAsScala: Option[Seq[String]] = Option(self.layerDigests).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCompleteLayerUploadRequestOps {

  implicit def toCompleteLayerUploadRequestBuilderOps(
      v: CompleteLayerUploadRequest.Builder
  ): CompleteLayerUploadRequestBuilderOps = new CompleteLayerUploadRequestBuilderOps(v)

  implicit def toCompleteLayerUploadRequestOps(v: CompleteLayerUploadRequest): CompleteLayerUploadRequestOps =
    new CompleteLayerUploadRequestOps(v)

}
