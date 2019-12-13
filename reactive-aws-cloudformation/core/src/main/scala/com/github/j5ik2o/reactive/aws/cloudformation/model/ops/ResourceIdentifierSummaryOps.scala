// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ResourceIdentifierSummaryBuilderOps(val self: ResourceIdentifierSummary.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala(value: Option[String]): ResourceIdentifierSummary.Builder = {
    value.fold(self) { v =>
      self.resourceType(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdsAsScala(value: Option[Seq[String]]): ResourceIdentifierSummary.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.logicalResourceIds(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdentifiersAsScala(value: Option[Seq[String]]): ResourceIdentifierSummary.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.resourceIdentifiers(v.asJava)
    }
  }

}

final class ResourceIdentifierSummaryOps(val self: ResourceIdentifierSummary) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceTypeAsScala: Option[String] = Option(self.resourceType)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def logicalResourceIdsAsScala: Option[Seq[String]] = Option(self.logicalResourceIds).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def resourceIdentifiersAsScala: Option[Seq[String]] = Option(self.resourceIdentifiers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToResourceIdentifierSummaryOps {

  implicit def toResourceIdentifierSummaryBuilderOps(
      v: ResourceIdentifierSummary.Builder
  ): ResourceIdentifierSummaryBuilderOps = new ResourceIdentifierSummaryBuilderOps(v)

  implicit def toResourceIdentifierSummaryOps(v: ResourceIdentifierSummary): ResourceIdentifierSummaryOps =
    new ResourceIdentifierSummaryOps(v)

}
