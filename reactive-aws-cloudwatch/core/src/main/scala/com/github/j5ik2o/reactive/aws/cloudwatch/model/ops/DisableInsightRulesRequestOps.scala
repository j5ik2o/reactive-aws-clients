// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class DisableInsightRulesRequestBuilderOps(val self: DisableInsightRulesRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNamesAsScala(value: Option[Seq[String]]): DisableInsightRulesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.ruleNames(v.asJava)
    }
  }

}

final class DisableInsightRulesRequestOps(val self: DisableInsightRulesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def ruleNamesAsScala: Option[Seq[String]] =
    Option(self.ruleNames).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDisableInsightRulesRequestOps {

  implicit def toDisableInsightRulesRequestBuilderOps(
      v: DisableInsightRulesRequest.Builder
  ): DisableInsightRulesRequestBuilderOps = new DisableInsightRulesRequestBuilderOps(v)

  implicit def toDisableInsightRulesRequestOps(v: DisableInsightRulesRequest): DisableInsightRulesRequestOps =
    new DisableInsightRulesRequestOps(v)

}
