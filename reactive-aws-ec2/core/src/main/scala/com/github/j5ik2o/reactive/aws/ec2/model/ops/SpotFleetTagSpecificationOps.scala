// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class SpotFleetTagSpecificationBuilderOps(val self: SpotFleetTagSpecification.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[ResourceType]): SpotFleetTagSpecification.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): SpotFleetTagSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class SpotFleetTagSpecificationOps(val self: SpotFleetTagSpecification) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[ResourceType] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSpotFleetTagSpecificationOps {

  implicit def toSpotFleetTagSpecificationBuilderOps(
      v: SpotFleetTagSpecification.Builder
  ): SpotFleetTagSpecificationBuilderOps = new SpotFleetTagSpecificationBuilderOps(v)

  implicit def toSpotFleetTagSpecificationOps(v: SpotFleetTagSpecification): SpotFleetTagSpecificationOps =
    new SpotFleetTagSpecificationOps(v)

}
