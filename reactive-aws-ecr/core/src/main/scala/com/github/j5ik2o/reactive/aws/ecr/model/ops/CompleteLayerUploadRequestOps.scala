// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class CompleteLayerUploadRequestBuilderOps(val self: CompleteLayerUploadRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): CompleteLayerUploadRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): CompleteLayerUploadRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def uploadIdAsScala(value: Option[String]): CompleteLayerUploadRequest.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  }

  final def layerDigestsAsScala(value: Option[Seq[String]]): CompleteLayerUploadRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.layerDigests(v.asJava)
    }
  }

}

final class CompleteLayerUploadRequestOps(val self: CompleteLayerUploadRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def uploadIdAsScala: Option[String] = Option(self.uploadId)

  final def layerDigestsAsScala: Option[Seq[String]] = Option(self.layerDigests).map { v =>
    import scala.collection.JavaConverters._; v.asScala
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
