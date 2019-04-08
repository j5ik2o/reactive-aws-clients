// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class ValidateTemplateResponseBuilderOps(val self: ValidateTemplateResponse.Builder) extends AnyVal {

  final def parametersAsScala(value: Option[Seq[TemplateParameter]]): ValidateTemplateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parameters(v.asJava)
    } // Seq[TemplateParameter]
  }

  final def descriptionAsScala(value: Option[String]): ValidateTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  } // String

  final def capabilitiesAsScala(value: Option[Seq[Capability]]): ValidateTemplateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.capabilities(v.asJava)
    } // Seq[Capability]
  }

  final def capabilitiesReasonAsScala(value: Option[String]): ValidateTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.capabilitiesReason(v)
    }
  } // String

  final def declaredTransformsAsScala(value: Option[Seq[String]]): ValidateTemplateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.declaredTransforms(v.asJava)
    } // Seq[String]
  }

}

final class ValidateTemplateResponseOps(val self: ValidateTemplateResponse) extends AnyVal {

  final def parametersAsScala: Option[Seq[TemplateParameter]] = Option(self.parameters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[TemplateParameter]

  final def descriptionAsScala: Option[String] = Option(self.description) // String

  final def capabilitiesAsScala: Option[Seq[Capability]] = Option(self.capabilities).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Capability]

  final def capabilitiesReasonAsScala: Option[String] = Option(self.capabilitiesReason) // String

  final def declaredTransformsAsScala: Option[Seq[String]] = Option(self.declaredTransforms).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToValidateTemplateResponseOps {

  implicit def toValidateTemplateResponseBuilderOps(
      v: ValidateTemplateResponse.Builder
  ): ValidateTemplateResponseBuilderOps = new ValidateTemplateResponseBuilderOps(v)

  implicit def toValidateTemplateResponseOps(v: ValidateTemplateResponse): ValidateTemplateResponseOps =
    new ValidateTemplateResponseOps(v)

}
