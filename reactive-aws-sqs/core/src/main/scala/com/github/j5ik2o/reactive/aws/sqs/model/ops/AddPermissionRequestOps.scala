// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class AddPermissionRequestBuilderOps(val self: AddPermissionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.queueUrl(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala(value: Option[String]): AddPermissionRequest.Builder = {
    value.fold(self) { v => self.label(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsAccountIdsAsScala(value: Option[Seq[String]]): AddPermissionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.awsAccountIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsAsScala(value: Option[Seq[String]]): AddPermissionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.actions(v.asJava)
    }
  }

}

final class AddPermissionRequestOps(val self: AddPermissionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queueUrlAsScala: Option[String] = Option(self.queueUrl)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def labelAsScala: Option[String] = Option(self.label)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def awsAccountIdsAsScala: Option[Seq[String]] =
    Option(self.awsAccountIds).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsAsScala: Option[Seq[String]] =
    Option(self.actions).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAddPermissionRequestOps {

  implicit def toAddPermissionRequestBuilderOps(v: AddPermissionRequest.Builder): AddPermissionRequestBuilderOps =
    new AddPermissionRequestBuilderOps(v)

  implicit def toAddPermissionRequestOps(v: AddPermissionRequest): AddPermissionRequestOps =
    new AddPermissionRequestOps(v)

}
