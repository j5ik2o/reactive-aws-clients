// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TagDescriptionBuilderOps(val self: TagDescription.Builder) extends AnyVal {

  final def keyAsScala(value: Option[String]): TagDescription.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def resourceIdAsScala(value: Option[String]): TagDescription.Builder = {
    value.fold(self) { v =>
      self.resourceId(v)
    }
  }

  final def resourceTypeAsScala(value: Option[ResourceType]): TagDescription.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def valueAsScala(value: Option[String]): TagDescription.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class TagDescriptionOps(val self: TagDescription) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key)

  final def resourceIdAsScala: Option[String] = Option(self.resourceId)

  final def resourceTypeAsScala: Option[ResourceType] = Option(self.resourceType)

  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagDescriptionOps {

  implicit def toTagDescriptionBuilderOps(v: TagDescription.Builder): TagDescriptionBuilderOps =
    new TagDescriptionBuilderOps(v)

  implicit def toTagDescriptionOps(v: TagDescription): TagDescriptionOps = new TagDescriptionOps(v)

}
