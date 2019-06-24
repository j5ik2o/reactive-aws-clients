// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PublishVersionRequestBuilderOps(val self: PublishVersionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSha256AsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.codeSha256(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class PublishVersionRequestOps(val self: PublishVersionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def functionNameAsScala: Option[String] = Option(self.functionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeSha256AsScala: Option[String] = Option(self.codeSha256)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublishVersionRequestOps {

  implicit def toPublishVersionRequestBuilderOps(v: PublishVersionRequest.Builder): PublishVersionRequestBuilderOps =
    new PublishVersionRequestBuilderOps(v)

  implicit def toPublishVersionRequestOps(v: PublishVersionRequest): PublishVersionRequestOps =
    new PublishVersionRequestOps(v)

}
