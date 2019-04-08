// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class PublishVersionRequestBuilderOps(val self: PublishVersionRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  } // String

  final def codeSha256AsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.codeSha256(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def revisionIdAsScala(value: Option[String]): PublishVersionRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  } // String

}

final class PublishVersionRequestOps(val self: PublishVersionRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName) // String

  final def codeSha256AsScala: Option[String] = Option(self.codeSha256) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def revisionIdAsScala: Option[String] = Option(self.revisionId) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPublishVersionRequestOps {

  implicit def toPublishVersionRequestBuilderOps(v: PublishVersionRequest.Builder): PublishVersionRequestBuilderOps =
    new PublishVersionRequestBuilderOps(v)

  implicit def toPublishVersionRequestOps(v: PublishVersionRequest): PublishVersionRequestOps =
    new PublishVersionRequestOps(v)

}
