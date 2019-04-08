// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DeleteLifecyclePolicyResponseBuilderOps(val self: DeleteLifecyclePolicyResponse.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): DeleteLifecyclePolicyResponse.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): DeleteLifecyclePolicyResponse.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def lifecyclePolicyTextAsScala(value: Option[String]): DeleteLifecyclePolicyResponse.Builder = {
    value.fold(self) { v =>
      self.lifecyclePolicyText(v)
    }
  }

  final def lastEvaluatedAtAsScala(value: Option[java.time.Instant]): DeleteLifecyclePolicyResponse.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedAt(v)
    }
  }

}

final class DeleteLifecyclePolicyResponseOps(val self: DeleteLifecyclePolicyResponse) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def lifecyclePolicyTextAsScala: Option[String] = Option(self.lifecyclePolicyText)

  final def lastEvaluatedAtAsScala: Option[java.time.Instant] = Option(self.lastEvaluatedAt)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLifecyclePolicyResponseOps {

  implicit def toDeleteLifecyclePolicyResponseBuilderOps(
      v: DeleteLifecyclePolicyResponse.Builder
  ): DeleteLifecyclePolicyResponseBuilderOps = new DeleteLifecyclePolicyResponseBuilderOps(v)

  implicit def toDeleteLifecyclePolicyResponseOps(v: DeleteLifecyclePolicyResponse): DeleteLifecyclePolicyResponseOps =
    new DeleteLifecyclePolicyResponseOps(v)

}
