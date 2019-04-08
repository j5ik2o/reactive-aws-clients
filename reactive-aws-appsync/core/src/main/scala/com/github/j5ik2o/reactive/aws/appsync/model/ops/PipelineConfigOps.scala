// Auto-Generated
package com.github.j5ik2o.reactive.aws.appsync.model.ops

import software.amazon.awssdk.services.appsync.model._

final class PipelineConfigBuilderOps(val self: PipelineConfig.Builder) extends AnyVal {

  final def functionsAsScala(value: Option[Seq[String]]): PipelineConfig.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.functions(v.asJava)
    } // Seq[String]
  }

}

final class PipelineConfigOps(val self: PipelineConfig) extends AnyVal {

  final def functionsAsScala: Option[Seq[String]] = Option(self.functions).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPipelineConfigOps {

  implicit def toPipelineConfigBuilderOps(v: PipelineConfig.Builder): PipelineConfigBuilderOps =
    new PipelineConfigBuilderOps(v)

  implicit def toPipelineConfigOps(v: PipelineConfig): PipelineConfigOps = new PipelineConfigOps(v)

}
