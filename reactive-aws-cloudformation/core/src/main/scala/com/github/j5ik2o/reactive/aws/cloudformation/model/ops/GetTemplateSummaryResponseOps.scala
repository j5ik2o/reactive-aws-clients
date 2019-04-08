// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class GetTemplateSummaryResponseBuilderOps(val self: GetTemplateSummaryResponse.Builder) extends AnyVal {

  final def parametersAsScala(value: Option[Seq[ParameterDeclaration]]): GetTemplateSummaryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    }
  }

  final def descriptionAsScala(value: Option[String]): GetTemplateSummaryResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): GetTemplateSummaryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    }
  }

  final def capabilitiesReasonAsScala(value: Option[String]): GetTemplateSummaryResponse.Builder = {
    value.fold(self) { v =>
      self.capabilitiesReason(v)
    }
  }

  final def resourceTypesAsScala(value: Option[Seq[String]]): GetTemplateSummaryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.resourceTypes(v.asJava)
    }
  }

  final def versionAsScala(value: Option[String]): GetTemplateSummaryResponse.Builder = {
    value.fold(self) { v =>
      self.version(v)
    }
  }

  final def metadataAsScala(value: Option[String]): GetTemplateSummaryResponse.Builder = {
    value.fold(self) { v =>
      self.metadata(v)
    }
  }

  final def declaredTransformsAsScala(value: Option[Seq[String]]): GetTemplateSummaryResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.declaredTransforms(v.asJava)
    }
  }

}

final class GetTemplateSummaryResponseOps(val self: GetTemplateSummaryResponse) extends AnyVal {

  final def parametersAsScala: Option[Seq[ParameterDeclaration]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def capabilitiesReasonAsScala: Option[String] = Option(self.capabilitiesReason)

  final def resourceTypesAsScala: Option[Seq[String]] = Option(self.resourceTypes).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def versionAsScala: Option[String] = Option(self.version)

  final def metadataAsScala: Option[String] = Option(self.metadata)

  final def declaredTransformsAsScala: Option[Seq[String]] = Option(self.declaredTransforms).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTemplateSummaryResponseOps {

  implicit def toGetTemplateSummaryResponseBuilderOps(
      v: GetTemplateSummaryResponse.Builder
  ): GetTemplateSummaryResponseBuilderOps = new GetTemplateSummaryResponseBuilderOps(v)

  implicit def toGetTemplateSummaryResponseOps(v: GetTemplateSummaryResponse): GetTemplateSummaryResponseOps =
    new GetTemplateSummaryResponseOps(v)

}
