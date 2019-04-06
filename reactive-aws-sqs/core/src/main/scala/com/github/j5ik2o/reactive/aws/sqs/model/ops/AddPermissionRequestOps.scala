// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class AddPermissionRequestBuilderOps(val self: AddPermissionRequest.Builder) extends AnyVal {

  final def withQueueUrlAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.queueUrl(v)
    }
  } // String

  final def withLabelAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v =>
      self.label(v)
    }
  } // String

  final def withAwsAccountIdsAsScala(value: Option[Seq[String]]): AddPermissionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.awsAccountIds(v.asJava)
    } // Seq[String]
  }

  final def withActionsAsScala(value: Option[Seq[String]]): AddPermissionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.actions(v.asJava)
    } // Seq[String]
  }

}

final class AddPermissionRequestOps(val self: AddPermissionRequest) extends AnyVal {

  final def queueUrlAsScala: Option[String] = Option(self.queueUrl) // String

  final def labelAsScala: Option[String] = Option(self.label) // String

  final def awsAccountIdsAsScala: Option[Seq[String]] = Option(self.awsAccountIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def actionsAsScala: Option[Seq[String]] = Option(self.actions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddPermissionRequestOps {

  implicit def toAddPermissionRequestBuilderOps(v: AddPermissionRequest.Builder): AddPermissionRequestBuilderOps =
    new AddPermissionRequestBuilderOps(v)

  implicit def toAddPermissionRequestOps(v: AddPermissionRequest): AddPermissionRequestOps =
    new AddPermissionRequestOps(v)

}
