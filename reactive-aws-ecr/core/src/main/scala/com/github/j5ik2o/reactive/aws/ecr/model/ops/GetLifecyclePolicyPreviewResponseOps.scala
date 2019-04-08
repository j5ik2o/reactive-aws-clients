// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetLifecyclePolicyPreviewResponseBuilderOps(val self: GetLifecyclePolicyPreviewResponse.Builder)
    extends AnyVal {

  final def registryIdAsScala(value: Option[String]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def lifecyclePolicyTextAsScala(value: Option[String]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.lifecyclePolicyText(v)
    }
  }

  final def statusAsScala(value: Option[LifecyclePolicyPreviewStatus]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def previewResultsAsScala(
      value: Option[Seq[LifecyclePolicyPreviewResult]]
  ): GetLifecyclePolicyPreviewResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.previewResults(v.asJava)
    }
  }

  final def summaryAsScala(value: Option[LifecyclePolicyPreviewSummary]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.summary(v)
    }
  }

}

final class GetLifecyclePolicyPreviewResponseOps(val self: GetLifecyclePolicyPreviewResponse) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def lifecyclePolicyTextAsScala: Option[String] = Option(self.lifecyclePolicyText)

  final def statusAsScala: Option[LifecyclePolicyPreviewStatus] = Option(self.status)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def previewResultsAsScala: Option[Seq[LifecyclePolicyPreviewResult]] = Option(self.previewResults).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def summaryAsScala: Option[LifecyclePolicyPreviewSummary] = Option(self.summary)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetLifecyclePolicyPreviewResponseOps {

  implicit def toGetLifecyclePolicyPreviewResponseBuilderOps(
      v: GetLifecyclePolicyPreviewResponse.Builder
  ): GetLifecyclePolicyPreviewResponseBuilderOps = new GetLifecyclePolicyPreviewResponseBuilderOps(v)

  implicit def toGetLifecyclePolicyPreviewResponseOps(
      v: GetLifecyclePolicyPreviewResponse
  ): GetLifecyclePolicyPreviewResponseOps = new GetLifecyclePolicyPreviewResponseOps(v)

}
