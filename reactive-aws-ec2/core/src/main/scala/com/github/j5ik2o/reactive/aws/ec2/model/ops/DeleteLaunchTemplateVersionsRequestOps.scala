// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DeleteLaunchTemplateVersionsRequestBuilderOps(val self: DeleteLaunchTemplateVersionsRequest.Builder)
    extends AnyVal {

  final def launchTemplateIdAsScala(value: Option[String]): DeleteLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateId(v)
    }
  }

  final def launchTemplateNameAsScala(value: Option[String]): DeleteLaunchTemplateVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.launchTemplateName(v)
    }
  }

  final def versionsAsScala(value: Option[Seq[String]]): DeleteLaunchTemplateVersionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.versions(v.asJava)
    }
  }

}

final class DeleteLaunchTemplateVersionsRequestOps(val self: DeleteLaunchTemplateVersionsRequest) extends AnyVal {

  final def launchTemplateIdAsScala: Option[String] = Option(self.launchTemplateId)

  final def launchTemplateNameAsScala: Option[String] = Option(self.launchTemplateName)

  final def versionsAsScala: Option[Seq[String]] = Option(self.versions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteLaunchTemplateVersionsRequestOps {

  implicit def toDeleteLaunchTemplateVersionsRequestBuilderOps(
      v: DeleteLaunchTemplateVersionsRequest.Builder
  ): DeleteLaunchTemplateVersionsRequestBuilderOps = new DeleteLaunchTemplateVersionsRequestBuilderOps(v)

  implicit def toDeleteLaunchTemplateVersionsRequestOps(
      v: DeleteLaunchTemplateVersionsRequest
  ): DeleteLaunchTemplateVersionsRequestOps = new DeleteLaunchTemplateVersionsRequestOps(v)

}
