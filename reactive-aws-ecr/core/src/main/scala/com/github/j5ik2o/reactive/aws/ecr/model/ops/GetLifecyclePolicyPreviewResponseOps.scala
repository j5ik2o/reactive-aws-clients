// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class GetLifecyclePolicyPreviewResponseBuilderOps(val self: GetLifecyclePolicyPreviewResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala(value: Option[String]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.registryId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala(value: Option[String]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.repositoryName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala(value: Option[String]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.lifecyclePolicyText(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[LifecyclePolicyPreviewStatus]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previewResultsAsScala(
      value: Option[Seq[LifecyclePolicyPreviewResult]]
  ): GetLifecyclePolicyPreviewResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.previewResults(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def summaryAsScala(value: Option[LifecyclePolicyPreviewSummary]): GetLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v => self.summary(v) }
  }

}

final class GetLifecyclePolicyPreviewResponseOps(val self: GetLifecyclePolicyPreviewResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def registryIdAsScala: Option[String] = Option(self.registryId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def lifecyclePolicyTextAsScala: Option[String] = Option(self.lifecyclePolicyText)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[LifecyclePolicyPreviewStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def previewResultsAsScala: Option[Seq[LifecyclePolicyPreviewResult]] =
    Option(self.previewResults).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
