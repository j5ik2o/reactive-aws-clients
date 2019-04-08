// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class AddPermissionRequestBuilderOps(val self: AddPermissionRequest.Builder) extends AnyVal {

  final def queueUrlAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  }

  final def labelAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  }

  final def awsAccountIdsAsScala(value: Option[Seq[String]]): AddPermissionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.awsAccountIds(v.asJava)
    }
  }

  final def actionsAsScala(value: Option[Seq[String]]): AddPermissionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.actions(v.asJava)
    }
  }

}

final class AddPermissionRequestOps(val self: AddPermissionRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  final def labelAsScala: Option[String] = Option(self.label)

  final def awsAccountIdsAsScala: Option[Seq[String]] = Option(self.awsAccountIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def actionsAsScala: Option[Seq[String]] = Option(self.actions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddPermissionRequestOps {

  implicit def toAddPermissionRequestBuilderOps(v: AddPermissionRequest.Builder): AddPermissionRequestBuilderOps =
    new AddPermissionRequestBuilderOps(v)

  implicit def toAddPermissionRequestOps(v: AddPermissionRequest): AddPermissionRequestOps =
    new AddPermissionRequestOps(v)

}
