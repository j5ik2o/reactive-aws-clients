// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class HumanLoopActivationOutputBuilderOps(val self: HumanLoopActivationOutput.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopArnAsScala(value: Option[String]): HumanLoopActivationOutput.Builder = {
    value.fold(self) { v => self.humanLoopArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopActivationReasonsAsScala(value: Option[Seq[String]]): HumanLoopActivationOutput.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.humanLoopActivationReasons(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopActivationConditionsEvaluationResultsAsScala(
      value: Option[String]
  ): HumanLoopActivationOutput.Builder = {
    value.fold(self) { v => self.humanLoopActivationConditionsEvaluationResults(v) }
  }

}

final class HumanLoopActivationOutputOps(val self: HumanLoopActivationOutput) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopArnAsScala: Option[String] = Option(self.humanLoopArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopActivationReasonsAsScala: Option[Seq[String]] =
    Option(self.humanLoopActivationReasons).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def humanLoopActivationConditionsEvaluationResultsAsScala: Option[String] =
    Option(self.humanLoopActivationConditionsEvaluationResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHumanLoopActivationOutputOps {

  implicit def toHumanLoopActivationOutputBuilderOps(
      v: HumanLoopActivationOutput.Builder
  ): HumanLoopActivationOutputBuilderOps = new HumanLoopActivationOutputBuilderOps(v)

  implicit def toHumanLoopActivationOutputOps(v: HumanLoopActivationOutput): HumanLoopActivationOutputOps =
    new HumanLoopActivationOutputOps(v)

}
