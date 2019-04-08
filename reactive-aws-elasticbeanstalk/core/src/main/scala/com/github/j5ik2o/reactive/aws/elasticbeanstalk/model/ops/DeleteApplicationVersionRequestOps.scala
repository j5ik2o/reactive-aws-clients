// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DeleteApplicationVersionRequestBuilderOps(val self: DeleteApplicationVersionRequest.Builder)
    extends AnyVal {

  final def applicationNameAsScala(value: Option[String]): DeleteApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  final def versionLabelAsScala(value: Option[String]): DeleteApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.versionLabel(v)
    }
  }

  final def deleteSourceBundleAsScala(value: Option[Boolean]): DeleteApplicationVersionRequest.Builder = {
    value.fold(self) { v =>
      self.deleteSourceBundle(v)
    }
  }

}

final class DeleteApplicationVersionRequestOps(val self: DeleteApplicationVersionRequest) extends AnyVal {

  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  final def versionLabelAsScala: Option[String] = Option(self.versionLabel)

  final def deleteSourceBundleAsScala: Option[Boolean] = Option(self.deleteSourceBundle)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteApplicationVersionRequestOps {

  implicit def toDeleteApplicationVersionRequestBuilderOps(
      v: DeleteApplicationVersionRequest.Builder
  ): DeleteApplicationVersionRequestBuilderOps = new DeleteApplicationVersionRequestBuilderOps(v)

  implicit def toDeleteApplicationVersionRequestOps(
      v: DeleteApplicationVersionRequest
  ): DeleteApplicationVersionRequestOps = new DeleteApplicationVersionRequestOps(v)

}
