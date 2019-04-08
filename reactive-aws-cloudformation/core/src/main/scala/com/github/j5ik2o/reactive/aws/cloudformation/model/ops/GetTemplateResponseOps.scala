// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class GetTemplateResponseBuilderOps(val self: GetTemplateResponse.Builder) extends AnyVal {

  final def templateBodyAsScala(value: Option[String]): GetTemplateResponse.Builder = {
    value.fold(self) { v =>
      self.templateBody(v)
    }
  } // String

  final def stagesAvailableAsScala(value: Option[Seq[TemplateStage]]): GetTemplateResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.stagesAvailable(v.asJava)
    } // Seq[TemplateStage]
  }

}

final class GetTemplateResponseOps(val self: GetTemplateResponse) extends AnyVal {

  final def templateBodyAsScala: Option[String] = Option(self.templateBody) // String

  final def stagesAvailableAsScala: Option[Seq[TemplateStage]] = Option(self.stagesAvailable).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[TemplateStage]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetTemplateResponseOps {

  implicit def toGetTemplateResponseBuilderOps(v: GetTemplateResponse.Builder): GetTemplateResponseBuilderOps =
    new GetTemplateResponseBuilderOps(v)

  implicit def toGetTemplateResponseOps(v: GetTemplateResponse): GetTemplateResponseOps = new GetTemplateResponseOps(v)

}
