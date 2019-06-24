// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ComposeEnvironmentsRequestBuilderOps(val self: ComposeEnvironmentsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala(value: Option[String]): ComposeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.applicationName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala(value: Option[String]): ComposeEnvironmentsRequest.Builder = {
    value.fold(self) { v =>
      self.groupName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelsAsScala(value: Option[Seq[String]]): ComposeEnvironmentsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.versionLabels(v.asJava)
    }
  }

}

final class ComposeEnvironmentsRequestOps(val self: ComposeEnvironmentsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def applicationNameAsScala: Option[String] = Option(self.applicationName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def groupNameAsScala: Option[String] = Option(self.groupName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionLabelsAsScala: Option[Seq[String]] = Option(self.versionLabels).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToComposeEnvironmentsRequestOps {

  implicit def toComposeEnvironmentsRequestBuilderOps(
      v: ComposeEnvironmentsRequest.Builder
  ): ComposeEnvironmentsRequestBuilderOps = new ComposeEnvironmentsRequestBuilderOps(v)

  implicit def toComposeEnvironmentsRequestOps(v: ComposeEnvironmentsRequest): ComposeEnvironmentsRequestOps =
    new ComposeEnvironmentsRequestOps(v)

}
