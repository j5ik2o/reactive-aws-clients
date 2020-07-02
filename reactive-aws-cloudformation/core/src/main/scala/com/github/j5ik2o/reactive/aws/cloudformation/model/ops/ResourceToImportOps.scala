// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ResourceToImportBuilderOps(val self: ResourceToImport.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[String]): ResourceToImport.Builder = {
    value.fold(self) { v => self.resourceType(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala(value: Option[String]): ResourceToImport.Builder = {
    value.fold(self) { v => self.logicalResourceId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdentifierAsScala(value: Option[Map[String, String]]): ResourceToImport.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceIdentifier(v.asJava)
    }
  }

}

final class ResourceToImportOps(val self: ResourceToImport) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdAsScala: Option[String] = Option(self.logicalResourceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdentifierAsScala: Option[Map[String, String]] =
    Option(self.resourceIdentifier).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceToImportOps {

  implicit def toResourceToImportBuilderOps(v: ResourceToImport.Builder): ResourceToImportBuilderOps =
    new ResourceToImportBuilderOps(v)

  implicit def toResourceToImportOps(v: ResourceToImport): ResourceToImportOps = new ResourceToImportOps(v)

}
