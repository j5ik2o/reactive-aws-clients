// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LaunchTemplateTagSpecificationBuilderOps(val self: LaunchTemplateTagSpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[ResourceType]): LaunchTemplateTagSpecification.Builder = {
    value.fold(self) { v => self.resourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): LaunchTemplateTagSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class LaunchTemplateTagSpecificationOps(val self: LaunchTemplateTagSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[ResourceType] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLaunchTemplateTagSpecificationOps {

  implicit def toLaunchTemplateTagSpecificationBuilderOps(
      v: LaunchTemplateTagSpecification.Builder
  ): LaunchTemplateTagSpecificationBuilderOps = new LaunchTemplateTagSpecificationBuilderOps(v)

  implicit def toLaunchTemplateTagSpecificationOps(
      v: LaunchTemplateTagSpecification
  ): LaunchTemplateTagSpecificationOps = new LaunchTemplateTagSpecificationOps(v)

}
