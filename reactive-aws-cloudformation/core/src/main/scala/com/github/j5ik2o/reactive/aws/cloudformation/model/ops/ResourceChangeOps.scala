// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ResourceChangeBuilderOps(val self: ResourceChange.Builder) extends AnyVal {

  final def actionAsScala(value: Option[ChangeAction]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  }

  final def logicalResourceIdAsScala(value: Option[String]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  final def physicalResourceIdAsScala(value: Option[String]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  }

  final def resourceTypeAsScala(value: Option[String]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  final def replacementAsScala(value: Option[Replacement]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.replacement(v)
    }
  }

  final def scopeAsScala(value: Option[Seq[ResourceAttribute]]): ResourceChange.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.scope(v.asJava)
    }
  }

  final def detailsAsScala(value: Option[Seq[ResourceChangeDetail]]): ResourceChange.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.details(v.asJava)
    }
  }

}

final class ResourceChangeOps(val self: ResourceChange) extends AnyVal {

  final def actionAsScala: Option[ChangeAction] = Option(self.action)

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  final def replacementAsScala: Option[Replacement] = Option(self.replacement)

  final def scopeAsScala: Option[Seq[ResourceAttribute]] = Option(self.scope).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def detailsAsScala: Option[Seq[ResourceChangeDetail]] = Option(self.details).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceChangeOps {

  implicit def toResourceChangeBuilderOps(v: ResourceChange.Builder): ResourceChangeBuilderOps =
    new ResourceChangeBuilderOps(v)

  implicit def toResourceChangeOps(v: ResourceChange): ResourceChangeOps = new ResourceChangeOps(v)

}
