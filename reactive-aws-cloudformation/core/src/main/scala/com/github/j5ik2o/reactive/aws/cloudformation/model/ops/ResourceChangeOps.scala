// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ResourceChangeBuilderOps(val self: ResourceChange.Builder) extends AnyVal {

  final def actionAsScala(value: Option[ChangeAction]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  } // String

  final def logicalResourceIdAsScala(value: Option[String]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  } // String

  final def physicalResourceIdAsScala(value: Option[String]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  } // String

  final def resourceTypeAsScala(value: Option[String]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  } // String

  final def replacementAsScala(value: Option[Replacement]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.replacement(v)
    }
  } // String

  final def scopeAsScala(value: Option[Seq[ResourceAttribute]]): ResourceChange.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.scope(v.asJava)
    } // Seq[String]
  }

  final def detailsAsScala(value: Option[Seq[ResourceChangeDetail]]): ResourceChange.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.details(v.asJava)
    } // Seq[ResourceChangeDetail]
  }

}

final class ResourceChangeOps(val self: ResourceChange) extends AnyVal {

  final def actionAsScala: Option[ChangeAction] = Option(self.action) // String

  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId) // String

  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId) // String

  final def resourceTypeAsScala: Option[String] = Option(self.resourceType) // String

  final def replacementAsScala: Option[Replacement] = Option(self.replacement) // String

  final def scopeAsScala: Option[Seq[ResourceAttribute]] = Option(self.scope).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

  final def detailsAsScala: Option[Seq[ResourceChangeDetail]] = Option(self.details).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ResourceChangeDetail]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceChangeOps {

  implicit def toResourceChangeBuilderOps(v: ResourceChange.Builder): ResourceChangeBuilderOps =
    new ResourceChangeBuilderOps(v)

  implicit def toResourceChangeOps(v: ResourceChange): ResourceChangeOps = new ResourceChangeOps(v)

}
