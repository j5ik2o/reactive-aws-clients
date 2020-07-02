// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class AliasRoutingConfigurationBuilderOps(val self: AliasRoutingConfiguration.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def additionalVersionWeightsAsScala(value: Option[Map[String, Double]]): AliasRoutingConfiguration.Builder = {
    value.filter(_.nonEmpty).map(_.view.map { case (k, v) => (k, v.asInstanceOf[java.lang.Double]) }.toMap).fold(self) {
      v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.additionalVersionWeights(v.asJava)
    }
  }

}

final class AliasRoutingConfigurationOps(val self: AliasRoutingConfiguration) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def additionalVersionWeightsAsScala: Option[Map[String, Double]] =
    Option(self.additionalVersionWeights).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._;
      v.asScala.toMap.view.map { case (k, v) => (k, v.doubleValue()) }.toMap
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
