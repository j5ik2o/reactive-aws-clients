// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetLifecyclePolicyPreviewRequestBuilderOps(val self: GetLifecyclePolicyPreviewRequest.Builder)
    extends AnyVal {

  final def registryIdAsScala(value: Option[String]): GetLifecyclePolicyPreviewRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): GetLifecyclePolicyPreviewRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def imageIdsAsScala(value: Option[Seq[ImageIdentifier]]): GetLifecyclePolicyPreviewRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.imageIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetLifecyclePolicyPreviewRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): GetLifecyclePolicyPreviewRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def filterAsScala(value: Option[LifecyclePolicyPreviewFilter]): GetLifecyclePolicyPreviewRequest.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

}

final class GetLifecyclePolicyPreviewRequestOps(val self: GetLifecyclePolicyPreviewRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def imageIdsAsScala: Option[Seq[ImageIdentifier]] = Option(self.imageIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def filterAsScala: Option[LifecyclePolicyPreviewFilter] = Option(self.filter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLifecyclePolicyPreviewRequestOps {

  implicit def toGetLifecyclePolicyPreviewRequestBuilderOps(
      v: GetLifecyclePolicyPreviewRequest.Builder
  ): GetLifecyclePolicyPreviewRequestBuilderOps = new GetLifecyclePolicyPreviewRequestBuilderOps(v)

  implicit def toGetLifecyclePolicyPreviewRequestOps(
      v: GetLifecyclePolicyPreviewRequest
  ): GetLifecyclePolicyPreviewRequestOps = new GetLifecyclePolicyPreviewRequestOps(v)

}
