// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AliasRoutingConfigurationBuilderOps(val self: AliasRoutingConfiguration.Builder) extends AnyVal {

  final def additionalVersionWeightsAsScala(value: Option[Map[String, Double]]): AliasRoutingConfiguration.Builder = {
    value.filter(_.nonEmpty).map(_.mapValues(_.asInstanceOf[java.lang.Double])).fold(self) { v =>
      import scala.collection.JavaConverters._; self.additionalVersionWeights(v.asJava)
    }
  }

}

final class AliasRoutingConfigurationOps(val self: AliasRoutingConfiguration) extends AnyVal {

  final def additionalVersionWeightsAsScala: Option[Map[String, Double]] = Option(self.additionalVersionWeights).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap.mapValues(_.doubleValue())
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAliasRoutingConfigurationOps {

  implicit def toAliasRoutingConfigurationBuilderOps(
      v: AliasRoutingConfiguration.Builder
  ): AliasRoutingConfigurationBuilderOps = new AliasRoutingConfigurationBuilderOps(v)

  implicit def toAliasRoutingConfigurationOps(v: AliasRoutingConfiguration): AliasRoutingConfigurationOps =
    new AliasRoutingConfigurationOps(v)

}
