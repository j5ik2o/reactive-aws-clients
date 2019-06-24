// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ResourceChangeBuilderOps(val self: ResourceChange.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionAsScala(value: Option[ChangeAction]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.action(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala(value: Option[String]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.logicalResourceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdAsScala(value: Option[String]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.physicalResourceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[String]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replacementAsScala(value: Option[Replacement]): ResourceChange.Builder = {
    value.fold(self) { v =>
      self.replacement(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scopeAsScala(value: Option[Seq[ResourceAttribute]]): ResourceChange.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.scope(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detailsAsScala(value: Option[Seq[ResourceChangeDetail]]): ResourceChange.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.details(v.asJava)
    }
  }

}

final class ResourceChangeOps(val self: ResourceChange) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionAsScala: Option[ChangeAction] = Option(self.action)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def physicalResourceIdAsScala: Option[String] = Option(self.physicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def replacementAsScala: Option[Replacement] = Option(self.replacement)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def scopeAsScala: Option[Seq[ResourceAttribute]] = Option(self.scope).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def detailsAsScala: Option[Seq[ResourceChangeDetail]] = Option(self.details).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceChangeOps {

  implicit def toResourceChangeBuilderOps(v: ResourceChange.Builder): ResourceChangeBuilderOps =
    new ResourceChangeBuilderOps(v)

  implicit def toResourceChangeOps(v: ResourceChange): ResourceChangeOps = new ResourceChangeOps(v)

}
