// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class UpdateApplicationVersionRequestBuilderOps(val self: UpdateApplicationVersionRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): UpdateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  } // String

  final def versionLabelAsScala(value: Option[String]): UpdateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  } // String

  final def descriptionAsScala(value: Option[String]): UpdateApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

}

final class UpdateApplicationVersionRequestOps(val self: UpdateApplicationVersionRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName) // String

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel) // String

  final def descriptionAsScala: Option[String] = Option(self.description) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateApplicationVersionRequestOps {

  implicit def toUpdateApplicationVersionRequestBuilderOps(
      v: UpdateApplicationVersionRequest.Builder
  ): UpdateApplicationVersionRequestBuilderOps = new UpdateApplicationVersionRequestBuilderOps(v)

  implicit def toUpdateApplicationVersionRequestOps(
      v: UpdateApplicationVersionRequest
  ): UpdateApplicationVersionRequestOps = new UpdateApplicationVersionRequestOps(v)

}
