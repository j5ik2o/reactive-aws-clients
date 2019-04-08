// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateTagSpecificationRequestBuilderOps(val self: LaunchTemplateTagSpecificationRequest.Builder)
    extends AnyVal {

  final def resourceTypeAsScala(value: Option[ResourceType]): LaunchTemplateTagSpecificationRequest.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): LaunchTemplateTagSpecificationRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class LaunchTemplateTagSpecificationRequestOps(val self: LaunchTemplateTagSpecificationRequest) extends AnyVal {

  final def resourceTypeAsScala: Option[ResourceType] = Option(self.resourceType)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateTagSpecificationRequestOps {

  implicit def toLaunchTemplateTagSpecificationRequestBuilderOps(
      v: LaunchTemplateTagSpecificationRequest.Builder
  ): LaunchTemplateTagSpecificationRequestBuilderOps = new LaunchTemplateTagSpecificationRequestBuilderOps(v)

  implicit def toLaunchTemplateTagSpecificationRequestOps(
      v: LaunchTemplateTagSpecificationRequest
  ): LaunchTemplateTagSpecificationRequestOps = new LaunchTemplateTagSpecificationRequestOps(v)

}
