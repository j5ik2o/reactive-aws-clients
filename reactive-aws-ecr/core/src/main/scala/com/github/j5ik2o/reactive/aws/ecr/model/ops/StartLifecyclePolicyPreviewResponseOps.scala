// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class StartLifecyclePolicyPreviewResponseBuilderOps(val self: StartLifecyclePolicyPreviewResponse.Builder)
    extends AnyVal {

  final def registryIdAsScala(value: Option[String]): StartLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): StartLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def lifecyclePolicyTextAsScala(value: Option[String]): StartLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.lifecyclePolicyText(v)
    }
  }

  final def statusAsScala(value: Option[LifecyclePolicyPreviewStatus]): StartLifecyclePolicyPreviewResponse.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

}

final class StartLifecyclePolicyPreviewResponseOps(val self: StartLifecyclePolicyPreviewResponse) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def lifecyclePolicyTextAsScala: Option[String] = Option(self.lifecyclePolicyText)

  final def statusAsScala: Option[LifecyclePolicyPreviewStatus] = Option(self.status)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStartLifecyclePolicyPreviewResponseOps {

  implicit def toStartLifecyclePolicyPreviewResponseBuilderOps(
      v: StartLifecyclePolicyPreviewResponse.Builder
  ): StartLifecyclePolicyPreviewResponseBuilderOps = new StartLifecyclePolicyPreviewResponseBuilderOps(v)

  implicit def toStartLifecyclePolicyPreviewResponseOps(
      v: StartLifecyclePolicyPreviewResponse
  ): StartLifecyclePolicyPreviewResponseOps = new StartLifecyclePolicyPreviewResponseOps(v)

}
