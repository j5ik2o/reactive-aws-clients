// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TagSpecificationBuilderOps(val self: TagSpecification.Builder) extends AnyVal {

  final def resourceTypeAsScala(value: Option[ResourceType]): TagSpecification.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def tagsAsScala(value: Option[Seq[Tag]]): TagSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class TagSpecificationOps(val self: TagSpecification) extends AnyVal {

  final def resourceTypeAsScala: Option[ResourceType] = Option(self.resourceType)

  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagSpecificationOps {

  implicit def toTagSpecificationBuilderOps(v: TagSpecification.Builder): TagSpecificationBuilderOps =
    new TagSpecificationBuilderOps(v)

  implicit def toTagSpecificationOps(v: TagSpecification): TagSpecificationOps = new TagSpecificationOps(v)

}
