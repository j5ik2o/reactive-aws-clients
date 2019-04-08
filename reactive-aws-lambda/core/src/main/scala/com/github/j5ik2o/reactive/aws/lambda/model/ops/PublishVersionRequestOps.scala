// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PublishVersionRequestBuilderOps(val self: PublishVersionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def codeSha256AsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.codeSha256(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class PublishVersionRequestOps(val self: PublishVersionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def codeSha256AsScala: Option[String] = Option(self.codeSha256)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublishVersionRequestOps {

  implicit def toPublishVersionRequestBuilderOps(v: PublishVersionRequest.Builder): PublishVersionRequestBuilderOps =
    new PublishVersionRequestBuilderOps(v)

  implicit def toPublishVersionRequestOps(v: PublishVersionRequest): PublishVersionRequestOps =
    new PublishVersionRequestOps(v)

}
